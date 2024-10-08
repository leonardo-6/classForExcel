package com.lsl.classforexcel.demo.prescriptioninforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.math.BigDecimal;

@Data
@RpcModel("处方信息")
@XStreamAlias("PrescriptionDetailDTO")
public class PrescriptionDetailDTO {

        @RpcModelProperty(value = "序号")
        private Long serialNumber;

        @RpcModelProperty(value = "医嘱服务项目ID")
        private String orderServiceItemId;

        @RpcModelProperty(value = "药品代码")
        private String productCode;

        @RpcModelProperty(value = "药品名称")
        private String productName;

        @RpcModelProperty(value = "规格")
        private String specifications;

        @RpcModelProperty(value = "单位")
        private String serviceItemUnit;

        @RpcModelProperty(value = "基本用量")
        private BigDecimal medicalUnitQuantity;

        @RpcModelProperty(value = "厂商")
        private String factoryName;

        @RpcModelProperty(value = "包装单位")
        private String orderUnitName;

        @RpcModelProperty(value = "数量")
        private BigDecimal orderUnitQuantity;

        @RpcModelProperty(value = "单价")
        private BigDecimal orderUnitPrice;

        @RpcModelProperty(value = "特殊药品类型编码")
        private String specialTypeCode;

        @RpcModelProperty(value = "用药途径")
        private String usageName;

        @RpcModelProperty(value = "注意事项")
        private String require;
}
