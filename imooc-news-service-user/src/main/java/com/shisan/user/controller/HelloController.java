package com.shisan.user.controller;

import com.shisan.api.controller.user.HelloControllerApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ShiSan
 * @version 1.0
 * @date 2023/3/7 20:40
 */
@RestController
public class HelloController implements HelloControllerApi {

    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    public Object hello() {
        logger.info("info:hello");
        return "hello";
    }

}
