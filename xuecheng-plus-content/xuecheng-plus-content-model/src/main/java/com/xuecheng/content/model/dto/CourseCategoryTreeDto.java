package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.CourseCategory;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author pangwy
 * @Date 2024/8/21 16:22
 * @PackageName:com.xuecheng.content.model.dto
 * @ClassName: CourseCategoryTreeDto
 * @Description: TODO
 * @Version 1.0
 */
@Data
public class CourseCategoryTreeDto extends CourseCategory implements Serializable {
    //子节点
    List<CourseCategoryTreeDto> childrenTreeNodes;
}

