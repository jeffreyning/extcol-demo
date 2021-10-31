package com.test;

import com.nh.micro.demo.RunApplication;
import com.nh.micro.demo.dao.MicroTestMapper;
import com.nh.micro.demo.entity.ExtEntity;
import com.nh.micro.demo.entity.SubEntity;
import com.nh.micro.demo.entity.TestDto;
import com.nh.micro.ext.ExtBeanWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.alibaba.fastjson.TypeReference;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=RunApplication.class)
public class TestExtcolDemo {
    @Autowired
    private MicroTestMapper microTestMapper;

    @Test
    public void createJson(){
        TestDto testDto=new TestDto();
        testDto.setId(2);
        testDto.setMetaName("n1");
        ExtBeanWrapper extBeanWrapper=new ExtBeanWrapper();
        ExtEntity extEntity=new ExtEntity();
        extEntity.setInsureNum(123123);
        extEntity.setInsureType("car");
        List contacts=new ArrayList();
        //contacts.add("13512345678");
        //contacts.add("13512345679");
        SubEntity subEntity1=new SubEntity();
        subEntity1.setSub1("s1");
        subEntity1.setSub2("s2");
        subEntity1.setSub3(1);
        contacts.add(subEntity1);
        SubEntity subEntity2=new SubEntity();
        subEntity2.setSub1("s21");
        subEntity2.setSub2("s22");
        contacts.add(subEntity2);
        extEntity.setContacts(contacts);
        extBeanWrapper.setObj(extEntity);
        testDto.setExtcol(extBeanWrapper);
        microTestMapper.createJson(testDto);

    }

    @Test
    public void getInfo4JsonXml(){
        List<TestDto> retList=microTestMapper.getInfo4JsonXml();
        if(retList!=null){
            for(TestDto testDto:retList){
                ExtBeanWrapper extBeanWrapper=testDto.getExtcol();
                ExtEntity<SubEntity> extEntity=  extBeanWrapper.getObj(ExtEntity.class);
                System.out.println(extEntity.getInsureNum());
            }
        }
        return ;
    }
    @Test
    public void getSubEntity4JsonXml(){
        List<TestDto> retList=microTestMapper.getInfo4JsonXml();
        if(retList!=null){
           for(TestDto testDto:retList){
                ExtBeanWrapper extBeanWrapper=testDto.getExtcol();
                ExtEntity extEntity= extBeanWrapper.getObj(new TypeReference<ExtEntity<SubEntity>>(){});
                System.out.println(extEntity.getInsureNum());
            }
        }
        return ;
    }
    @Test
    public void updateJson(){
        TestDto testDto=new TestDto();
        testDto.setId(1);
        ExtBeanWrapper extBeanWrapper=new ExtBeanWrapper();
        ExtEntity extEntity=new ExtEntity();
        extEntity.setInsureNum(123123);
        extBeanWrapper.setObj(extEntity);
        testDto.setExtcol(extBeanWrapper);
        microTestMapper.updateJson(testDto);
    }

    @Test
    public void updateJsonSubcol(){
        TestDto testDto=new TestDto();
        testDto.setId(1);
        ExtBeanWrapper extBeanWrapper=new ExtBeanWrapper();
        ExtEntity extEntity=new ExtEntity();
        extEntity.setInsureNum(123123);
        extBeanWrapper.setObj(extEntity);
        testDto.setExtcol(extBeanWrapper);
        microTestMapper.updateJsonSubcol(testDto);

    }

    @Test
    public void updateJsonAll(){
        TestDto testDto=new TestDto();
        testDto.setId(1);
        ExtBeanWrapper extBeanWrapper=new ExtBeanWrapper();
        ExtEntity extEntity=new ExtEntity();
        extEntity.setInsureNum(123123);
        extBeanWrapper.setObj(extEntity);
        testDto.setExtcol(extBeanWrapper);
        microTestMapper.updateJsonAll(testDto);
    }

}
