package com.lsl.classforexcel.demo.doctoradviceInfo;

import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XStreamAlias("OrderInfo")
public class QueryDoctorAdviceInfoDTO {

        @RpcModelProperty(value = "病案号")
        private String caseNo;

        @RpcModelProperty(value = "医嘱Id")
        private String orderId;

        @RpcModelProperty(value = "医嘱时间")
        private Date signDate;

        @RpcModelProperty(value = "开立医生CD")
        private String entryEmployeeCode;

        @RpcModelProperty(value = "开立医生NA")
        private String entryEmployeeName;

        @RpcModelProperty(value = "签署医生CD")
        private String signEmployeeCode;

        @RpcModelProperty(value = "签署医生NA")
        private String signEmployeeName;

        @RpcModelProperty(value = "医嘱类型")
        private String serviceItemTypeCode;

        @RpcModelProperty(value = "医嘱状态ID")
        private String statusId;

        @RpcModelProperty(value = "医嘱状态CD")
        private String statusCode;

        @RpcModelProperty(value = "医嘱状态NA")
        private String statusName;

        @RpcModelProperty(value = "用法")
        private String usageName;

        @RpcModelProperty(value = "医嘱内容")
        private String orderDescription;

        @RpcModelProperty(value = "医嘱内容")
        private List<OrderDrugInfo>  orderDrugInfoList;

        @RpcModelProperty(value = "医嘱开始时间")
        private Date activeDate;

        @RpcModelProperty(value = "医嘱结束时间")
        private Date orderStopDate;

        @RpcModelProperty(value = "医嘱长期临时模式编码")
        private String longTemporaryModeCode;

        @RpcModelProperty(value = "是否阳性")
        private String newResultCode;

        @RpcModelProperty(value = "创建时间")
        private Date createDate;

}
