package com.example.demo;

import com.wyb.auth.AuthServive;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wyb
 * @Date: 2020/10/20 0:16
 */
@RestController
@Slf4j
public class SomeController {
    @Autowired
    private AuthServive authServive;

    @RequestMapping("/auth")
    public String getAtuh(String str) {
        log.info(authServive.login(str));
        return authServive.login(str);
    }
}
