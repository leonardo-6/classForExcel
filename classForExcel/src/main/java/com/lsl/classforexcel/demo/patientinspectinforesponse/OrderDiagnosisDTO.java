package com.lsl.classforexcel.demo.patientinspectinforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@RpcModel("医嘱诊断列表")
@XStreamAlias("OrderDiagnosis")
public class OrderDiagnosisDTO {

        @RpcModelProperty(value = "诊断过程类型编码")
        private String diagnosisProcessTypeCode;

        @RpcModelProperty(value = "诊断过程类型名称")
        private String diagnosisProcessTypeName;

        @RpcModelProperty(value = "诊断学科类型编码")
        private String diagnosisSubjectTypeCode;

        @RpcModelProperty(value = "诊断学科类型名称")
        private String diagnosisSubjectTypeName;

        @RpcModelProperty(value = "疾病诊断名称(症候串)")
        private String diagnosisName;

        @RpcModelProperty(value = "疾病诊断编码")
        private String diagnosisCode;

        /*@RpcModelProperty(value = "疾病诊断名称")
        private String diagnosisName;*/

        @RpcModelProperty(value = "关联诊断明细ID串")
        private String diagnosisDetailsId;
}
