package com.lsl.classforexcel.demo.operationinforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.Date;

@Data
@RpcModel("手术医嘱列表")
@XStreamAlias("SurgeryOrder")
public class SurgeryOrderDTO {

    @RpcModelProperty("申请单号")
    private String applyNo;

    @RpcModelProperty(value = "患者ID")
    private String patientId;

    @RpcModelProperty(value = "病案号")
    private String caseNo;

    @RpcModelProperty(value = "就诊流程ID")
    private String visitId;

    @RpcModelProperty(value = "就诊流程类型编码")
    private String visitTypeCode;

    @RpcModelProperty(value = "就诊流程类型名称")
    private String visitTypeName;

    @RpcModelProperty(value = "门诊就诊次数")
    private String outpatientTime;

    @RpcModelProperty(value = "住院就诊次数")
    private String hospitalizationTime;

    @RpcModelProperty(value = "证件类型编码")
    private String certificateTypeCode;

    @RpcModelProperty(value = "证件类型名称")
    private String certificateTypeName;

    @RpcModelProperty(value = "证件号")
    private String certificateNo;

    @RpcModelProperty(value = "患者姓名")
    private String name;

    @RpcModelProperty(value = "拼音码")
    private String pinyin;

    @RpcModelProperty(value = "性别编码")
    private String sexCode;

    @RpcModelProperty(value = "性别名称")
    private String sexName;

    @RpcModelProperty(value = "出生日期")
    private Date birthDate;

    @RpcModelProperty(value = "年龄")
    private String age;

    @RpcModelProperty(value = "电话")
    private String phone;

    @RpcModelProperty(value = "其他电话号码")
    private String otherPhone;

    @RpcModelProperty(value = "地址描述")
    private String addressDescription;

    @RpcModelProperty(value = "病人所属病区编码")
    private String patientWardCode;

    @RpcModelProperty(value = "病人所属病区名称")
    private String patientWardName;

    @RpcModelProperty(value = "签署医生编码")
    private String signEmployeeCode;

    @RpcModelProperty(value = "签署医生名称")
    private String signEmployeeName;

    @RpcModelProperty("手术确定日期时间")
    private Date surgeryConfirmTime;

    @RpcModelProperty("手术")
    private String surgeryServiceItemId;

    @RpcModelProperty("手术名称")
    private String surgeryServiceItemName;

    @RpcModelProperty("手术结果")
    private String operationResult;

    @RpcModelProperty("手术科室")
    private String surgeryDepartmentId;

    @RpcModelProperty("手术科室名称")
    private String surgeryDepartmentName;

    @RpcModelProperty("手术医生编码")
    private String surgeonCode;

    @RpcModelProperty("手术医生名称")
    private String surgeonName;

    @RpcModelProperty("创建/修改时间")
    private Date updateDate;

    @RpcModelProperty(value = "台次")
    private String surgeryOperationNumber;

    @RpcModelProperty(value = "术前诊断ID")
    private String beforediagnosisCode;

    @RpcModelProperty(value = "术前诊断名称")
    private String beforediagnosisName;

    @RpcModelProperty(value = "术后诊断ID")
    private String afterdiagnosisCode;

    @RpcModelProperty(value = "术后诊断名称")
    private String afterdiagnosisName;

    @RpcModelProperty(value = "洗手护士工号")
    private String washHandNurseCode;

    @RpcModelProperty(value = "洗手护士姓名")
    private String washHandNurseName;

    @RpcModelProperty(value = "巡回护士工号")
    private String circuitNurseCode;

    @RpcModelProperty(value = "巡回护士姓名")
    private String circuitNurseName;

    @RpcModelProperty(value = "临床路径")
    private String clinicalPathway;

    @RpcModelProperty(value = "输血类型")
    private String bloodSelfTypeId;

    @RpcModelProperty(value = "自体输血类型编码")
    private String bloodSelfTypeCode;

    @RpcModelProperty(value = "自体输血类型名称")
    private String bloodSelfTypeName;

    @RpcModelProperty(value = "会诊信息")
    private String consultation;

    @RpcModelProperty(value = "是否住院")
    private String pasource;

}
