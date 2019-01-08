package com.sola.sccommon.exception;

import org.springframework.mail.MailException;

/**
 * @author Sola
 * @date 2019/01/04
 */
public class ScMailException extends MailException {

    public ScMailException(String msg) {
        super(msg);
    }

    public ScMailException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
