package com.fantj.dataStruct.queue;

/**
 * Created by Fant.J.
 * 2017/12/21 10:51
 */
public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());

        System.out.println(queue.peek());

        while (!queue.isEmpty()){
            System.out.print(queue.remove()+",");
        }
    }
}
