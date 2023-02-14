package org.susamlu.springweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.susamlu.springweb.bean.MyBean;

import javax.annotation.Resource;

/**
 * @author lxc
 * @date 2023/02/13
 */
@RestController
public class TestController {

    @Resource
    private MyBean requestBean;

    @Resource
    private MyBean sessionBean;

    @Resource
    private MyBean applicationBean;

    @GetMapping("/api/test")
    public void scopeTest() {
        System.out.println("requestBean: " + requestBean);
        System.out.println("sessionBean: " + sessionBean);
        System.out.println("applicationBean: " + applicationBean);
    }

}
