package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @Author pangwy
 * @Date 2024/8/22 15:23
 * @PackageName:com.xuecheng.content.service
 * @ClassName: CourseCategoryService
 * @Description: TODO
 * @Version 1.0
 */
public interface CourseCategoryService {
    /**
     * 课程分类树形结构查询
     *
     * @return
     */
    public List<CourseCategoryTreeDto> queryTreeNodes(String id);
}
