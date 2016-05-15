package org.yinhaijun.seckill.dao;

import org.yinhaijun.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by yinhaijun on 16/5/15.
 */
public interface SeckillDao {
    /**
     * 减少库存
     *
     * @param seckillId 秒杀商品Id
     * @param killTime  秒杀时间
     * @return 如果影响行数>1,表更新的记录行数
     */
    int reduceNumber(long seckillId, Date killTime);

    /**
     * 根据id查询秒杀对象
     *
     * @param seckillId 秒杀对象Id
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     *
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offet, int limit);
}
