package com.lsl.classforexcel.demo.doctoradviceInfo;

import com.bsoft.superhub.boot.swagger.annotation.RpcModelProperty;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XStreamAlias("Response")
public class QueryDoctorAdviceInfoResponseDTO {

      @RpcModelProperty(value = "医嘱病案信息集合")
      private List<QueryDoctorAdviceInfoDTO> orderInfoList;

}
