package com.aaa.ssm.util;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

public class TestRedisClusetConnect {
    public static void main(String [] args){
        Set<HostAndPort> hps= new HashSet();
        hps.add(new HostAndPort("192.168.239.7",7001));
        hps.add(new HostAndPort("192.168.239.7",7002));
        hps.add(new HostAndPort("192.168.239.7",7003));
        hps.add(new HostAndPort("192.168.239.9",7004));
        hps.add(new HostAndPort("192.168.239.9",7005));
        hps.add(new HostAndPort("192.168.239.9",7006));
        JedisCluster jedisCluster=new JedisCluster(hps);
        jedisCluster.set("eee","555");
        String eee=jedisCluster.get("eee");
        System.out.println(eee);


    }
}
