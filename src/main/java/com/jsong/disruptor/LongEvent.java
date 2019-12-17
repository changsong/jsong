package com.jsong.disruptor;

/**
 * Function:
 *  事件
 *
 * @author jsong
 *         Date: 2018/8/29 01:42
 * @since JDK 1.8
 */
public class LongEvent {
    private long value;

    public void set(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}