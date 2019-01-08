package com.sola.sccommon.client;

import com.sola.sccommon.bean.ResponseMessage;
import com.sola.sccommon.hystrix.UserServiceHystrix;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author Sola
 * @date 2018/12/25
 */
@FeignClient(value = "sc-user", fallback = UserServiceHystrix.class)
public interface UserClient {

    /**
     * 获取用户
     *
     * @return
     */
    @RequestLine("GET /user/1")
    ResponseMessage getUser();

}
