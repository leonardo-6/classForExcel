package com.lsl.classforexcel.demo.patientInforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import lombok.Data;

import java.util.Date;


/**
 * @version v1.0
 * @ProjectName: biz-pi
 * @ClassName: AddressResponse
 * @Description:
 * @Author: lsl
 * @Date: 2024/08/30 17:03
 */
@Data
@RpcModel("住院流程信息")
public class HospitalizationResponseDTO {

    @RpcModelProperty(value = "就诊流程ID")
    private String visitId;

    @RpcModelProperty(value = "科室编码")
    private String departmentCode;

    @RpcModelProperty(value = "科室名称")
    private String departmentName;

    @RpcModelProperty(value = "病区编码")
    private String wardCode;

    @RpcModelProperty(value = "病区名称")
    private String wardName;

    @RpcModelProperty(value = "房间号")
    private String roomNo;

    @RpcModelProperty(value = "床位编码")
    private String bedCode;

    @RpcModelProperty(value = "床位号")
    private String bedNo;

    @RpcModelProperty(value = "入科时间")
    private Date departmentDate;

    @RpcModelProperty(value = "入院科室编码")
    private String admissionDepartmentCode;

    @RpcModelProperty(value = "入院科室名称")
    private String admissionDepartmentName;

    @RpcModelProperty(value = "入院时间")
    private Date admissionDate;

    @RpcModelProperty(value = "出院时间")
    private Date dischargeDate;

    @RpcModelProperty(value = "死亡日期")
    private Date deathDate;

    @RpcModelProperty(value = "手术日期")
    private Date surgeryDate;

    @RpcModelProperty(value = "住院状态编码")
    private String visitStateCode;

    @RpcModelProperty(value = "住院状态名称")
    private String visitStateName;

    @RpcModelProperty(value = "护理级别编码")
    private String nurseRankCode;

    @RpcModelProperty(value = "护理级别名称")
    private String nurseRankName;

    @RpcModelProperty(value = "饮食情况编码")
    private String dietSituationCode;

    @RpcModelProperty(value = "饮食情况名称")
    private String dietSituationName;

    @RpcModelProperty(value = "入院途径编码")
    private String admissionRouteCode;

    @RpcModelProperty(value = "入院途径名称")
    private String admissionRouteName;

    @RpcModelProperty(value = "保险计划ID")
    private String insurancePlanId;

    @RpcModelProperty(value = "保险计划编码")
    private String insuranceCode;

    @RpcModelProperty(value = "保险计划名称")
    private String insuranceName;
}
