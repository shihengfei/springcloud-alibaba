package com.afei.cloud.controller;

import com.afei.cloud.feign.ProductFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 消费者
 * @author shihengfei
 */
@Slf4j
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ProductFeign productFeign;

    @GetMapping("/getDetail")
    public Map<String,Object> getDetail(){
        log.info("进入消费者服务.....端口:{}",port);
        Map<String, Object> detail = productFeign.getDetail();
        detail.put("consumer","消费者端口:"+port);
        return detail;
    }
}
