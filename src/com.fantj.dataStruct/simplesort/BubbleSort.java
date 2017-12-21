package com.fantj.dataStruct.simplesort;

/**
 * 冒泡排序
 * Created by Fant.J.
 * 2017/12/20 19:43
 */
public class BubbleSort {
    //小值往前排
    public static void sort(long [] arr){
        long tmp = 0;
        for (int i = 0;i < arr.length;i++){
            for (int j = arr.length-1;j>i;j--){
                if (arr[j]<arr[j-1]){
                    tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }
}
