package com.fantj.dataStruct.queue;

/**
 * 循环队列（只对insert，remove方法进行修改）
 * Created by Fant.J.
 * 2017/12/21 10:44
 */
public class MyCycleQueue {
    //底层使用数组
    private long []arr;
    //有效数据的多少
    private int elements;
    //队头
    private int front;
    //队尾
    private int end;
    /**
     * 默认构造方法
     */
    public MyCycleQueue(){
        arr = new long[10];
        elements = 0;
        front = 0;
        end = -1;
    }
    /**
     * 带参数的构造方法，参数为数组大小
     */
    public MyCycleQueue(int maxsize){
        arr = new long[maxsize];
        elements = 0;
        front = 0;
        end = -1;
    }
    /**
     * 添加数据，从队尾插入
     */
    public void insert(long value){
        if (end == arr.length-1){
            end = -1; //如果到达了队列尽头，初始化end
        }
        arr[++end] = value;
        elements++;
    }
    /**
     * 删除数据，从队尾删除
     */
    public long remove(){
        long value = arr[front++];
        if (front == arr.length){
            front=0; //如果到达了队列尽头，初始化front
        }
        elements--;
        return value;
    }
    /**
     * 查看数据，从对头查看
     */
    public long peek(){
        return arr[front];
    }
    /**
     * 判断是否为空
     */
    public boolean isEmpty(){
        return elements == 0;
    }
    /**
     * 判断是否满了
     */
    public boolean isFull(){
        return  elements == arr.length;
    }
}
