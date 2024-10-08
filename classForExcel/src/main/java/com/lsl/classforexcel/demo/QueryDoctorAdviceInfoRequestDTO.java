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
import java.util.List;

@Data
@XmlRootElement(name = "Query")
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XStreamAlias("Query")
public class QueryDoctorAdviceInfoRequestDTO {

        /** 1. 医嘱信息 **/
        public interface QueryDoctorAdviceInfo extends Default {}

        @ApiProperty("机构Id")
        @XmlElement(name = "OrganizationId")
        @XStreamAlias("OrganizationId")
        @NotBlank(groups = QueryDoctorAdviceInfo.class, message = "机构Id 不能为空")
        private String organizationId;

        @ApiProperty("租户Id")
        @XmlElement(name = "TenantId")
        @XStreamAlias("TenantId")
        @NotBlank(groups = QueryDoctorAdviceInfo.class, message = "租户Id 不能为空")
        private String tenantId;

        @ApiProperty("病案号")
        @XmlElement(name = "CaseNo")
        @XStreamAlias("CaseNo")
        @NotBlank(groups = QueryDoctorAdviceInfo.class, message = "病案号 不能为空")
        private String caseNo;

        @ApiProperty("就诊次数")
        @XmlElement(name = "VisitTimes")
        @XStreamAlias("VisitTimes")
        private String visitTimes;

        @ApiProperty("就诊流程类型编码")
        @XmlElement(name = "VisitTypeCode")
        @XStreamAlias("VisitTypeCode")
        private String visitTypeCode;

        @ApiProperty("医嘱类型")
        @XmlElement(name = "ServiceItemTypeCode")
        @XStreamAlias("ServiceItemTypeCode")
        private List<String> serviceItemTypeCode;

}
