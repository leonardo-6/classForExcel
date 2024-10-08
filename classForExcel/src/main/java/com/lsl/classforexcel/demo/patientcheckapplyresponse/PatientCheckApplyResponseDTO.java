package com.lsl.classforexcel.demo.patientcheckapplyresponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@RpcModel("患者检查申请单")
@XStreamAlias("PatientCheckApply")
public class PatientCheckApplyResponseDTO {

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

        @RpcModelProperty(value = "性别编码")
        private String sexCode;

        @RpcModelProperty(value = "性别名称")
        private String sexName;

        @RpcModelProperty(value = "出生日期")
        private Date birthDate;

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

        @RpcModelProperty(value = "省编码")
        private String provinceCode;

        @RpcModelProperty(value = "省名称")
        private String provinceName;

        @RpcModelProperty(value = "市编码")
        private String cityCode;

        @RpcModelProperty(value = "市名称")
        private String cityName;

        @RpcModelProperty(value = "区编码")
        private String regionCode;

        @RpcModelProperty(value = "区名称")
        private String regionName;

        @RpcModelProperty(value = "街道编码")
        private String townCode;

        @RpcModelProperty(value = "街道名称")
        private String townName;

        @RpcModelProperty(value = "村编码")
        private String villageCode;

        @RpcModelProperty(value = "村名称")
        private String villageName;

        @RpcModelProperty(value = "地址-门牌号码")
        private String houseNumber;

        @RpcModelProperty(value = "地址描述")
        private String addressDescription;

        @RpcModelProperty(value = "地址邮政编码")
        private String postcode;

        @RpcModelProperty(value = "地址联系人")
        private String addressContact;

        @RpcModelProperty(value = "地址电话")
        private String addressPhone;

        @RpcModelProperty(value = "主要地址标志")
        private String mainAddressSign;

        @RpcModelProperty(value = "默认配送地址标志")
        private String defaultDeliverySign;

        @RpcModelProperty(value = "房间号")
        private String roomNo;

        @RpcModelProperty(value = "床位编码")
        private String bedCode;

        @RpcModelProperty(value = "床位号")
        private String bedNo;

        /***
         * 查房间号需要用
         */
        @RpcModelProperty("床位ID")
        private String bedId;

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

        @XStreamAlias("IndexExamList")
        @RpcModelProperty(value = "服务项目类型名称")
        private List<IndexExam> indexExamList;

        @RpcModelProperty(value = "主保险计划ID")
        private String mainInsurancePlanId;

        @RpcModelProperty(value = "主保险计划编码")
        private String mainInsurancePlanCode;

        @RpcModelProperty(value = "主保险计划名称")
        private String mainInsurancePlanName;

        @RpcModelProperty(value = "开立科室编码")
        private String createDepartmentCode;

        @RpcModelProperty(value = "开立科室名称")
        private String createDepartmentName;

        @RpcModelProperty(value = "签署医生编码")
        private String signEmployeeCode;

        @RpcModelProperty(value = "签署医生名称")
        private String signEmployeeName;

        @RpcModelProperty(value = "签署时间")
        private Date signDate;

        @RpcModelProperty(value = "执行科室编码")
        private String executeDepartmentCode;

        @RpcModelProperty(value = "执行科室名称")
        private String executeDepartmentName;

        @RpcModelProperty(value = "紧急医嘱标志")
        private String urgentFlag;

        @XStreamAlias("OrderDiagnosisList")
        @RpcModelProperty(value = "医嘱诊断列表")
        private List<OrderDiagnosis> orderDiagnosisList;

        @RpcModelProperty(value = "病情摘要")
        private String diseaseDescription;

        @RpcModelProperty(value = "检查目的")
        private String checkPurposeDescription;

        @RpcModelProperty(value = "备注")
        private String serviceNote;

        @RpcModelProperty(value = "检查费用")
        private String orderAmount;

}
