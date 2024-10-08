package com.lsl.classforexcel.demo.operationinforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

import java.util.List;

/**
 * 手术信息查询
 *
 * @author fangpj
 */
@Data
@RpcModel("查询手术信息")
public class QueryOperationInfoResponseDTO {

    @XStreamAlias("SurgeryOrderList")
    @RpcModelProperty(value = "手术医嘱列表")
    private List<SurgeryOrderDTO> surgeryOrderList;

}
