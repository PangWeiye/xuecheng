package com.xuecheng.content.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author pangwy
 * @Date 2024/8/24 14:31
 * @PackageName:com.xuecheng.content.model.dto
 * @ClassName: EditCourseDto
 * @Description: TODO
 * @Version 1.0
 */
@Data
@ApiModel(value="EditCourseDto", description="修改课程基本信息")
public class EditCourseDto extends AddCourseDto {

    @ApiModelProperty(value = "课程id", required = true)
    private Long id;

}