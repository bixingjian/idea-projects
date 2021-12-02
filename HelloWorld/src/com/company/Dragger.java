package com.company;

public class Dragger { //drag an object on the screen.
    public void drag(Draggable draggable) { // 我们只需要这个物体是draggable的. 不管这个object是什么
        draggable.drag();

        System.out.println("Dragging done");
    }
}
