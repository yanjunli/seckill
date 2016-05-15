package org.yinhaijun.seckill.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yinhaijun on 16/5/15.
 */
public class Seckill implements Serializable {

    private long seckillId;
    private String name;
    private int number;
    private Date endTime;
    private Date startTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    private Date createTime;

    //重写toString方法 方便测试
    @Override
    public String toString() {
        return "Seckill{" +
                "seckillId=" + seckillId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", endTime=" + endTime +
                ", startTime=" + startTime +
                ", createTime=" + createTime +
                '}';
    }
}
