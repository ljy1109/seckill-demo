package com.example.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckill.pojo.Order;
import com.example.seckill.pojo.User;
import com.example.seckill.vo.GoodsVo;
import com.example.seckill.vo.OrderDetailVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yayaya
 * @since 2023-05-10
 */
public interface IOrderService extends IService<Order> {

    Order seckill(User user, GoodsVo goods);
    OrderDetailVo detail(Long orderId);

    String createPath(User user, Long goodsId);

    Boolean checkPath(User user, Long goodsId, String path);

    boolean checkCaptcha(User user, Long goodsId, String captcha);
}
