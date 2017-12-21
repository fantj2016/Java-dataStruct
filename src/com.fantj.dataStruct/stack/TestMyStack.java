package com.fantj.dataStruct.stack;

/**
 * Created by Fant.J.
 * 2017/12/21 10:32
 */
public class TestMyStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(4);
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.isFull());
        System.out.println(stack.peek());
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+",");
        }
    }
}
