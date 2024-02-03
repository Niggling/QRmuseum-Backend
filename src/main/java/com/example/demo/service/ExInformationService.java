package com.example.demo.service;

import com.example.demo.entity.ExInformationEntity;
import com.example.demo.vo.ExInformationAndAuthorVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0.0
 * @className: ExImformationService
 * @author: ning li
 * @date: 2024/1/25
 **/

@Service
public interface ExInformationService {


//    JsonResult<?> addArea(MapUtils params);
//
//    List<SysOfficeEntity> queryAreas();

    List<ExInformationEntity> queryExInformation(@Param("type") int type);

    ExInformationAndAuthorVO selectExInformationAndAuthor(@Param("type") int id);


}


