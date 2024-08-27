package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachplanDto;

import java.util.List;

/**
 * @Author pangwy
 * @Date 2024/8/24 20:35
 * @PackageName:com.xuecheng.content.service
 * @ClassName: TeachplanService
 * @Description: 课程计划管理相关接口
 * @Version 1.0
 */
public interface TeachplanService {
    /**
     * 根据课程id查询课程计划
     * @param courseId 课程计划
     * @return
     */

    public List<TeachplanDto> findTeachplanTree(Long courseId);

    /**
     * 新增/修改/保存课程计划
     * @param saveTeachplanDto
     */
    public void saveTeachplan(SaveTeachplanDto saveTeachplanDto);
}
