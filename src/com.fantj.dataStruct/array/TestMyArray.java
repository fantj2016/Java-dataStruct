package com.fantj.dataStruct.array;

/**
 * Created by Fant.J.
 * 2017/12/20 18:26
 */
public class TestMyArray {
    public static void main(String[] args) {

//        MyArray array = new MyArray();
//        array.insert(10);
//        array.insert(20);
//        array.insert(30);
//
//        array.display();
//        System.out.println(array.search(20));
//        array.update(1,80);
//        array.display();
//        array.delete(1);
//        array.display();

        MyOrderArray orderArray = new MyOrderArray();
        orderArray.insert(10);
        orderArray.insert(20);
        orderArray.insert(30);
        orderArray.insert(20);
        orderArray.insert(0);
        orderArray.display();

        System.out.println(orderArray.binarySearch(30));

    }
}
