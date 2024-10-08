package com.lsl.classforexcel.demo.doctoradviceInfo;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author lsl
 * @version 2023/11/9 009
 */
@Data
@RpcModel("药品信息列表")
@XmlAccessorType(XmlAccessType.FIELD)
@XStreamAlias("OrderDrugInfo")
public class OrderDrugInfo {

    @RpcModelProperty(value = "服务项目名称")
    private String serviceItemName;

    @RpcModelProperty(value = "医嘱单位数量")
    private String productNumber;

    @RpcModelProperty(value = "医嘱单位")
    private String orderUnitName;

    @RpcModelProperty(value = "主药标志")
    private String mainFlag;

    @RpcModelProperty(value = "频次编码")
    private String frequencyCode;

    @RpcModelProperty(value = "频次名称")
    private String frequencyName;
}
