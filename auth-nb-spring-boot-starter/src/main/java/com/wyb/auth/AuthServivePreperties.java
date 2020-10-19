package com.wyb.auth;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: wyb
 * @Date: 2020/10/19 23:44
 */
@Data
@ConfigurationProperties("wyb.auth")
public class AuthServivePreperties {
    private String name;
    private String type;
    private String code;

}
