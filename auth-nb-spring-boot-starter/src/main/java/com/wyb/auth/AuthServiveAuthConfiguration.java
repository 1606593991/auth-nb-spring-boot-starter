package com.wyb.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wyb
 * @Date: 2020/10/19 23:44
 */
@Configuration
@ConditionalOnClass(AuthServive.class)
@EnableConfigurationProperties(AuthServivePreperties.class)
public class AuthServiveAuthConfiguration {
    @Autowired
    private AuthServivePreperties authServivePreperties;
    @Bean
    @ConditionalOnMissingBean(name = "AuthServive")
    public AuthServive authServive() {
        return new AuthServive(authServivePreperties.getName(), authServivePreperties.getType(), authServivePreperties.getCode());
    }

}
