package com.test;

import com.nh.micro.demo.RunApplication;
import com.nh.micro.demo.dao.MicroTestMapper;
import com.nh.micro.demo.entity.ExtEntity;
import com.nh.micro.demo.entity.TestDto;
import com.nh.micro.ext.ExtBeanWrapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        contacts.add("13512345678");
        contacts.add("13512345679");
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
                ExtEntity extEntity=(ExtEntity) extBeanWrapper.getObj(ExtEntity.class);
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
