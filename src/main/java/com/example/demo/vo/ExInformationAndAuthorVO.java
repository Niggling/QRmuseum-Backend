package com.example.demo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0.0
 * @className: ExInformationAndAuthorVO
 * @author: ning li
 * @date: 2024/2/3
 **/

@Data
public class ExInformationAndAuthorVO {
    @ApiModelProperty(value = "主键")
    private int id;

    @ApiModelProperty(value = "展品名")
    private String name;

    @ApiModelProperty(value = "展品类型")
    private int type;//1为唐卡，2堆绣，3泥塑，4彩绘，5壁画，6其他

    @ApiModelProperty(value = "作者id")
    private int authorId;

    @ApiModelProperty(value = "展品信息")
    private String information;

    @ApiModelProperty(value = "图片路径")
    private String picturePath;

    @ApiModelProperty(value = "展品尺寸")
    private String size;

    @ApiModelProperty(value = "展品创作时间")
    private String createTime;

    @ApiModelProperty(value = "作者姓名")
    private String authorName;

    @ApiModelProperty(value = "作者介绍")
    private String authorIntroduction;

    @ApiModelProperty(value = "照片路径")
    private String authorPicturePath;





}
