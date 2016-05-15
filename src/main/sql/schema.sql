 --数据库初始化脚本

 --创建数据库
 CREATE  DATABASE seckill;

 --使用数据库
 use seckill;

 --创建数据库表
 CREATE  TABLE  seckill.seckill (
'seckill_id' bigint NOT  NULL AUTO_INCREMENT COMMENT '商品库存ID',
'name' VARCHAR (120) NOT  NULL COMMENT '商品名称',
'number' INT  NOT  NULL  COMMENT '商品数量',
'start_time' TIMESTAMP NOT  NULL  COMMENT '秒杀开始时间',
'end_time' TIMESTAMP  NOT NULL  COMMENT '秒杀结时间',
'create_time' TIMESTAMP  NOT  NULL  DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
PRIMARY KEY  (seckill_id),
KEY  id_start_time(start_time),
KEY id_end_time(end_time),
KEY  id_create_time(create_time)
 )ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf-8 COMMENT='秒杀库存表'

--数据初始化
INSERT INTO seckill(name,number,start_time,end_time)
VALUES ('1000元秒杀iPhone6S',100,'2016-05-14 00:00:00','2016-05-15 00:00:00'),
VALUES ('500元秒杀iPad2',500,'2016-05-14 00:00:00','2016-05-15 00:00:00'),
VALUES ('300元秒杀HTC手机',1000,'2016-05-14 00:00:00','2016-05-15 00:00:00'),
VALUES ('600元秒杀红米',700,'2016-05-14 00:00:00','2016-05-15 00:00:00'),
VALUES ('400元秒杀iPhone4S',600,'2016-05-14 00:00:00','2016-05-15 00:00:00'),
VALUES ('3000元秒杀macBook',400,'2016-05-14 00:00:00','2016-05-15 00:00:00')

--秒杀成功明细表
 create table success_killed(
   'seckill_id' bigint NOT NULL COMMENT '秒杀商品ID',
   'user_phone' bigint NOT NULL COMMENT '用户手机号',
   'state' TINYINT NOT NULL DEFAULT -1 COMMENT '状态表示:-1:无效 0 成功 1 已付款 2 已发货',
   'create_time' TIMESTAMP NOT NULL COMMENT '创建时间',
   PRIMARY KEY (seckill_id,user_phone),/*联合主键:*/
   key idx_create_time(create_time)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';