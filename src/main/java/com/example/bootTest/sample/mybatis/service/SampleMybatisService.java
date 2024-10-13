package com.example.bootTest.sample.mybatis.service;

import java.util.List;

import com.example.bootTest.sample.mybatis.vo.ItemVo;
import com.example.bootTest.sample.mybatis.vo.SampleMybatisVo;

public interface SampleMybatisService {
     // 전체 리스트 조회
    List<ItemVo> list();

    void testInsert(SampleMybatisVo sampleMybatisVo);
}
