package com.lsl.classforexcel.demo.patientinspectinforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@RpcModel("患者检验报告详情")
@XStreamAlias("LabReport")
public class LabReportDTO {

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

        @RpcModelProperty(value = "住院就诊次数")
        private String hospitalizationTime;

        @RpcModelProperty(value = "患者姓名")
        private String name;

        @RpcModelProperty(value = "性别编码")
        private String sexCode;

        @RpcModelProperty(value = "性别名称")
        private String sexName;

        @RpcModelProperty(value = "出生日期")
        private Date birthDate;

        @RpcModelProperty(value = "医嘱ID")
        private String orderId;

        @RpcModelProperty(value = "申请单号")
        private String applyNo;

        @RpcModelProperty(value = "检查项目编码")
        private String serviceSetCode;

        @RpcModelProperty(value = "检查项目名称")
        private String serviceSetName;

        @RpcModelProperty(value = "服务项目类型编码")
        private String serviceItemTypeCode;

        @RpcModelProperty(value = "服务项目类型名称")
        private String serviceItemTypeName;

        @RpcModelProperty(value = "开立科室编码")
        private String createDepartmentCode;

        @RpcModelProperty(value = "开立科室名称")
        private String createDepartmentName;

        @RpcModelProperty(value = "签署医生编码")
        private String signEmployeeCode;

        @RpcModelProperty(value = "签署医生名称")
        private String signEmployeeName;

        @RpcModelProperty(value = "检验仪器设备号")
        private String laboratoryInstrumentCode;

        @RpcModelProperty(value = "报告日期")
        private Date reportDate;

        @RpcModelProperty(value = "检验科室编码")
        private String laboratoryDepartmentCode;

        @RpcModelProperty(value = "检验科室名称")
        private String laboratoryDepartmentName;

        @RpcModelProperty(value = "检验医生编码")
        private String laboratoryEmployeeCode;

        @RpcModelProperty(value = "检验医生名称")
        private String laboratoryEmployeeName;

        @RpcModelProperty(value = "检验费用")
        private String orderAmount;

        @RpcModelProperty(value = "医嘱诊断列表")
        @XStreamAlias("OrderDiagnosisList")
        private List<OrderDiagnosisDTO> orderDiagnosisList;

        @RpcModelProperty(value = "检验报告结果列表")
        @XStreamAlias("LabReportResultList")
        private List<LabReportResultDTO> labReportResultList;





}
