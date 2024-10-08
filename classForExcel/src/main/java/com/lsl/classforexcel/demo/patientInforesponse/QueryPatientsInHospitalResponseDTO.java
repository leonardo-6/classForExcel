package com.lsl.classforexcel.demo.patientInforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.List;


/**
 * @version v1.0
 * @ProjectName: biz-pi
 * @ClassName: AddressResponse
 * @Description:
 * @Author: lsl
 * @Date: 2024/08/30 17:03
 */
@Data
@RpcModel("在院病人基本情况")
@XStreamAlias("Response")
public class QueryPatientsInHospitalResponseDTO {

    @XStreamAlias("PatientInfo")
    @RpcModelProperty(value = "患者信息")
    private PatientInfoResponseDTO patientInfo;

    @XStreamAlias("BasicCardResponsePatientList")
    @RpcModelProperty(value = "患者基本卡列表")
    private List<BasicCardPatientResponseDTO> basicCardResponseListPatient;

    @XStreamAlias("AddressResponseList")
    @RpcModelProperty(value = "患者地址列表")
    private List<AddressResponseDTO> addressResponseList;

    @XStreamAlias("ContactResponseList")
    @RpcModelProperty(value = "患者联系人列表")
    private List<ContactResponseDTO> contactResponseList;

    @XStreamAlias("AllergyResponseList")
    @RpcModelProperty(value = "患者过敏列表")
    private List<AllergyResponseDTO> allergyResponseList;

    @XStreamAlias("HospitalizationResponse")
    @RpcModelProperty(value = "住院流程信息")
    private HospitalizationResponseDTO hospitalizationResponse;

    @XStreamAlias("MedicalEmployeeList")
    @RpcModelProperty(value = "医疗人员列表")
    private List<MedicalEmployeeResponseDTO> medicalEmployeeList;

    @XStreamAlias("DiagnosisProgressList")
    @RpcModelProperty(value = "诊断过程列表")
    private List<DiagnosisProgressResponseDTO> diagnosisProgressList;

    @XStreamAlias("DepositResponse")
    @RpcModelProperty(value = "患者预缴金")
    private DepositResponseDTO depositResponse;

    @XStreamAlias("BedIconList")
    @RpcModelProperty(value = "床卡图标列表")
    private List<BedIconResponseDTO> bedIconList;
}
