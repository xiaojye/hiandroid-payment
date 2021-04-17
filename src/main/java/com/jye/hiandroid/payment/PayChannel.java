package com.jye.hiandroid.payment;

/**
 * @author jye
 */
public enum PayChannel {
    ALI_PAY("com.jye.hiadnroid.payment.alipay.AliPay"),
    WX_PAY("com.jye.hiadnroid.payment.wxpay.WxPay");

    private String className;

    PayChannel(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}