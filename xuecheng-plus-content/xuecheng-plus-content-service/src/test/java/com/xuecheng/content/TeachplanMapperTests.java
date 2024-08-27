package com.xuecheng.content;

import com.xuecheng.content.mapper.TeachplanMapper;
import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import com.xuecheng.content.model.dto.TeachplanDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author pangwy
 * @Date 2024/8/24 19:59
 * @PackageName:com.xuecheng.content
 * @ClassName: TeachplanMapperTests
 * @Description: 课程计划Mapper测试
 * @Version 1.0
 */
public class TeachplanMapperTests {
    @Autowired
    TeachplanMapper teachplanMapper;

    @Test
    public void testSelectTreeNodes() {
        List<TeachplanDto> teachplanDtos = teachplanMapper.selectTreeNodes(117L);
        System.out.println(teachplanDtos);
    }
}
