package com.lsl.classforexcel.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import ctd.swagger.annotation.ApiProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Slf4j
public class ExcelUtil {

    private static ExcelUtil excelUtil = new ExcelUtil();

    private final static String outputPath = "D:\\ProgramData\\Excel";

    private Integer rowNum;

    public static void exportEntityToExcel(Class<?> entityClass) {
        String fileName = outputPath + "/" + entityClass.getSimpleName() + ".xlsx";

        try (Workbook workbook = new XSSFWorkbook();
             FileOutputStream fileOut = new FileOutputStream(fileName))
        {
            Sheet sheet = workbook.createSheet(entityClass.getSimpleName());

            // 创建表头
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("名称");
            headerRow.createCell(1).setCellValue("注释");
            headerRow.createCell(2).setCellValue("类型");
            headerRow.createCell(3).setCellValue("长度");
            headerRow.createCell(4).setCellValue("必填");

            // 获取所有字段
            Field[] fields = entityClass.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                Integer rowNum = getRowNum(i,getStaticRowNum());
                Row row = sheet.createRow(rowNum);

                // 设置名称
                row.createCell(0).setCellValue(getFieldName(field));

                // 设置注释（可以根据需要自定义获取注释的方式）
                row.createCell(1).setCellValue(getFieldComment(field));

                // 设置类型
                row.createCell(2).setCellValue(field.getType().getSimpleName());

                // 设置长度
                row.createCell(3).setCellValue("");

                // 设置必填
                row.createCell(4).setCellValue(getFieldRequired(field));

                // 当前行填充以后 需要往下一行
                setStaticRowNum(rowNum);
                checkFieldType(field,sheet);
            }

            // 写入文件
            workbook.write(fileOut);
            log.info("Excel文件已生成: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void ExcelRecursive(Class<?> entityClass,Sheet sheet) {
            // 获取所有字段
            Field[] fields = entityClass.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                Integer rowNumAdd = getRowNum(i,getStaticRowNum());
                Row row = sheet.createRow(rowNumAdd );

                // 设置名称
                row.createCell(0).setCellValue(getFieldName(field));

                // 设置注释（可以根据需要自定义获取注释的方式）
                row.createCell(1).setCellValue(getFieldComment(field));

                // 设置类型
                row.createCell(2).setCellValue(field.getType().getSimpleName());

                // 设置长度
                row.createCell(3).setCellValue("");

                // 设置必填
                row.createCell(4).setCellValue(getFieldRequired(field));

                // 当前行填充以后 需要往下一行
                setStaticRowNum(row.getRowNum());

                checkFieldType(field,sheet);
            }
            // 当前行填充以后 需要往下一行
            setStaticRowNum(getRowNum(1,getStaticRowNum()));

            // 写入文件
            log.info("Excel递归文件往里写: ");
    }

    /****
     * 1. 获取 字段的名称
     * @param field
     * @return
     */
    private static String getFieldName(Field field) {
        String fieldName = "";
        // 这里可以根据需要自定义获取字段注释的逻辑
        if (field.isAnnotationPresent(XStreamAlias.class)) {
            XStreamAlias apiProperty = field.getAnnotation(XStreamAlias.class);
            fieldName = apiProperty.value();
        }else {
            fieldName = field.getName();
        }

        // 例如使用注解等
        // 返回空字符串，您可以根据需要修改
        return "<"+fieldName+"/>";
    }

    /***
     * 2. 获取 字段的注释
     * @param field
     * @return
     */
    private static String getFieldComment(Field field) {
        String fieldComment = "";
        // 这里可以根据需要自定义获取字段注释的逻辑
        if (field.isAnnotationPresent(ApiProperty.class)) {
            ApiProperty xStreamAlias = field.getAnnotation(ApiProperty.class);
            fieldComment =  xStreamAlias.value();
        }else if(field.isAnnotationPresent(RpcModelProperty.class)){
            RpcModelProperty rpcModelProperty = field.getAnnotation(RpcModelProperty.class);
            fieldComment =  rpcModelProperty.value();
        }
        // 例如使用注解等
        return fieldComment; // 返回空字符串，您可以根据需要修改
    }

    /***
     * 是否必填写
     * @param field
     * @return
     */
    private static String getFieldRequired(Field field) {
        String fieldRequired = "";
        // 这里可以根据需要自定义获取字段注释的逻辑
        if (field.isAnnotationPresent(NotBlank.class)) {
            NotBlank notBlank = field.getAnnotation(NotBlank.class);
            fieldRequired = "是";
        }else if (field.isAnnotationPresent(NotNull.class)){
            NotNull notnull = field.getAnnotation(NotNull.class);
            fieldRequired = "是";
        }
        // 例如使用注解等
        return fieldRequired; // 返回空字符串，您可以根据需要修改
    }

    private static void checkFieldType(Field field,Sheet sheet) {
        // 设置字段可访问（必须，否则报错）
        field.setAccessible(true);
        Class<?> type = field.getType();

        if (List.class.isAssignableFrom(type)){
            // 当前集合的泛型类型
            Type genericType = field.getGenericType();
            if (null != genericType) {
                if (genericType instanceof ParameterizedType) {
                    ParameterizedType pt = (ParameterizedType) genericType;
                    // 得到泛型里的class类型对象
                    Class<?> actualTypeArgument = (Class<?>)pt.getActualTypeArguments()[0];
                    // 如果是其他对象
                    if(isObject(actualTypeArgument)){
                        // 往后一行 填充
                        ExcelRecursive(actualTypeArgument,sheet);
                    }
                }

            }
        }else {
            // 如果是其他对象
            if(isObject(type)){
                // 往后一行 填充
                ExcelRecursive(type,sheet);
            }
        }
    }

    public static boolean isObject(Class<?> type) {
       if (type.isPrimitive() || type == Object.class ||
               type == String.class || type == Date.class ||
               type == List.class || type == Integer.class ||
               type == BigDecimal.class || type == Long.class){
           return false;
       }
       return true;
    }

    public static Integer getRowNum(Integer i,Integer rowNum) {
        // 说明当前是 第一次循环 且 总行数为1 的情况
        if (i == 0 && rowNum == 1){
            return 1;
        }

        return rowNum ;

    }

    public static Integer getStaticRowNum() {
        return excelUtil.getRowNum();
    }

    public  Integer getRowNum() {
        if (null == this.rowNum){
            return 1;
        }
        return rowNum;
    }

    public static void setStaticRowNum(Integer rowNum) {
        excelUtil.setRowNum(rowNum +1);
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }
}
