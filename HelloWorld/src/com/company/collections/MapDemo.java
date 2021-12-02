package com.company.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
        Map<String, Customer> map = new HashMap<>();
        var c1 = new Customer("a1", "e1");
        var c2 = new Customer("a2", "e2");
        var unknown = new Customer("Unknown", "");

        // 放入字典
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        // 替换
        map.replace("e1", new Customer("a++", "e1"));

        // 获取
        var customer = map.get("e1"); // 不存在返回null
        var customer2 = map.getOrDefault("e10", unknown);

        // 查看是否存在
        var exists = map.containsKey("e1");

        // 循环
        for (var key : map.keySet()) {
            System.out.println(key);
        }

        for (var entry : map.entrySet()){
            System.out.println(entry.getKey());
        }

        for (var value : map.values()){
            System.out.println(value);
        }

        System.out.println(customer);
        System.out.println(customer2);


    }
}
