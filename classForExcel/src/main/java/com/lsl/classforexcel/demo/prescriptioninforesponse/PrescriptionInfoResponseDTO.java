package com.lsl.classforexcel.demo.prescriptioninforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.List;

@Data
@RpcModel("处方信息返参")
@XStreamAlias("Response")
public class PrescriptionInfoResponseDTO {

        @RpcModelProperty(value = "处方详细信息集合")
        @XStreamAlias("PrescriptionInfoList")
        private List<PrescriptionInfoDTO> prescriptionInfoList;

}
