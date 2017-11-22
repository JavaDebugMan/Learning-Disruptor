package com.javaman.disruptor;

import com.lmax.disruptor.EventFactory;

/**
 * Author:彭哲
 * Date:2017/11/22
 */
public class LongEventFactory implements EventFactory {
    public Object newInstance() {
        return new LongEvent();
    }
}
