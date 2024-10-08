package com.lsl.classforexcel.demo.prescriptioninforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.Date;

@Data
@RpcModel("患者信息")
@XStreamAlias("PatientInfo")
public class PatientInfoDTO {

        @RpcModelProperty(value = "患者Id")
        private String patientId;

        @RpcModelProperty(value = "姓名")
        private String name;

        @RpcModelProperty(value = "性别")
        private String patientSex;

        @RpcModelProperty(value = "出生日期")
        private Date birthDate;

        @RpcModelProperty(value = "电话")
        private String phone;

        @RpcModelProperty(value = "费别")
        private String insurancePlanName;

        @RpcModelProperty(value = "证件类别")
        private String certificateType;

        @RpcModelProperty(value = "身份证号")
        private String certificateNumber;
}
