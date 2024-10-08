package com.lsl.classforexcel.demo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import ctd.swagger.annotation.ApiProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * 手术信息查询
 *
 * @author fangpj
 */
@Data
@XmlRootElement(name = "Query")
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XStreamAlias("Query")
public class QueryOperationInfoRequestDTO {

    @ApiProperty("机构id")
    @XmlElement(name = "OrganizationId")
    @XStreamAlias("OrganizationId")
    private String organizationId;

    @ApiProperty("租户")
    @XmlElement(name = "TenantId")
    @XStreamAlias("TenantId")
    private String tenantId;

    @ApiProperty("就诊流程ID")
    @XmlElement(name = "VisitId")
    @XStreamAlias("VisitId")
    private String visitId;

    @ApiProperty("患者ID")
    @XmlElement(name = "PatientId")
    @XStreamAlias("PatientId")
    private String patientId;

    @ApiProperty("就诊流程类型编码")
    @XmlElement(name = "VisitTypeCode")
    @XStreamAlias("VisitTypeCode")
    private String visitTypeCode;

    @ApiProperty("病案号")
    @XmlElement(name = "CaseNo")
    @XStreamAlias("CaseNo")
    private String caseNo;

    @ApiProperty("住院就诊次数")
    @XmlElement(name = "HospitalizationTime")
    @XStreamAlias("HospitalizationTime")
    private String hospitalizationTime;

    @ApiProperty("申请手术开始时间")
    @XmlElement(name = "ApplyPlanStartTime")
    @XStreamAlias("ApplyPlanStartTime")
    private Date applyPlanStartTime;

    @ApiProperty("申请手术结束时间")
    @XmlElement(name = "ApplyPlanEndTime")
    @XStreamAlias("ApplyPlanEndTime")
    private Date applyPlanEndTime;

}
