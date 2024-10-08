package com.lsl.classforexcel.demo.patientcheckapplyresponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.List;

@Data
@RpcModel("患者检查申请单")
@XStreamAlias("Response")
public class QueryPatientCheckApplyResponseDTO {

       @XStreamAlias("PatientCheckApply")
       @RpcModelProperty(value = "患者检查申请单")
       private List<PatientCheckApplyResponseDTO> PatientCheckApplyResponse;

       public QueryPatientCheckApplyResponseDTO(List<PatientCheckApplyResponseDTO> patientCheckApplyResponse) {
              PatientCheckApplyResponse = patientCheckApplyResponse;
       }
}
