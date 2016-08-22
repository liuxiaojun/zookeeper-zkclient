package com.socialmaster.test;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

/**
 * Created by liuxiaojun on 2016/8/22.
 */
public class CreateSession {
    public static void main(String[] args) {
        ZkClient zc = new ZkClient("10.11.0.3:2181",10000,10000,new SerializableSerializer());
        System.out.println("conneted ok!");
    }
}
