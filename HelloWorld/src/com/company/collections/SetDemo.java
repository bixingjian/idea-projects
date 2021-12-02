package com.company.collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        Set<String> set = new HashSet<>();
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        set.add("sky");
        set.add("is");
        set.add("Blue");
        set.add("Blue");

        // Union并集
        set1.addAll(set2); //set1改变, set2不变
        System.out.println(set1);

        // Intersection交集
        set1.retainAll(set2); //在set1中retain(保留) set2中的所有元素, 删除其他多余的元素
        System.out.println(set1); // ["b", "c"]

        // Difference差集 set1-set2
        set1.removeAll(set2);
        System.out.println(set);
    }
}
