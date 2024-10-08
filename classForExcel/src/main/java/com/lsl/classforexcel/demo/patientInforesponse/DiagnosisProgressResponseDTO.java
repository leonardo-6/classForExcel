package com.lsl.classforexcel.demo.patientInforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.List;


/**
 * @version v1.0
 * @ProjectName: biz-pi
 * @ClassName: AddressResponse
 * @Description:
 * @Author: lsl
 * @Date: 2024/08/30 17:03
 */
@Data
@RpcModel("诊断过程")
@XStreamAlias("DiagnosisProgress")
public class DiagnosisProgressResponseDTO {

    @RpcModelProperty(value = "诊流程ID")
    private String  visitId;

    @RpcModelProperty(value = "诊断过程类型编码")
    private String  diagnosisProgressTypeCode;

    @RpcModelProperty(value = "诊断过程类型名称")
    private String  diagnosisProgressTypeName;

    @XStreamAlias("DiagnosisDetailsResponseList")
    @RpcModelProperty(value = "诊断明细列表")
    private List<DiagnosisDetailsResponseDTO> diagnosisDetailsResponseList;
}
