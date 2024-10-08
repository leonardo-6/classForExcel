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
@RpcModel("患者地址信息")
@XStreamAlias("AddressResponse")
public class AddressResponseDTO {

    @RpcModelProperty(value = "患者ID")
    private String patientId;

    @RpcModelProperty(value = "患者地址主键")
    private String addressId;

    @RpcModelProperty(value = "地址类型编码")
    private String addressTypeCode;

    @RpcModelProperty(value = "地址类型名称")
    private String addressTypeName;

    @RpcModelProperty(value = "省编码")
    private String provinceCode;

    @RpcModelProperty(value = "省名称")
    private String provinceName;

    @RpcModelProperty(value = "市编码")
    private String cityCode;

    @RpcModelProperty(value = "市名称")
    private String cityName;

    @RpcModelProperty(value = "区编码")
    private String countyCode;

    @RpcModelProperty(value = "区名称")
    private String countyName;

    @RpcModelProperty(value = "街道编码")
    private String townCode;

    @RpcModelProperty(value = "街道名称")
    private String townName;

    @RpcModelProperty(value = "村编码")
    private String villageCode;

    @RpcModelProperty(value = "村名称")
    private String villageName;

    @RpcModelProperty(value = "地址-门牌号码")
    private String houseNumber;

    @RpcModelProperty(value = "地址描述")
    private String addressDescription;

    @RpcModelProperty(value = "地址邮政编码")
    private String postcode;

    @RpcModelProperty(value = "地址联系人")
    private String addressContact;

    @RpcModelProperty(value = "地址电话")
    private String addressPhone;

    @RpcModelProperty(value = "主要地址标志")
    private String mainAddressSign;

    @RpcModelProperty(value = "默认配送地址标志")
    private String defaultDeliverySign;
}
