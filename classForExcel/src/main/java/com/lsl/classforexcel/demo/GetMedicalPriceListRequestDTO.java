package com.lsl.classforexcel.demo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import ctd.swagger.annotation.ApiProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "Query")
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XStreamAlias("Query")
public class GetMedicalPriceListRequestDTO {

        /** 1. 收费项目基本信息 **/
        public interface getMedicalPriceList extends Default {}

        @ApiProperty("机构Id")
        @XmlElement(name = "OrganizationId")
        @XStreamAlias("OrganizationId")
        @NotBlank(groups = getMedicalPriceList.class, message = "机构Id 不能为空")
        private String organizationId;

        @ApiProperty("租户Id")
        @XmlElement(name = "TenantId")
        @XStreamAlias("TenantId")
        @NotBlank(groups = getMedicalPriceList.class, message = "租户Id 不能为空")
        private String tenantId;

        @ApiProperty("服务项目Id")
        @XmlElement(name = "ServiceItemId")
        @XStreamAlias("ServiceItemId")
        private String serviceItemId;

        @ApiProperty("服务项目编码")
        @XmlElement(name = "ServiceItemCode")
        @XStreamAlias("ServiceItemCode")
        private String serviceItemCode;

        @ApiProperty("服务项目类型")
        @XmlElement(name = "ServiceItemTypeCode")
        @XStreamAlias("ServiceItemTypeCode")
        private String serviceItemTypeCode;

        @ApiProperty("服务项目基本分类Id")
        @XmlElement(name = "ServiceItemCategoryId")
        @XStreamAlias("ServiceItemCategoryId")
        private String serviceItemCategoryId;

        @ApiProperty("服务项目组合类型")
        @XmlElement(name = "ServiceSetTypeCode")
        @XStreamAlias("ServiceSetTypeCode")
        private String serviceSetTypeCode;


        @ApiProperty("关键字")
        @XmlElement(name = "KeyWord")
        @XStreamAlias("KeyWord")
        // @NotBlank(groups = getMedicalPriceList.class,message = "关键字 不能为空")
        private String keyWord;

        @ApiProperty("分页页码")
        @XmlElement(name = "PageIndex")
        @XStreamAlias("PageIndex")
        @NotNull(groups = getMedicalPriceList.class,message = "分页页码 不能为空")
        private Integer pageIndex;

        @ApiProperty("分页大小")
        @XmlElement(name = "PageSize")
        @XStreamAlias("PageSize")
        @NotNull(groups = getMedicalPriceList.class,message = "分页大小 不能为空")
        private Integer pageSize;

}
