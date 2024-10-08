package com.lsl.classforexcel.demo;

import com.fasterxml.jackson.annotation.JsonFormat;
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
import java.util.Date;

@Data
@XmlRootElement(name = "Query")
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XStreamAlias("Query")
public class QueryPatientCheckApplyRequestDTO {

        /** 1. 检查医嘱信息 **/
        public interface queryPatientCheckApply extends Default {}

        @ApiProperty("机构Id")
        @XmlElement(name = "OrganizationId")
        @XStreamAlias("OrganizationId")
        @NotBlank(groups = queryPatientCheckApply.class, message = "机构Id 不能为空")
        private String organizationId;

        @ApiProperty("开立科室编码")
        @XmlElement(name = "CreateDepartmentCode")
        @XStreamAlias("CreateDepartmentCode")
        private String createDepartmentCode;

        @ApiProperty("执行科室编码")
        @XmlElement(name = "ExecuteDepartmentCode")
        @XStreamAlias("ExecuteDepartmentCode")
        private String executeDepartmentCode;

        @ApiProperty("就诊流程类型编码")
        @XmlElement(name = "VisitTypeCode")
        @XStreamAlias("VisitTypeCode")
        private String visitTypeCode;

        @ApiProperty("患者Id")
        @XmlElement(name = "PatientId")
        @XStreamAlias("PatientId")
        private String patientId;

        @ApiProperty("病案号")
        @XmlElement(name = "CaseNo")
        @XStreamAlias("CaseNo")
        private String caseNo;

        @ApiProperty("证件号")
        @XmlElement(name = "CertificateNo")
        @XStreamAlias("CertificateNo")
        private String certificateNo;

        @ApiProperty("签署开始时间")
        @XmlElement(name = "SignStartTime")
        @XStreamAlias("SignStartTime")
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        private Date signStartTime;

        @ApiProperty("签署结束时间")
        @XmlElement(name = "SignEndTime")
        @XStreamAlias("SignEndTime")
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
        private Date signEndTime;

        @ApiProperty("分页大小")
        @XmlElement(name = "PageSize")
        @XStreamAlias("PageSize")
        @NotNull(groups = queryPatientCheckApply.class,message = "分页大小 不能为空")
        private Integer pageSize;

        @ApiProperty("分页页码")
        @XmlElement(name = "PageIndex")
        @XStreamAlias("PageIndex")
        @NotNull(groups = queryPatientCheckApply.class,message = "分页页码 不能为空")
        private Integer pageIndex;

}
