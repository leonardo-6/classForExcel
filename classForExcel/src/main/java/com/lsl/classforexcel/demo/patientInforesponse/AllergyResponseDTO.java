package com.lsl.classforexcel.demo.patientInforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.Date;
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
@RpcModel("患者过敏信息")
@XStreamAlias("AllergyResponse")
public class AllergyResponseDTO {

    @RpcModelProperty(value = "患者ID")
    private String patientId;

    @RpcModelProperty(value = "过敏史ID")
    private String patientAllergicHistoryId;

    @RpcModelProperty(value = "过敏类型编码")
    private String allergyTypeCode;

    @RpcModelProperty(value = "过敏类型名称")
    private String allergyTypeName;

    @RpcModelProperty(value = "其他过敏分类编码")
    private String otherCategoryCode;

    @RpcModelProperty(value = "其他过敏分类名称")
    private String otherCategoryName;

    @RpcModelProperty(value = "过敏名称")
    private String itemName;

    @XStreamAlias("SymptomList")
    @RpcModelProperty(value = "过敏症状列表")
    private List<SymptomResponseDTO> symptomList;

    @RpcModelProperty(value = "过敏严重程度编码")
    private String allergySeverityCode;

    @RpcModelProperty(value = "过敏严重程度名称")
    private String allergySeverityName;

    @RpcModelProperty(value = "通用药品ID")
    private String generalDrugId;

    @RpcModelProperty(value = "药理类型编码")
    private String pharmacologyTypeCode;

    @RpcModelProperty(value = "药理类型名称")
    private String pharmacologyTypeName;

    @RpcModelProperty(value = "过敏药物分类ID")
    private String category;

    @RpcModelProperty(value = "过敏信息来源编码")
    private String medicineMessageSourceCode;

    @RpcModelProperty(value = "过敏信息来源名称")
    private String medicineMessageSourceName;

    @RpcModelProperty(value = "阳转阴标志")
    private String yangToYinSign;

    @RpcModelProperty(value = "登记时间")
    private Date signInDate;
}
