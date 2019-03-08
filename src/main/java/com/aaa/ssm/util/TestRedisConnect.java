package com.aaa.ssm.util;

import redis.clients.jedis.Jedis;

/**
 * fileName:TestRedisConnect
 * description:
 * author:zz
 * createTime:2019/3/2 17:36
 */
public class TestRedisConnect {

    public static void main(String[] args) {
        Jedis jedis =  new Jedis("192.168.239.7",6379);
        System.out.println(jedis.ping());
        System.out.println(SerializeUtil.serialize("userList"));

    }
}
