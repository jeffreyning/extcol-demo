package com.nh.micro.demo.dao;
import com.nh.micro.demo.entity.TestDto;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MicroTestMapper {
    //创建记录
    public void createJson(TestDto testDto);
    //查询记录
    public List<TestDto> getInfo4JsonXml();
    //动态局部更新json字段
    public void updateJson(TestDto testDto);
    //更新指定json字段中的子元素
    public void updateJsonSubcol(TestDto testDto);
    //整体更新json字段
    public void updateJsonAll(TestDto testDto);
}
