package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Luke Wang on 2018/8/29.
 * 页面跳转 Controller
 */
@Controller
public class PageController {

    /**
     * @Author: Luke Wang
     * @Date: 2018/8/29
     * @Param: []
     * @return: java.lang.String
     * @throws:
     * @Description: 后台页面跳转到导航页
     */
    @RequestMapping("/")
    public String toIndex() {
        return "index";
    }

    /**
     * @Author: Luke Wang
     * @Date: 2018/8/29
     * @Param: [pageName]
     * @return: java.lang.String
     * @throws:
     * @Description: 基本页面的跳转
     */
    @RequestMapping("/rest/page/{pageName}")
    public String showPage(@PathVariable String pageName) {
        return pageName;
    }
}
