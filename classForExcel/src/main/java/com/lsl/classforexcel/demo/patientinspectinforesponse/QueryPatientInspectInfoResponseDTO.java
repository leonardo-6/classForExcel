package com.lsl.classforexcel.demo.patientinspectinforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.List;

@Data
@RpcModel("检验患者报告信息返参")
@XStreamAlias("Response")
public class QueryPatientInspectInfoResponseDTO {

        @RpcModelProperty(value = "检验报告列表")
        @XStreamAlias("LabReportList")
        private List<LabReportDTO> labReportList;

}
