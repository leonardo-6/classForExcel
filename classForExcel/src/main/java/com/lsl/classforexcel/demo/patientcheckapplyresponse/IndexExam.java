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
@XStreamAlias("IndexExam")
public class IndexExam {
    /**
     * 检查部位编码
     */
    @RpcModelProperty("检查部位编码")
    private String indexExamCode;

    /**
     * 检查部位名称
     */
    @RpcModelProperty("检查部位名称")
    private String indexExamName;

}
