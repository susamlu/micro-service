package org.susamlu.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.susamlu.springweb.bean.MyBean;
import org.susamlu.springweb.bean.MyLazyBean;

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

    @Resource
    private MyBean requestBean2;

    @Resource
    private MyBean sessionBean2;

    @Resource
    private MyBean applicationBean2;

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/api/scope")
    public void scopeTest() {
        System.out.println("requestBean: " + requestBean);
        System.out.println("sessionBean: " + sessionBean);
        System.out.println("applicationBean: " + applicationBean);
        System.out.println("requestBean2: " + requestBean2);
        System.out.println("sessionBean2: " + sessionBean2);
        System.out.println("applicationBean2: " + applicationBean2);
    }

    @GetMapping("/api/lazy")
    public void lazyTest() {
        applicationContext.getBean(MyLazyBean.class);
    }

}
