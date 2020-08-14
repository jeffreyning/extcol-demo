package com.nh.micro.demo.entity;


import com.nh.micro.ext.ExtBeanWrapper;

import java.util.Date;

public class TestDto  {
    private Integer id;
    private String metaKey;
    private String metaName;
    private String metaType;
    private Date createTime;
    private ExtBeanWrapper extcol;
    public Integer getId() { return id; }
    public void setId(Integer id) {this.id = id;}
    public String getMetaKey() {return metaKey;}
    public void setMetaKey(String metaKey) {this.metaKey = metaKey;}
    public String getMetaName() {return metaName;}
    public void setMetaName(String metaName) {this.metaName = metaName;}
    public String getMetaType() {return metaType;}
    public void setMetaType(String metaType) {this.metaType = metaType; }
    public Date getCreateTime() {return createTime;}
    public void setCreateTime(Date createTime) {this.createTime = createTime;}
    public ExtBeanWrapper getExtcol() {return extcol; }
    public void setExtcol(ExtBeanWrapper extcol) {this.extcol=extcol; }
}
