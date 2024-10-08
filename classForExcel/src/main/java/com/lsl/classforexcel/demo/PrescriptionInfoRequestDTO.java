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

public class PrescriptionInfoRequestDTO {

        /** 1. 处方信息查询 **/
        public interface PrescriptionInfo  extends Default {}

        @ApiProperty("机构Id")
        @XmlElement(name = "OrganizationId")
        @XStreamAlias("OrganizationId")
        @NotBlank(groups = PrescriptionInfo.class, message = "机构Id 不能为空")
        private String organizationId;

        @ApiProperty("患者")
        @XmlElement(name = "PatientId")
        @XStreamAlias("PatientId")
        //@AtLeastOneNotEmpty(groups={PrescriptionInfo.class,PatientInfo.class},message = "患者或者病案号 至少有一个不为空！")
        private String patientId;

        @ApiProperty("病案号")
        @XmlElement(name = "CaseNo")
        @XStreamAlias("CaseNo")
        //@AtLeastOneNotEmpty(groups={PrescriptionInfo.class,PatientInfo.class},message = "患者或者病案号 至少有一个不为空！")
        private String caseNo;

        @ApiProperty("就诊流程ID")
        @XmlElement(name = "VisitId")
        @XStreamAlias("VisitId")
        //@AtLeastOneNotEmpty(groups={PrescriptionInfo.class,VisitInfo.class},message = "就诊流程ID或者门诊就诊次数 至少有一个不为空！")
        private String visitId;

        @ApiProperty("就诊流程类型编码")
        @XmlElement(name = "VisitTypeCode")
        @XStreamAlias("VisitTypeCode")
        private String visitTypeCode;

        @ApiProperty("门诊就诊次数")
        @XmlElement(name = "OutpatientTime")
        @XStreamAlias("OutpatientTime")
        //@AtLeastOneNotEmpty(groups={PrescriptionInfo.class,VisitInfo.class},message = "就诊流程ID或者门诊就诊次数 至少有一个不为空！")
        private String outpatientTime;
}
