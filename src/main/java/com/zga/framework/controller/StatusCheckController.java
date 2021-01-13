package com.zga.framework.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangguangan on 2021/1/13
 * description:
 */
@RestController
public class StatusCheckController {
    @RequestMapping("status")
    public String status() {
        return "hello";
    }
}
