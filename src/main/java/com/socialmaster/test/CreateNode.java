package com.socialmaster.test;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.apache.zookeeper.CreateMode;

/**
 * Created by liuxiaojun on 2016/8/22.
 */
public class CreateNode {
    public static void main(String[] args) {
        ZkClient zc = new ZkClient("10.11.0.3:2181",10000,10000,new SerializableSerializer());
        System.out.println("conneted ok!");

        User u = new User();
        u.setId(1);
        u.setName("test");
        String path = zc.create("/test1234", u, CreateMode.PERSISTENT);
        System.out.println("created path:" + path);
    }
}
