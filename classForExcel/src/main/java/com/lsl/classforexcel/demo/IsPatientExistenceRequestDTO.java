package com.lsl.classforexcel.demo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import ctd.swagger.annotation.ApiProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
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
public class IsPatientExistenceRequestDTO {

        /** 1. 患者是否存在 **/
        public interface IsPatientExistence  extends Default {}

        @ApiProperty("机构Id")
        @XmlElement(name = "OrganizationId")
        @XStreamAlias("OrganizationId")
        @NotBlank(groups = IsPatientExistence.class, message = "机构Id 不能为空")
        private String organizationId;

        @ApiProperty("租户")
        @XmlElement(name = "TenantId")
        @XStreamAlias("TenantId")
        private String tenantId;

        @ApiProperty("关键字")
        @XmlElement(name = "Keyword")
        @XStreamAlias("Keyword")
        @NotBlank(groups = IsPatientExistence.class,message = "关键字 不能为空 可根据患者姓名、姓名拼音、病案号、证件号搜素")
        private String keyword;


}
