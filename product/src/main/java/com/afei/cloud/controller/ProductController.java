package com.afei.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 生产者
 * @author shihengfei
 */
@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/detail")
    public Map<String,Object> getDetail(){
        log.info("生产者获取详情.......端口:{}",port);
        HashMap<String, Object> map = new HashMap<>(2);
        map.put("status",200);
        map.put("product","生产者端口:"+port);
        return map;
    }
}
