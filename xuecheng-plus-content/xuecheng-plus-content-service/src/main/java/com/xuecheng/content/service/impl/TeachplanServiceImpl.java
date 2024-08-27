package com.xuecheng.content.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.xuecheng.content.mapper.TeachplanMapper;
import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachplanDto;
import com.xuecheng.content.model.po.Teachplan;
import com.xuecheng.content.service.TeachplanService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author pangwy
 * @Date 2024/8/24 20:51
 * @PackageName:com.xuecheng.content.service.impl
 * @ClassName: TeachplanServiceImpl
 * @Description: TODO
 * @Version 1.0
 */
@Service
public class TeachplanServiceImpl implements TeachplanService {
    @Autowired
    TeachplanMapper teachplanMapper;
    @Override
    public List<TeachplanDto> findTeachplanTree(Long courseId) {
        return teachplanMapper.selectTreeNodes(courseId);
    }
    private int getTeachplanCount(long courseId,long parentId){
        LambdaQueryWrapper<Teachplan> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Teachplan::getCourseId,courseId);
        queryWrapper.eq(Teachplan::getParentid,parentId);
        Integer count = teachplanMapper.selectCount(queryWrapper);
        return count+1;
    }
    @Override
    public void saveTeachplan(SaveTeachplanDto saveTeachplanDto) {
        //通过课程计划id判断是新增还是修改
        Long teachplanId=saveTeachplanDto.getId();
        if(teachplanId==null){
            //新增
            Teachplan teachplan = new Teachplan();
            BeanUtils.copyProperties(saveTeachplanDto,teachplan);
            //确定排序的字段,找到同级节点个数，排序字段就是个数+1 select count(1) from teachplan where course_id=117 and parentid=268
            Long parentId=saveTeachplanDto.getParentid();
            Long courseId=saveTeachplanDto.getCourseId();
            int teachplanCount = getTeachplanCount(courseId, parentId);
            teachplan.setOrderby(teachplanCount);
            teachplanMapper.insert(teachplan);
        }else{
            //修改
            Teachplan teachplan = teachplanMapper.selectById(teachplanId);
            //将参数复制到teachplan
            BeanUtils.copyProperties(saveTeachplanDto,teachplan);
        }
    }
}
