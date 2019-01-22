package cn.com.taiji.collection.controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

/**
 * Controller层需要继承的基础类
 *
 * @author:penghongyou
 * @Date:2018-8-20
 * @Time:11:04
 */
public class BaseController {
    @InitBinder
    public void initBinder(WebDataBinder binder, String sessionId, String language) {
        //Todo
    }
}
