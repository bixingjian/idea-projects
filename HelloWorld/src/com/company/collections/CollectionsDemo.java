package com.company.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        // 创建
        Collection<String> myCollection = new ArrayList<>();
        Collection<String> myCollectionRemove = new ArrayList<>();

        // add
        myCollection.add("a");
        myCollection.add("b");
        myCollection.add("c");
        Collections.addAll(myCollection, "a","d","c");
        myCollection.addAll(myCollection);
        Collections.addAll(myCollectionRemove, "b");

        // contains
        var containsA = myCollection.contains("a");

        // remove
        myCollection.remove("a"); //只remove第一个出现的
        myCollection.remove("a");
        myCollection.removeAll(myCollectionRemove); // 输入一个collectionRemove, remove当前collection中所有包含在collectionRemove中的元素)

        // clear
        myCollection.clear();
        System.out.println(myCollection.isEmpty());

        // size
        System.out.println(myCollection.size());

        // 将collection转化为常规的array
        Object[] objectArray = myCollection.toArray();
        String[] stringArray = myCollection.toArray(new String[0]); //传入包含0个元素的数组, 这个toArray方法会自动创建相应容量的数组

        // 比较两个collection
        Collection<String> other = new ArrayList<>();
        other.addAll(myCollection);
        // 这个只是比较地址 System.out.println("equal or not:(with==): " + (myCollection == other));
        System.out.println(myCollection.equals(other)); // 比较内容

        // 打印
        for (var item : myCollection) {
            System.out.println(item);
        }
        System.out.println(myCollection);

    }
}
