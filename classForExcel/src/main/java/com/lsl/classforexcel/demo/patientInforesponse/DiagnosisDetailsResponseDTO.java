package com.lsl.classforexcel.demo.patientInforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;


/**
 * @version v1.0
 * @ProjectName: biz-pi
 * @ClassName: AddressResponse
 * @Description:
 * @Author: lsl
 * @Date: 2024/08/30 17:03
 */
@Data
@RpcModel("诊断明细")
@XStreamAlias("DiagnosisDetailsResponse")
public class DiagnosisDetailsResponseDTO {

    @RpcModelProperty(value = "诊断编码")
    private String diseaseDiagnosisCode;

    @RpcModelProperty(value = "诊断名称")
    private String diseaseDiagnosisName;

    @RpcModelProperty(value = "主诊断标志")
    private String majorDiagnosisFlag;
}
