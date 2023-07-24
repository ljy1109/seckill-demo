package com.example.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public enum RespBeanEnum {
    SUCCESS(200,"SUCCESS"),
    ERROR(500, "服务端异常"),
    //登录模块
    LOGIN_ERROR(500210,"用户名或密码错误"),
    MOBILE_ERROR(500211, "手机格式错误"),
    BIND_ERROR(500212, "参数校验异常"),
    MOBILE_NOT_EXIST(500213, "手机号码不存在"),
    PASSWORD_UPDATE_FAIL(500214,"密码更新失败"),
    //秒杀模块
    EMPTY_STOCK(500500,"库存不足"),
    SESSION_ERROR(500502, "用户不存在"),
    REPETE_ERROR(500501, "该商品每人限购一件"),
    REQUEST_ILLEGAL(500503, "请求非法，请重新尝试"),
    ERROR_CAPTCHA(500504, "验证码错误，请重新输入"),
    ACCESS_LIMIT_REACHED(500505, "操作过于频繁，请稍后再试"),

    //订单模块
    ORDER_NOT_EXIST(500300, "订单信息不存在");
    private final Integer code;
    private final String message;
}
