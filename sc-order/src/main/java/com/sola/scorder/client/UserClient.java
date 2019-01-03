package com.sola.scorder.client;

import com.sola.scorder.hystrix.UserServiceHystrix;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Sola
 * @date 2018/12/25
 */
@FeignClient(value = "sc-user", fallback = UserServiceHystrix.class)
public interface UserClient {

    @RequestLine("GET /user/1")
    String getUser();

}
