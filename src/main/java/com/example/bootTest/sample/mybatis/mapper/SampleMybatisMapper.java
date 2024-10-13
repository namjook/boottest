package com.example.bootTest.sample.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.bootTest.sample.mybatis.vo.ItemVo;
import com.example.bootTest.sample.mybatis.vo.SampleMybatisVo;

@Mapper
public interface SampleMybatisMapper {
    
    //전체 리스트 조회
    public List<ItemVo> list();

    public void testInsert(SampleMybatisVo sampleMybatisVo);
    
}
