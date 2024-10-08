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
@RpcModel("患者预缴金")
public class DepositResponseDTO {

    @RpcModelProperty(value = "住院预交金总计")
    private String  depositAmount;

    @RpcModelProperty(value = "个人账户授信总计")
    private String  patientAccountAmount;

    @RpcModelProperty(value = "住院发生费用总计")
    private String  inTotalAmount;

    @RpcModelProperty(value = "住院未结费用总计")
    private String  inCostAmount;

    @RpcModelProperty(value = "预结自负金额")
    private String  preSelfAmount;

    @RpcModelProperty(value = "剩余金额")
    private String  remainAmount;

    @RpcModelProperty(value = "欠费额度")
    private String  arrearsAmount;

    @RpcModelProperty(value = "欠费计算比例")
    private String  arrearsRatio;
}
