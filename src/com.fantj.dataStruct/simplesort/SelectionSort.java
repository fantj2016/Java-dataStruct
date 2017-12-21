package com.fantj.dataStruct.simplesort;

/**
 * 选择排序
 * Created by Fant.J.
 * 2017/12/20 19:56
 */
public class SelectionSort {
    public static void sort(long []arr){

        int k = 0;
        long temp = 0;
        for (int i = 0;i<arr.length-1;i++){
            k = i;
            for (int j = i;j<arr.length;j++){
                if (arr[j] < arr[k]){
                    //拿到最小值对应的index
                    k = j;
                }
            }
            //将k(最小值)和i(当前值)交换
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
    }
}
