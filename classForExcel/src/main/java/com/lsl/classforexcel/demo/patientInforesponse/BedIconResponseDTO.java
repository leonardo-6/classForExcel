package com.lsl.classforexcel.demo.patientInforesponse;

import com.bsoft.superhub.boot.swagger.annotation.RpcModel;
import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;


/**
 * @version v1.0
 * @ProjectName: biz-pi
 * @ClassName: AddressResponse
 * @Description:
 * @Author: lsl
 * @Date: 2024/08/30 17:03
 */
@Data
@RpcModel("床卡图标信息")
@XStreamAlias("BedIcon")
public class BedIconResponseDTO {

    @RpcModelProperty(value = "就诊流程ID")
    private String visitId;

    @RpcModelProperty(value = "床位ID")
    private String bedId;

    @RpcModelProperty(value = "床卡图标编码")
    private String iconCode;

    @RpcModelProperty(value = "床卡图标名称")
    private String iconName;

    @RpcModelProperty(value = "备注")
    private String note;
}
