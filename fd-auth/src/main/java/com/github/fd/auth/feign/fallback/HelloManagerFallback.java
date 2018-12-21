package com.github.fd.auth.feign.fallback;

import com.github.fd.auth.feign.HelloManager;
import com.github.fd.common.vo.RestResult;
import org.springframework.stereotype.Component;

/**
 * hello 断路器
 *
 * @author mq
 */
@Component
public class HelloManagerFallback implements HelloManager {
    @Override
    public RestResult<String> hello(String name) {
        return RestResult.error("hello 断路器" );
    }
}
