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
public class QueryPatientsInHospitalRequestDTO {

        /** 1. 在院病人基本信息 **/
        public interface queryPatientsInHospital  extends Default {}

        @ApiProperty("机构Id")
        @XmlElement(name = "OrganizationId")
        @XStreamAlias("OrganizationId")
        @NotBlank(groups = queryPatientsInHospital.class, message = "机构Id 不能为空")
        private String organizationId;

        @ApiProperty("科室编码")
        @XmlElement(name = "DepartmentCode")
        @XStreamAlias("DepartmentCode")
        @NotBlank(groups = queryPatientsInHospital.class,message = "科室编码 不能为空")
        private String departmentCode;

        @ApiProperty("病区")
        @XmlElement(name = "WardCode")
        @XStreamAlias("WardCode")
        @NotBlank(groups = queryPatientsInHospital.class,message = "病区 不能为空")
        private String wardCode;

        @ApiProperty("患者Id")
        @XmlElement(name = "PatientId")
        @XStreamAlias("PatientId")
        @NotBlank(groups = queryPatientsInHospital.class,message = "患者Id 不能为空")
        private String patientId;

        @ApiProperty("就诊流程Id")
        @XmlElement(name = "VisitId")
        @XStreamAlias("VisitId")
        @NotBlank(groups = queryPatientsInHospital.class,message = "就诊流程Id 不能为空")
        private String visitId;

        @ApiProperty("就诊流程类型编码")
        @XmlElement(name = "VisitTypeCode")
        @XStreamAlias("VisitTypeCode")
        @NotBlank(groups = queryPatientsInHospital.class,message = "就诊流程类型编码 不能为空")
        private String visitTypeCode;

        @ApiProperty("病案号")
        @XmlElement(name = "CaseNo")
        @XStreamAlias("CaseNo")
        @NotBlank(groups = queryPatientsInHospital.class,message = "病案号 不能为空")
        private String caseNo;

        @ApiProperty("住院就诊次数")
        @XmlElement(name = "HospitalizationTime")
        @XStreamAlias("HospitalizationTime")
        @NotBlank(groups = queryPatientsInHospital.class,message = "住院就诊次数 不能为空")
        private String hospitalizationTime;

}
