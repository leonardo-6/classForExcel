package com.lsl.classforexcel.demo.prescriptioninforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@RpcModel("处方详细信息")
@XStreamAlias("PrescriptionInfo")
public class PrescriptionInfoDTO {

        @RpcModelProperty(value = "处方号（唯一标识一张处方）")
        private String prescriptionNumber;

        @RpcModelProperty(value = "处方类型(中药、西药)")
        private String prescriptionTypeCode;

        @RpcModelProperty(value = "开方科室代码")
        private String createDepartmentCode;

        @RpcModelProperty(value = "开方科室名称")
        private String createDepartmentName;

        @RpcModelProperty(value = "开方医生代码")
        private String createUserCode;

        @RpcModelProperty(value = "开方医生姓名")
        private String createUserName;

        @RpcModelProperty(value = "开方日期")
        private Date createTime;

        @RpcModelProperty(value = "处方来源(门诊、住院)")
        private String visitTypeCode;

        @RpcModelProperty(value = "0 未交费 1 已交费")
        private String billingStatusTypeCode;

        @RpcModelProperty(value = "0: 正常 1: 取消")
        private String deleteFlag;

        @RpcModelProperty(value = "备注")
        private String note;

        @RpcModelProperty(value = "主诊断名称")
        private String majorDiagnosisName;

        @RpcModelProperty(value = "状态 0: 未处理  1：正在配药 2：已配好待发 3: 已发")
        private String prescriptionStatusCode;

        @RpcModelProperty(value = "药房代码")
        private String executeDepartmentCode;

        @RpcModelProperty(value = "药房名称")
        private String executeDepartmentName;

        @RpcModelProperty(value = "取药窗口编码")
        private String dispensingDepartmentCode;

        @RpcModelProperty(value = "取药窗口名称")
        private String dispensingDepartmentName;

        @RpcModelProperty(value = "剂数")
        private BigDecimal tcmQuantity;

        @RpcModelProperty(value = "患者信息")
        private PatientInfoDTO patientInfo;

        @RpcModelProperty(value = "处方信息集合")
        private List<PrescriptionDetailDTO> prescriptionDetailList;
}
