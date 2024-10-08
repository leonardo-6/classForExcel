package com.lsl.classforexcel.demo.patientInforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
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
@RpcModel("医疗人员信息")
@XStreamAlias("MedicalEmployee")
public class MedicalEmployeeResponseDTO {

    @RpcModelProperty(value = "就诊流程ID")
    private String visitId;

    @RpcModelProperty(value = "医疗人员Id")
    private String employeeId;

    @RpcModelProperty(value = "医疗人员编码")
    private String employeeCode;

    @RpcModelProperty(value = "医疗人员姓名")
    private String employeeName;

    @RpcModelProperty(value = "医疗人员类型编码")
    private String medicalEmployeeTypeCode;

    @RpcModelProperty(value = "医疗人员类型名称")
    private String medicalEmployeeTypeName;

    @RpcModelProperty(value = "开始时间")
    private Date beginTime;

    @RpcModelProperty(value = "结束时间")
    private Date endTime;
}
