package cn.com.taiji.collection.controller;

import com.alibaba.druid.filter.config.ConfigTools;
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
    public static void main(String[] args) {
        try {
            String password = "123.com";
            String[] arr = ConfigTools.genKeyPair(512);

            System.out.println("privateKey:" + arr[0]);
            System.out.println("publicKey:" + arr[1]);
            System.out.println("password:" + ConfigTools.encrypt(arr[0], password));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
