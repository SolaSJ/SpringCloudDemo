package com.sola.scorder.hystrix;

import com.sola.scorder.client.UserClient;
import org.springframework.stereotype.Component;

/**
 * @author Sola
 * @date 2018/12/25
 */
@Component
public class UserServiceHystrix implements UserClient {

    @Override
    public String getUser() {
        return "service is unavailable";
    }

}
