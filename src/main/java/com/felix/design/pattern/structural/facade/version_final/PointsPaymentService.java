package com.felix.design.pattern.structural.facade.version_final;

/**
 * Created by felix
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        //扣减积分
        System.out.println("支付" + pointsGift.getName() + " 积分成功");
        return true;
    }

}
