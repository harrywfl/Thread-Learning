package com.thread.disruptor;

/**
 * @Author: 98050
 * @Time: 2018-12-19 16:19
 * @Feature: 生产者与消费者传递的数据
 */
public class LongEvent {

    private Long value;

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}
