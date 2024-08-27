package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.Teachplan;
import com.xuecheng.content.model.po.TeachplanMedia;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Author pangwy
 * @Date 2024/8/24 19:19
 * @PackageName:com.xuecheng.content.model.dto
 * @ClassName: TeachplanDto
 * @Description: 课程计划信息模型类
 * @Version 1.0
 */

@Data
@ToString
public class TeachplanDto extends Teachplan {
    //与媒资管理信息
    private TeachplanMedia teachplanMedia;
    //小章节list
    private List<TeachplanDto> teachPlanTreeNodes;
}

