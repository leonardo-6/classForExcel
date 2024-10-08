package com.lsl.classforexcel.demo;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.math.BigDecimal;

@Data
@RpcModel("收费项目基本信息返参")
@XStreamAlias("MedicalPrice")
public class GetMedicalPriceListResponseDTO {

        @RpcModelProperty(value = "项目编码")
        private String serviceItemCode;

        @RpcModelProperty(value = "项目名称")
        private String serviceItemName;

        @RpcModelProperty(value = "医疗单位")
        private String medicalUnit;

        @RpcModelProperty(value = "保险计划目录类型编码")
        private String insurancePlanTypeCode;

        @RpcModelProperty(value = "保险计划目录类型名称")
        private String insurancePlanTypeName;

        @RpcModelProperty(value = "服务项目类型编码")
        private String serviceItemTypeCode;

        @RpcModelProperty(value = "服务项目类型名称")
        private String serviceItemTypeName;

        @RpcModelProperty(value = "服务项目分类编码")
        private String serviceItemCategoryCode;

        @RpcModelProperty(value = "服务项目分类名称")
        private String serviceItemCategoryName;

        @RpcModelProperty(value = "单价")
        private BigDecimal price;

        @RpcModelProperty(value = "拼音码")
        private String pinyin;

        @RpcModelProperty(value = "五笔码")
        private String fiveStroke;

}
