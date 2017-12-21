package com.fantj.dataStruct.stack;

/**
 * 栈
 * Created by Fant.J.
 * 2017/12/21 10:20
 */
public class MyStack {
    //底层是一个数组
    private long []arr;
    private int top;
    /**
     * 默认构造方法
     */
    public MyStack(){
        arr = new long[10];
        top = -1;
    }
    /**
     * 带参数的构造方法
     */
    public MyStack(int maxsize){
        arr = new long[maxsize];
        top = -1;
    }
    /**
     * 添加数据
     */
    public void push(int value){
        arr[++top] = value;
    }
    /**
     * 移除pop数据
     */
    public long pop(){
        return arr[top--]; //返回数据并递减
    }
    /**
     * 查看数据
     */
    public long peek(){
        return arr[top];  //返回数据
    }
    /**
     * 判断 是否是空
     */
    public boolean isEmpty(){
        return top == -1;  //top为-1，就是空
    }
    /**
     * 判断 是否满了
     */
    public boolean isFull(){
        return top == arr.length-1;
    }
}
