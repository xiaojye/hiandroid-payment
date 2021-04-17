package com.jye.hiandroid.payment;

import android.content.Context;

/**
 * @author jye
 */
public class HiPayment {

    public static PayStrategy createStrategy(Context context, PayChannel channel) throws Exception {
        String className = channel.getClassName();
        PayStrategy strategy = (PayStrategy) Class.forName(className).newInstance();
        strategy.setContext(context);
        return strategy;
    }
}
