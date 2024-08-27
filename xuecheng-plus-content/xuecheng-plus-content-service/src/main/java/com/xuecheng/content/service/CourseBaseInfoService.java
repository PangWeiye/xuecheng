package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.EditCourseDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @Author pangwy
 * @Date 2024/8/19 21:41
 * @PackageName:com.xuecheng.content.service
 * @ClassName: CourseBaseInfoService
 * @Description: 课程信息管理接口
 * @Version 1.0
 */
public interface CourseBaseInfoService {
    public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    /**
     * 新增课程
     * @param companyId 机构id
     * @param addCourseDto 课程信息
     * @return 课程详细信息
     */
    public CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);

    /**
     * 根据课程的ID查询课程信息
     * @param courseId
     * @return
     */
    public CourseBaseInfoDto getCourseBaseInfo(Long courseId);

    /**
     * 修改课程
     * @param editCourseDto 修改课程信息
     * @param courseId 机构id
     * @return
     */
    public CourseBaseInfoDto updateCourseBase(Long companyId,EditCourseDto dto);
}
