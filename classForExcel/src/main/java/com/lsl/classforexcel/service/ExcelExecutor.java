package com.lsl.classforexcel.service;

import com.lsl.classforexcel.demo.*;
import com.lsl.classforexcel.demo.doctoradviceInfo.QueryDoctorAdviceInfoResponseDTO;
import com.lsl.classforexcel.demo.operationinforesponse.QueryOperationInfoResponseDTO;
import com.lsl.classforexcel.demo.patientinspectinforesponse.QueryPatientInspectInfoResponseDTO;
import com.lsl.classforexcel.demo.prescriptioninforesponse.PrescriptionInfoResponseDTO;
import com.lsl.classforexcel.util.ExcelUtil;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExcelExecutor {

    public static void main(String[] args) {
        // 示例：导出一个实体类到Excel
        ExcelUtil.exportEntityToExcel(GetMedicalPriceListResponseDTO.class);
    }

   /* public static String sql (){
        StringBuilder sql = new StringBuilder();
        sql.append("select * from ( ");
        sql.append(" select id_bdvismedwf, sd_pointmech,cd, na, url,id_fu_vismedwf,overtime, trans_num, id_fuc, sd_pointmech_cd, na_type, na_handle, na_type_serv, na_type_fun from hi_bd_vis_medwf where id_tet = :idTet and id_bdmd = :idBdmd and sd_vismedwftp_cd = :sdVismedwftpCd and na_type = :naType and fg_active = '1' and delete_flag = '0' and (fg_org = '0' or fg_org is null) and (fg_dep = '0' or fg_dep is null) ");
        sql.append(" union all select wf.id_bdvismedwf, wf.sd_pointmech,wf.cd, wf.na, wf.url,wf.id_fu_vismedwf,wf.overtime, wf.trans_num, wf.id_fuc, wf.sd_pointmech_cd, wf.na_type, wf.na_handle, wf.na_type_serv, wf.na_type_fun from hi_bd_vis_medwf wf left join HI_BD_VIS_MEDWF_ORGDEP orgdep on wf.id_bdvismedwf = orgdep.id_bdvismedwf where wf.id_tet = :idTet and wf.id_bdmd = :idBdmd and wf.sd_vismedwftp_cd = :sdVismedwftpCd and wf.na_type = :naType and wf.fg_active = '1' and wf.delete_flag = '0' and wf.fg_org = '1' and orgdep.id_org = '"
                + "6045d1b8d0081238ab92050a"
                + "' and (orgdep.id_dep is null or orgdep.id_dep = '"
                + "6045e79ad0081238ab9dc8a2" + "') ");
        sql.append(") order by trans_num");
        return sql.toString();
    }*/
}
