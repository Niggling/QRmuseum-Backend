package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @version 1.0.0
 * @className: ExAuthorEntity
 * @author: ning li
 * @date: 2024/1/25
 **/

@Data
@TableName("ex_author")
@ApiModel(value="ExAuthorEntity对象", description="作者表")
public class ExAuthorEntity {
    @ApiModelProperty(value = "主键")
    @TableField("id")
    private int id;

    @ApiModelProperty(value = "作者姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "作者介绍")
    @TableField("introduction")
    private String introduction;

    @ApiModelProperty(value = "照片路径")
    @TableField("picture_path")
    private String picturePath;

    @ApiModelProperty(value = "删除标识")
    @TableField("del_flag")
    private int delFlag;


}
