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
@RpcModel("患者联系人信息")
@XStreamAlias("ContactResponse")
public class ContactResponseDTO {

    @RpcModelProperty(value = "患者ID")
    private String patientId;

    @RpcModelProperty(value = "序号")
    private String serial;

    @RpcModelProperty(value = "省编码")
    private String provinceCode;

    @RpcModelProperty(value = "省名称")
    private String provinceName;

    @RpcModelProperty(value = "市编码")
    private String cityCode;

    @RpcModelProperty(value = "市名称")
    private String cityName;

    @RpcModelProperty(value = "区编码")
    private String countyCode;

    @RpcModelProperty(value = "区名称")
    private String countyName;

    @RpcModelProperty(value = "街道编码")
    private String townCode;

    @RpcModelProperty(value = "街道名称")
    private String townName;

    @RpcModelProperty(value = "村编码")
    private String villageCode;

    @RpcModelProperty(value = "村名称")
    private String villageName;

    @RpcModelProperty(value = "联系人地址")
    private String concatPersonAddress;

    @RpcModelProperty(value = "联系人姓名")
    private String name;

    @RpcModelProperty(value = "联系人电话号码")
    private String phone;

    @RpcModelProperty(value = "联系人与患者的关系编码")
    private String relationShipCode;

    @RpcModelProperty(value = "联系人与患者的关系名称")
    private String relationShipName;

    @RpcModelProperty(value = "联系人是否监护人")
    private String isGuardian;

    @RpcModelProperty(value = "监护人身份证件类别编码")
    private String guardianCertificateCode;

    @RpcModelProperty(value = "监护人身份证件类别名称")
    private String guardianCertificateName;

    @RpcModelProperty(value = "监护人身份证号码")
    private String guardianCertificateNumber;
}
