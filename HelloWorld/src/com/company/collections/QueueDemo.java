package com.company.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.offer("d"); // 在ArrayDeque中没有区别. 有一些类有size limit, 抛出异常, offer返回false.

        var front1 = queue.peek(); // 如果queue是空, 返回null
        var front2 = queue.element(); // 如果queue是空, 抛出异常

        var front3 = queue.poll(); // 如果queue为空, 返回null
        var front4 = queue.remove(); //如果queue为空, 抛出异常

        System.out.println(queue);
    }
}

