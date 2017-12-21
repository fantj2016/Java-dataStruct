package com.fantj.dataStruct.simplesort;

/**
 * Created by Fant.J.
 * 2017/12/20 19:50
 */
public class TestSort {
    public static void main(String[] args) {
        long []arr = new long[5];
        arr[0] = 19;
        arr[1] = 18;
        arr[2] = 20;
        arr[3] = 17;
        arr[4] = 21;
//        arr[0] = 19;
//        arr[1] = 18;
//        arr[2] = 17;
//        arr[3] = 16;
//        arr[4] = 15;

        System.out.print("[");
        for (long num :arr){
            System.out.print(num + " ");
        }
        System.out.print("]");
        System.out.println();

//        BubbleSort.sort(arr);
//        SelectionSort.sort(arr);
        InsertSort.sort(arr);
        System.out.print("[");
        for (long num :arr){
            System.out.print(num + " ");
        }
        System.out.print("]");

    }
}
