package com.lsl.classforexcel.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hpsf.DocumentSummaryInformation;
import org.apache.poi.hpsf.SummaryInformation;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author: funfan0517
 * @CreateTime: 2022-11-07  14:36
 * @Description: Excel操作工具类
 */
@Slf4j
public class PoiUtils {

    /**
     * 将对象集合导出到excel
     * @param list
     * @param <T>
     * @return
     */
    public static <T> ResponseEntity<byte[]> exportToExcel(List<T> list,String excelName) {
        //列表为空直接返回null
        if(list.isEmpty()) return null;

        // 1、创建一个excel文档
        HSSFWorkbook workbook = new HSSFWorkbook();

        // 2、创建文档摘要
        workbook.createInformationProperties();

        // 3、获取并配置文档摘要信息
        DocumentSummaryInformation docInfo = workbook.getDocumentSummaryInformation();
        // 文档类别
        docInfo.setCategory("导出文档");
        // 文档管理员
        docInfo.setManager("UT");
        // 设置公司信息
        docInfo.setCompany("www.ut.com.cn");

        // 4、获取文档摘要信息
        SummaryInformation summaryInformation = workbook.getSummaryInformation();
        // 文档标题
        summaryInformation.setTitle("导出文档");
        // 文档作者
        summaryInformation.setAuthor("LSL");
        // 备注信息
        summaryInformation.setComments("导出实体类属性测试--");

        // 5、创建样式
        // 创建标题行的样式
        HSSFCellStyle headerStyle = workbook.createCellStyle();
        // 背景颜色
        headerStyle.setFillForegroundColor(IndexedColors.GREEN.getIndex());
        // 填充模式
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        // 不传name 默认为sheet1
        HSSFSheet sheet = workbook.createSheet();

        // 6、创建标题行 第一行数据
        // 只循环一次目的是将对象名写入到excel标题上
        for (T t : list) {
            HSSFRow row = sheet.createRow(0);
            String[] fieldNames = getFiledNames(t);
            for (int i = 0; i < fieldNames.length; i++) {
                HSSFCell cell = row.createCell(i);
                cell.setCellValue(fieldNames[i]);
                cell.setCellStyle(headerStyle);
            }
            break;
        }

        // 7、创建后面行
        for (int j = 0; j < list.size(); j++) {
            T t = list.get(j);
            String[] fieldValues = getFieldValues(t);
            // 由于第一行已经写入了标题，所以这里从第二行开始写
            HSSFRow rows = sheet.createRow(j + 1);
            for (int i = 0; i < fieldValues.length; i++) {
                rows.createCell(i).setCellValue(fieldValues[i]);
            }
        }
        HttpHeaders headers = new HttpHeaders();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        FileOutputStream baos = null;
        try {
//            baos = new FileOutputStream("D:\\data\\test.xls");
            // 防止乱码
            headers.setContentDispositionFormData("attachment", new String(excelName.getBytes(StandardCharsets.UTF_8), "ISO-8859-1"));//ISO-8859-1

            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            workbook.write(baos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(baos.toByteArray(), headers, HttpStatus.CREATED);//null;//
    }

    /**
     * 获取所有对象属性名称
     * @param o
     * @return
     */
    public static String[] getFiledNames(Object o) {
        Field[] fields=o.getClass().getDeclaredFields();
        String[] fieldNames=new String[fields.length];
        for(int i=0;i<fields.length;i++){
            fieldNames[i]=fields[i].getName();
        }
        return fieldNames;
    }

    /**
     * 获取对象属性值
     * @param o
     * @return
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    private static String[] getFieldValues(Object o) {
        Field[] fields=o.getClass().getDeclaredFields();
        String[] fieldNames=new String[fields.length];
        String[] fieldValues = new String[fieldNames.length];
        for(int i=0;i<fields.length;i++){
            fieldNames[i]=fields[i].getName();
        }
        try {
            for (int i=0; i<fieldNames.length; i++) {
                String fieldName = fieldNames[i];
                Object invoke = o.getClass().getMethod("get" + returnFirstCapital(fieldName)).invoke(o);
                String field = invoke == null? null:invoke.toString();//数据为null时做特殊处理
                if(invoke instanceof Date) {
                    field = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(invoke);
                }
                fieldValues[i] = field;
            }
        } catch(Exception e) {
            log.error("获取实体类对象属性异常：", e);
        }
        return fieldValues;
    }

    /**
     * 判断字符串首字母是否为大写，如果不是转化为大写
     * @param str
     * @return
     */
    public static String returnFirstCapital(String str) {
        if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') {
            return str;
        }
        char[] ch = str.toCharArray();
        ch[0] -= 32;
        return String.valueOf(ch);
    }



    /**
     * 将对象集合导出到excel
     */
    public static <T> String exportToExcelFile(List<T> list, String excelName) {
        if(list.isEmpty()) return null;//列表为空直接返回null
        // 1、创建一个excel文档
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 2、创建文档摘要
        workbook.createInformationProperties();
        // 3、获取并配置文档摘要信息
        DocumentSummaryInformation docInfo = workbook.getDocumentSummaryInformation();
        // 文档类别
        docInfo.setCategory("导出文档");
        // 文档管理员
        docInfo.setManager("UT");
        // 设置公司信息
        docInfo.setCompany("www.xxx.cn");
        // 4、获取文档摘要信息
        SummaryInformation summaryInformation = workbook.getSummaryInformation();
        // 文档标题
        summaryInformation.setTitle("导出文档");
        // 文档作者
        summaryInformation.setAuthor("UT");
        // 备注信息
        summaryInformation.setComments("本文档由 你妹 提供");
        // 5、创建样式
        // 创建标题行的样式
        HSSFCellStyle headerStyle = workbook.createCellStyle();
        // 背景颜色
        headerStyle.setFillForegroundColor(IndexedColors.GREEN.getIndex());
        // 填充模式
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        // 不传name 默认为sheet1
        HSSFSheet sheet = workbook.createSheet();

        // 6、创建标题行 第一行数据
        // 只循环一次目的是将对象名写入到excel标题上
        for (T t : list) {
            HSSFRow row = sheet.createRow(0);
            String[] fieldNames = getFiledNames(t);
            for (int i = 0; i < fieldNames.length; i++) {
                HSSFCell cell = row.createCell(i);
                cell.setCellValue(fieldNames[i]);
                cell.setCellStyle(headerStyle);
            }
            break;
        }

        // 7、创建后面行
        for (int j = 0; j < list.size(); j++) {
            T t = list.get(j);
            String[] fieldValues = getFieldValues(t);
            // 由于第一行已经写入了标题，所以这里从第二行开始写
            HSSFRow rows = sheet.createRow(j + 1);
            for (int i = 0; i < fieldValues.length; i++) {
                rows.createCell(i).setCellValue(fieldValues[i]);
            }
        }
        File file=new File("D:\\"+excelName+".xls");
        FileOutputStream baos = null;
        try {
            baos = new FileOutputStream(file);
            workbook.write(baos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String absolutePath = file.getAbsolutePath();
        return "导出文件存放路径为："+absolutePath;
    }

    /**
     * 将对象集合导出到excel
     * SXSSFWorkbook对于大型excel的创建且不会内存溢出的，就只有SXSSFWorkbook了。它的原理很简单，用硬盘空间换内存（就像hash map用空间换时间一样）
     * @param list
     * @param <T>
     * @reurn
     */
    public static <T> void exportExcel(HttpServletRequest request, HttpServletResponse response, List<T> list, String sheetName) {
        // 1、创建一个excel文档
        SXSSFWorkbook workbook = new SXSSFWorkbook();

        // 5、创建样式
        // 创建标题行的样式
        CellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFillForegroundColor(IndexedColors.GREEN.getIndex()); // 背景颜色
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND); // 填充模式
        Sheet sheet = workbook.createSheet();// 不传name 默认为sheet1
        // 6、创建标题行 第一行数据
        // 只循环一次目的是将对象名写入到excel标题上
        for (T t : list) {
            Row row = sheet.createRow(0);
            String[] fieldNames = getFiledNames(t);
            for (int i = 0; i < fieldNames.length; i++) {
                Cell  cell = row.createCell(i);
                cell.setCellValue(fieldNames[i]);
                cell.setCellStyle(headerStyle);
            }
            break;
        }
        // 7、创建后面行
        for (int j = 0; j < list.size(); j++) {
            T t = list.get(j);
            String[] fieldValues = getFieldValues(t);
            // 由于第一行已经写入了标题，所以这里从第二行开始写
            Row rows = sheet.createRow(j + 1);
            for (int i = 0; i < fieldValues.length; i++) {
                rows.createCell(i).setCellValue(fieldValues[i]);
            }
        }
        //声明输出流
        OutputStream outputStream = null;
        //响应到客户端
        try {
            //表格文件名称
            String codedFileName = java.net.URLEncoder.encode(sheetName, "UTF-8");
            //设置响应头
            response.setContentType("application/vnd.ms-excel");
            String agent = request.getHeader("USER-AGENT").toLowerCase();
            if (agent.contains("firefox")) {
                response.setCharacterEncoding("utf-8");
                response.setHeader("content-disposition", "attachment;filename=" + new String(sheetName.getBytes(), "ISO8859-1") + ".xlsx");
            } else {
                response.setHeader("content-disposition", "attachment;filename=" + codedFileName + ".xlsx");
            }
            //获取输出流
            outputStream = response.getOutputStream();

            //用文档写输出流
            workbook.write(outputStream);

            //刷新输出流
            outputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭输出流
            if (outputStream != null) {
                try {
                    outputStream.close();
                    workbook.dispose();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
