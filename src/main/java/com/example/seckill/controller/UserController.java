package com.example.seckill.controller;


import com.example.seckill.pojo.User;
import com.example.seckill.rabbitmq.MQSender;
import com.example.seckill.vo.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author yayaya
 * @since 2023-05-08
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /*@Autowired
    private MQSender mqSender;
    @RequestMapping("/info")
    @ResponseBody
    public RespBean info(User user){
        return RespBean.success(user);
    }

    @RequestMapping(value = "/mq", method = RequestMethod.GET)
    @ResponseBody
    public void mq() {
        mqSender.send("Hello");
    }*/
}
