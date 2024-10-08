package com.lsl.classforexcel.demo;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * @version v1.0
 * @ProjectName: biz-pi
 * @ClassName: AddressResponse
 * @Description:
 * @Author: lsl
 * @Date: 2024/08/30 17:03
 */
@Data
@RpcModel("患者基本信息")
public class PatientInfoResponseDTO {

    @RpcModelProperty(value = "患者ID")
    private String patientId;

    @RpcModelProperty(value = "就诊流程ID")
    private String visitId;

    @RpcModelProperty(value = "就诊流程类型编码")
    private String visitTypeCode;

    @RpcModelProperty(value = "就诊流程类型名称")
    private String visitTypeName;

    @RpcModelProperty(value = "病案号")
    private String caseNo;

    @RpcModelProperty(value = "院就诊次数")
    private String hospitalizationTime;

    @RpcModelProperty(value = "患者姓名")
    private String name;

    @RpcModelProperty(value = "性别编码")
    private String sexCode;

    @RpcModelProperty(value = "性别名称")
    private String sexName;

    @RpcModelProperty(value = "出生日期")
    private Date birthDate;

    @RpcModelProperty(value = "证件类型编码")
    private String certificateTypeCode;

    @RpcModelProperty(value = "证件类型名称")
    private String certificateTypeName;

    @RpcModelProperty(value = "证件号")
    private String certificateNo;

    @RpcModelProperty(value = "电话")
    private String phone;

    @RpcModelProperty(value = "国家编码")
    private String countyCode;

    @RpcModelProperty(value = "国家名称")
    private String countyName;

    @RpcModelProperty(value = "民族编码")
    private String nationCode;

    @RpcModelProperty(value = "民族名称")
    private String nationName;

    @RpcModelProperty(value = "婚姻编码")
    private String marryCode;

    @RpcModelProperty(value = "婚姻名称")
    private String marryName;
}
