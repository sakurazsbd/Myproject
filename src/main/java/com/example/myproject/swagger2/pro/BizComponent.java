package com.example.myproject.swagger2.pro;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author: lixl
 * @Date: 2022/1/15 13:43
 * @Descrption
 */

@ApiModel(value = "BizComponent对象", description="组件")
public class BizComponent implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标识")
    private Long id;

    @ApiModelProperty(value = "分类")
    private Long categoryId;

    @ApiModelProperty(value = "组件名称")
    private String name;

    @ApiModelProperty(value = "组件描述")
    private String description;

    @ApiModelProperty(value = "日期字段")
    private LocalDateTime componentTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifiedTime;

    public BizComponent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getComponentTime() {
        return componentTime;
    }

    public void setComponentTime(LocalDateTime componentTime) {
        this.componentTime = componentTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(LocalDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

}
