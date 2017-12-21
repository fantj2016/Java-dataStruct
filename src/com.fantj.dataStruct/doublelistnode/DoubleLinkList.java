package com.fantj.dataStruct.doublelistnode;

/**
 * 双向链表,比双端链表多了一个头结点的指向
 * Created by Fant.J.
 * 2017/12/21 19:49
 */
public class DoubleLinkList {
    //头结点
    private Node first;
    //尾结点
    private Node last;

    public DoubleLinkList(){
        first = null;
    }
    /**
     * 插入一个结点，在头结点后进行插入
     */
    public void insertFirst(long value){
        Node node = new Node(value);
        //如果是第一次插入
        if (isEmpty()){
            last = node;
        }else {
            first.previous = node;
        }
        node.next = first;
        first = node;
    }
    /**
     * 插入一个结点，从尾结点进行插入
     */
    public void insertLast(long value){
        Node node = new Node(value);
        if (isEmpty()){
            first = node;
        }else {
            last.next = node;
            node.previous = last;
        }
        last = node;
    }
    /**
     * 删除一个结点，在头结点后进行删除
     */
    public Node deleteFirst(){
        Node temp = first;
        if (first.next == null){
            last = null;
        }else {
            first.next.previous = null;
        }
        first = temp.next;
        return temp;
    }
    /**
     * 显示方法
     */
    public void display(){
        Node current = first;
        while (current != null){
            current.display();   //打印结点
            current = current.next;
        }
    }
    /**
     * 查找方法
     */
    public Node find(long value){
        Node current = first;
        while (current.data != value){
            if (current.next == null){
                return null;
            }
            current = current.next;//继续往下找
        }
        return current;
    }
    /**
     * 删除方法,根据数据域来进行删除
     */
    public Node delete(long value){
        Node current = first;
        Node previous = first;//表示前一个结点
        while (current.data != value){
            if (current.next == null){
                return null;
            }
            previous = current; //提取出当前结点作为前一个结点（用该结点的next指向删除结点的后一个结点）
            current = current.next; //继续往下找
        }
        if (current == first){
            first = first.next;
        }else {
            previous.next = current.next;
        }
        return current;
    }
    /**
     * 判断是否为空
     */
    public boolean isEmpty(){
        return (first == null);
    }
}
