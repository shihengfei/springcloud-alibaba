package com.afei.cloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * feign 调用
 * FeignClient 注解，指定服务
 * @author shihengfei
 */
@FeignClient("product")
@RequestMapping("/product")
public interface ProductFeign {
    @GetMapping("/detail")
    Map<String,Object> getDetail();
}
