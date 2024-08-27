package com.xuecheng.content.model.dto;

/**
 * @Author pangwy
 * @Date 2024/8/24 21:36
 * @PackageName:com.xuecheng.content.model.dto
 * @ClassName: SaveTeachplanDto
 * @Description: 新增大章节、小章节、修改章节信息
 * @Version 1.0
 */
public class SaveTeachplanDto {
    /***
     * 教学计划id
     */
    private Long id;

    /**
     * 课程计划名称
     */
    private String pname;

    /**
     * 课程计划父级Id
     */
    private Long parentid;

    /**
     * 层级，分为1、2、3级
     */
    private Integer grade;

    /**
     * 课程类型:1视频、2文档
     */
    private String mediaType;


    /**
     * 课程标识
     */
    private Long courseId;

    /**
     * 课程发布标识
     */
    private Long coursePubId;


    /**
     * 是否支持试学或预览（试看）
     */
    private String isPreview;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getCoursePubId() {
        return coursePubId;
    }

    public void setCoursePubId(Long coursePubId) {
        this.coursePubId = coursePubId;
    }

    public String getIsPreview() {
        return isPreview;
    }

    public void setIsPreview(String isPreview) {
        this.isPreview = isPreview;
    }
}
