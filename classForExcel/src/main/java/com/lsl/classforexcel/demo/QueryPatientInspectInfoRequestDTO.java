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
public class QueryPatientInspectInfoRequestDTO {

        /** 1. 患者的检验报告信息 **/
        public interface QueryPatientInspectInfo  extends Default {}

        @ApiProperty("机构Id")
        @XmlElement(name = "OrganizationId")
        @XStreamAlias("OrganizationId")
        @NotBlank(groups = QueryPatientInspectInfo.class, message = "机构Id 不能为空")
        private String organizationId;

        @ApiProperty("患者Id")
        @XmlElement(name = "PatientId")
        @XStreamAlias("PatientId")
        //@NotBlank(groups = QueryPatientInspectInfo.class,message = "患者Id 不能为空")
        private String patientId;

        @ApiProperty("就诊流程Id")
        @XmlElement(name = "VisitId")
        @XStreamAlias("VisitId")
        //@NotBlank(groups = QueryPatientInspectInfo.class,message = "就诊流程Id 不能为空")
        private String visitId;

        @ApiProperty("就诊流程类型编码")
        @XmlElement(name = "VisitTypeCode")
        @XStreamAlias("VisitTypeCode")
        //@NotBlank(groups = QueryPatientInspectInfo.class,message = "就诊流程类型编码 不能为空")
        private String visitTypeCode;

        @ApiProperty("病案号")
        @XmlElement(name = "CaseNo")
        @XStreamAlias("CaseNo")
        //@NotBlank(groups = QueryPatientInspectInfo.class,message = "病案号 不能为空")
        private String caseNo;

        @ApiProperty("住院就诊次数")
        @XmlElement(name = "HospitalizationTime")
        @XStreamAlias("HospitalizationTime")
        //@NotBlank(groups = QueryPatientInspectInfo.class,message = "住院就诊次数 不能为空")
        private String hospitalizationTime;

}
