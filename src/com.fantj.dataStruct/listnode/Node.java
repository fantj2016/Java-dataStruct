package com.fantj.dataStruct.listnode;

/**
 * 链表结构，链结点
 * Created by Fant.J.
 * 2017/12/19 22:19
 */
public class Node {
    //数据域
    public long data;
    //结点域(指针域)
    public Node next;

    public Node(long value){
        this.data = value;
    }

    /**
     * 显示方法
     */
    public void display(){
        System.out.print(data+" ");
    }
}
