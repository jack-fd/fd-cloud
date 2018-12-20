package com.fd.auth.feign;

import com.mq.common.vo.RestResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户权限系统 Hello
 *
 * @author mq
 */
@FeignClient(value = "fd-modules-upms")
public interface HelloManager {

    @GetMapping("/hello")
    RestResult<String> hello(@RequestParam(value = "name") String name);
}
