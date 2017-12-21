package com.fantj.dataStruct.listnode;

/**
 * Created by Fant.J.
 * 2017/12/19 22:20
 */
public class TestLinkList {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(10);
        linkList.insertFirst(20);
        linkList.insertFirst(30);

        linkList.display();
        linkList.deleteFirst();
        System.out.println();
        linkList.display();

        System.out.println();
        Node node = linkList.find(20);
        node.display();



    }

//    /** 获取链表长度 */
//    static int listLength(Node headNode){
//        int length = 0;
//        Node currentNode = headNode;  //将链表给临时链表 ，方便判断
//        while (currentNode != null){
//            length++;
//            currentNode = headNode.getNext();    //获取下个链表
//        }
//        return length;
//    }
//
//    /** 插入元素 */
//    static Node insertInLinkedList(Node headNode, Node nodeToInsert, int position){
//        if(headNode == null){
//            return nodeToInsert;
//        }
//        int size = listLength(headNode);
//        if (position > size+1 || position<1){
//            System.out.println("插入位置无效"+(size+1));
//            return headNode;
//        }
//        if (position == 1){
//            nodeToInsert.setNext(headNode);
//            return nodeToInsert;
//        }else {
//            //在链表中间或者末尾插入
//            Node previousNode = headNode;
//            int count = 1;
//            while (count < position-1 ){
//                previousNode = previousNode.getNext();
//                count++;
//            }
//            Node currentNode = previousNode.getNext();
//            nodeToInsert.setNext(currentNode);
//            previousNode.setNext(nodeToInsert);
//        }
//        return headNode;
//    }

}
