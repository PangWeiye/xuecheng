package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
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
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
