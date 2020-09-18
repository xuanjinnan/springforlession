package com.pactera.dao;

import com.pactera.model.User;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    public static Map<Integer, User> map = new HashMap<Integer, User>();
    static {
        map.put(1,new User(1,"刘备",35,"male"));
        map.put(2,new User(2,"关羽",35,"male"));
        map.put(3,new User(3,"张飞",35,"male"));
    }
}
