package com.lsl.classforexcel.demo.patientInforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
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
@RpcModel("患者过敏症状")
public class SymptomResponseDTO {

    @RpcModelProperty(value = "过敏症状编码")
    private String symptomCode;

    @RpcModelProperty(value = "过敏症状名称")
    private String symptomName;

}
