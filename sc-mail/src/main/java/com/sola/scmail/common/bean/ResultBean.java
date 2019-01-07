package com.sola.scmail.common.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.http.HttpStatus;

/**
 * @author Sola
 * @date 2018/10/25
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultBean<T> {

    private HttpStatus httpStatus;
    private String msg;
    private T data;

}
