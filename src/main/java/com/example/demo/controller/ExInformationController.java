package com.example.demo.controller;

import com.example.demo.entity.ExInformationEntity;
import com.example.demo.service.ExInformationService;
import com.example.demo.utils.JsonResult;
import com.example.demo.utils.MapUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0.0
 * @className: ExInformationController
 * @author: ning li
 * @date: 2024/1/25
 **/

@RestController
@RequestMapping("/exInformation")
@Slf4j
@Api(tags = "展品信息")
public class ExInformationController {

    @Autowired
    private ExInformationService exInformationService;

    @GetMapping("/queryExInformation")
    @ApiOperation(value = "展示展品信息", notes = "展示展品信息", produces = MediaType.APPLICATION_JSON_VALUE)
    public JsonResult<?> getPersonRoad(@RequestParam Map map) {
        try{
            MapUtils params = MapUtils.getInstance(map);
            Integer type = params.getInteger("type");
            List<ExInformationEntity> list = exInformationService.queryExInformation(type);
            return JsonResult.ok().put(list);
        }
        catch (Exception e){
            e.printStackTrace();
            return JsonResult.error("展示展品失败");
        }
    }


}
