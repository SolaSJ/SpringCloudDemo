package com.sola.sccommon.hystrix;

import com.sola.sccommon.bean.ResponseMessage;
import com.sola.sccommon.client.UserClient;
import org.springframework.stereotype.Component;

/**
 * @author Sola
 * @date 2018/12/25
 */
@Component
public class UserServiceHystrix implements UserClient {

    @Override
    public ResponseMessage getUser() {
        return new ResponseMessage("service is unavailable");
    }

}
