package org.yinhaijun.seckill.entity;

import java.util.Date;

/**
 * Created by yinhaijun on 16/5/15.
 */
public class SuccessKilled {
    private long SeckillId;
    private long userPhone;
    private short state;
    private Date creatime;
    //多对一属性
    private Seckill seckill;

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    public long getSeckillId() {
        return SeckillId;
    }

    public void setSeckillId(long seckillId) {
        SeckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreatime() {
        return creatime;
    }

    public void setCreatime(Date creatime) {
        this.creatime = creatime;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "SeckillId=" + SeckillId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", creatime=" + creatime +
                '}';
    }
}
