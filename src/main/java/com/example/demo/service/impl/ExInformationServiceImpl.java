package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.entity.ExAuthorEntity;
import com.example.demo.entity.ExInformationEntity;
import com.example.demo.mapper.ExAuthorMapper;
import com.example.demo.mapper.ExInformationMapper;
import com.example.demo.service.ExInformationService;
import com.example.demo.vo.ExInformationAndAuthorVO;
import org.springframework.beans.BeanUtils;
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
public class ExInformationServiceImpl implements ExInformationService {

    @Autowired
    private ExInformationMapper exInformationMapper;

    @Autowired
    private ExAuthorMapper exAuthorMapper;

    @Override
    public List<ExInformationEntity> queryExInformation(int type) {
        //根据类别查找展品
            List<ExInformationEntity> list;
            list = exInformationMapper.selectList(
                    new QueryWrapper<ExInformationEntity>()
                            .eq("type", type)
                            .eq("del_flag", 0)
            );
            return list;
    }

    @Override
    public ExInformationAndAuthorVO selectExInformationAndAuthor(int id) {
        //根据id查找展品及作者
        ExInformationAndAuthorVO result = new ExInformationAndAuthorVO();
        ExInformationEntity informationEntity = new ExInformationEntity();
        informationEntity = exInformationMapper.selectOne(
                new QueryWrapper<ExInformationEntity>()
                        .eq("id", id)
                        .eq("del_flag", 0)
        );
        ExAuthorEntity authorEntity = new ExAuthorEntity();
        authorEntity = exAuthorMapper.selectOne(
                new QueryWrapper<ExAuthorEntity>()
                        .eq("id", informationEntity.getAuthorId())
                        .eq("del_flag", 0)
        );
        BeanUtils.copyProperties(informationEntity, result);
        result.setAuthorName(authorEntity.getName());
        result.setAuthorIntroduction(authorEntity.getIntroduction());
        result.setAuthorPicturePath(authorEntity.getPicturePath());
        return result;
    }


}
