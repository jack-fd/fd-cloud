package com.github.fd.auth.feign;

import com.github.fd.auth.feign.fallback.HelloManagerFallback;
import com.github.fd.common.vo.RestResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户权限系统 Hello
 *
 * @author fd
 */
@FeignClient(value = "fd-modules-upms", fallback = HelloManagerFallback.class)
public interface HelloManager {

    @GetMapping("/hello" )
    RestResult<String> hello(@RequestParam(value = "name" ) String name);
}
