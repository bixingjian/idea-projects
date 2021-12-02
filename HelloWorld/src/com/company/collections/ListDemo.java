package com.company.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo  {
    public static void show() {
        List<String> list = new ArrayList<>();

        // add
        list.add("a");
        list.add(0, "1");
        Collections.addAll(list, "a", "b", "c", "a","a");

        // get
        System.out.println(list.get(0));

        // set
        list.set(0, "A+");

        // remove
        list.remove(0);

        // 获取索引下标
        list.indexOf("A+");
        list.lastIndexOf("a");

        // 获取子列表
        list.subList(0,2); // (0,2], 原列表不受影响, 返回一个新列表
    }

}
