package org.yinhaijun.seckill.dao;

import org.yinhaijun.seckill.entity.SuccessKilled;

/**
 * Created by yinhaijun on 16/5/15.
 */
public interface SuccessKilledDao {
    /**
     * 插入购买明细,可过滤重复
     *
     * @param seckillId 秒杀商品Id
     * @param userPhone 用户电话
     * @return 插入的行数
     */
    int insertSuccessKilled(long seckillId, long userPhone);

    /**
     * 根据Id查询SuccessKilled并携带秒杀商品对象实体
     *
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);
}
