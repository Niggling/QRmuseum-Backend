package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0.0
 * @className: ExInformationEntity
 * @author: ning li
 * @date: 2024/1/25
 **/

@Data
@TableName("ex_information")
@ApiModel(value="ExInformationEntity对象", description="展品信息表")
public class ExInformationEntity {
    @ApiModelProperty(value = "主键")
    @TableField("id")
    private int id;

    @ApiModelProperty(value = "展品名")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "展品类型")
    @TableField("type")
    private int type;//1为唐卡，2堆绣，3泥塑，4彩绘，5壁画，6其他

    @ApiModelProperty(value = "作者id")
    @TableField("author_id")
    private int authorId;

    @ApiModelProperty(value = "展品信息")
    @TableField("information")
    private String information;

    @ApiModelProperty(value = "图片路径")
    @TableField("picture_path")
    private String picturePath;

    @ApiModelProperty(value = "删除标识")
    @TableField("del_flag")
    private int delFlag;


}
