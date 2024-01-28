package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.ExInformationEntity;
import com.example.demo.mapper.ExInformationMapper;
import com.example.demo.service.ExInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0.0
 * @className: ExImformationServiceImpl
 * @author: ning li
 * @date: 2024/1/25
 **/
@Service
public class ExImformationServiceImpl implements ExInformationService {

    @Autowired
    private ExInformationMapper exInformationMapper;

    @Override
    public List<ExInformationEntity> queryExInformation(int type) {
            List<ExInformationEntity> list;
            list = exInformationMapper.selectList(
                    new QueryWrapper<ExInformationEntity>()
                            .eq("type", type)
                            .eq("del_flag", 0)
            );
            return list;
    }


}
