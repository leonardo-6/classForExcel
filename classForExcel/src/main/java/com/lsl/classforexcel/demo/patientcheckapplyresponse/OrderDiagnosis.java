package com.lsl.classforexcel.demo.patientcheckapplyresponse;


import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * <p>
 * 检查部位
 * </p>
 *
 * @author lsl
 */
@RpcModel("检查部位")
@Data
@XStreamAlias("OrderDiagnosis")
public class OrderDiagnosis {

    @RpcModelProperty("诊断过程类型编码")
    private String diagnosisProcessTypeCode;

    @RpcModelProperty("诊断过程类型名称")
    private String diagnosisProcessTypeName;

    @RpcModelProperty("诊断学科类型编码")
    private String diagnosisSubjectTypeCode;

    @RpcModelProperty("诊断学科类型名称")
    private String diagnosisSubjectTypeName;

    @RpcModelProperty("疾病诊断名称(症候串)")
    private String diagnosisName;

    @RpcModelProperty("疾病诊断编码")
    private String diagnosisCode;

    /*@RpcModelProperty("疾病诊断名称")
    private String diagnosisName;*/

    @RpcModelProperty("关联诊断明细ID串")
    private String diagnosisDetailsId;

}
