package com.example.bootTest.sample.mybatis.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.bootTest.sample.mybatis.service.SampleMybatisService;
import com.example.bootTest.sample.mybatis.vo.ItemVo;
import com.example.bootTest.sample.mybatis.vo.SampleMybatisVo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@CrossOrigin
@RequestMapping(value = "/api") 
public class SampleMybatisController {
    
     @Autowired
    private SampleMybatisService sampleMybatisService;
    
    /**
     * 전체 리스트 조회
     * @return  전체 리스트
     */
    @GetMapping(value = "/list")
    @ResponseBody
    //public ResponseEntity<?> list() {
        public List<ItemVo> list() {
        
        List<ItemVo> itemList = sampleMybatisService.list();
        //return ResponseEntity.ok().body(sampleMybatisService.list());

        return itemList;
    }

    @PostMapping("/insert")
    public void postMethodName(@RequestBody SampleMybatisVo sm) {
        //TODO: process POST request

        System.out.println(sm + "넘어온거뭐냐111222332323232");

        System.out.println(sm.getId() + "아이디");
        System.out.println(sm.getTitle() + "타이틀");
        System.out.println(sm.getContent() + "내용");

        //SampleMybatisVo sampleMybatisVo = new SampleMybatisVo();

        //sampleMybatisVo.setId(sm.getId());

        sampleMybatisService.testInsert(sm);
    }
  

    @GetMapping("/list2")
    @ResponseBody
    public List<Map<String, Object>> greet() {
        
        List<Map<String, Object>> dataList = new ArrayList<>();

        Map<String, Object> data1 = new HashMap();
        
        data1.put("id", "3");
        data1.put("title", "White and Black");
        data1.put("content", "Born in France");
        data1.put("price", "120000");

        dataList.add(data1);

        Map<String, Object> data2 = new HashMap();
        
        data2.put("id", "4");
        data2.put("title", "White and Black");
        data2.put("content", "Born in France");
        data2.put("price", "120000");

        dataList.add(data2);

        Map<String, Object> data3 = new HashMap();
        
        data3.put("id", "5");
        data3.put("title", "White and Black");
        data3.put("content", "Born in France");
        data3.put("price", "120000");

        dataList.add(data3);

        //System.out.println(dataList);


        return dataList;
    }
}
