package com.lsl.classforexcel.demo.patientinspectinforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

@Data
@RpcModel("检验报告结果列表")
@XStreamAlias("LabReportResult")
public class LabReportResultDTO {

        @RpcModelProperty(value = "检验序号")
        private String medicalNo;

        @RpcModelProperty(value = "检验指标编码")
        private String laboratoryIndicatorsCode;

        @RpcModelProperty(value = "检验指标名称")
        private String laboratoryIndicatorsName;

        @RpcModelProperty(value = "检验结果")
        private String laboratoryIndicatorsValue;

        @RpcModelProperty(value = "正常值范围描述")
        private String normalRange;

        @RpcModelProperty(value = "检验指标数值单位")
        private String laboratoryIndicatorsUnit;

        @RpcModelProperty(value = "检验异常标志")
        private String exceptionFlag;
}
