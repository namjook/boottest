package com.example.bootTest.sample.mybatis.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bootTest.sample.mybatis.mapper.SampleMybatisMapper;
import com.example.bootTest.sample.mybatis.service.SampleMybatisService;
import com.example.bootTest.sample.mybatis.vo.ItemVo;
import com.example.bootTest.sample.mybatis.vo.SampleMybatisVo;

@Service    //서비스 임을 명시
public class SampleMybatisServiceImpl implements SampleMybatisService{
    
    @Autowired
    private SampleMybatisMapper sampleMybatisMapper;

    /**
     * 전체 리스트 조회
     */
    @Override
    public List<ItemVo> list() {
        return sampleMybatisMapper.list();
    }

    @Override
    public void testInsert(SampleMybatisVo sampleMybatisVo) {

        System.out.println("인서트여기까지오나=======");
        sampleMybatisMapper.testInsert(sampleMybatisVo);
    }

    
}
