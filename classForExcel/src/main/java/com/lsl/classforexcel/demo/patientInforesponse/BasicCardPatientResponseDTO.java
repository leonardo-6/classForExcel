package com.lsl.classforexcel.demo.patientInforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.Date;


/**
 * @version v1.0
 * @ProjectName: biz-pi
 * @ClassName: AddressResponse
 * @Description:
 * @Author: lsl
 * @Date: 2024/08/30 17:03
 */
@Data
@RpcModel("患者基本卡信息")
@XStreamAlias("BasicCardResponsePatient")
public class BasicCardPatientResponseDTO {

    @RpcModelProperty(value = "患者ID")
    private String patientId;

    @RpcModelProperty(value = "基本卡Id")
    private String cardId;

    @RpcModelProperty(value = "卡类型编码")
    private String cardTypeCode;

    @RpcModelProperty(value = "卡类型名称")
    private String cardTypeName;

    @RpcModelProperty(value = "卡号")
    private String cardNo;

    @RpcModelProperty(value = "结束时间")
    private Date endDate;

    @RpcModelProperty(value = "激活标志")
    private String activeFlag;
}
