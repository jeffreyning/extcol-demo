package com.nh.micro.demo.entity;

import java.util.List;

public class ExtEntity<T> {
    private Integer insureNum;
    private String insureType;
    private List contacts;
    public Integer getInsureNum() {return insureNum;}
    public void setInsureNum(Integer insureNum) {this.insureNum = insureNum;}
    public String getInsureType() {return insureType; }
    public void setInsureType(String insureType) {this.insureType = insureType;}
    public List<T> getContacts() {return contacts; }
    public void setContacts(List<T> contacts) {this.contacts = contacts;    }
}

