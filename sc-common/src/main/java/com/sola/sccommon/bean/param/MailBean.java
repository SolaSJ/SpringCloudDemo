package com.sola.sccommon.bean.param;

import com.sola.sccommon.validators.constraints.ItemNotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @author Sola
 * @date 2019/01/04
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MailBean {

    @NotBlank
    private String from;

    private String replyTo;

    @ItemNotBlank
    private String[] to;

    private String[] cc;

    private String[] bcc;

    private Date sentDate;

    private String subject;

    @NotBlank
    private String text;

}
