package com.xuecheng.content.api;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author pangwy
 * @Date 2024/8/21 16:27
 * @PackageName:com.xuecheng.content.api
 * @ClassName: CourseCategoryController
 * @Description: 课程分类相关
 * @Version 1.0
 */
@Slf4j
@RestController
public class CourseCategoryController {


    @GetMapping("/course-category/tree-nodes")
    public List<CourseCategoryTreeDto> queryTreeNodes() {
        return null;
    }
}