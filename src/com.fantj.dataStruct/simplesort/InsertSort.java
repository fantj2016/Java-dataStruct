package com.fantj.dataStruct.simplesort;

/**
 * Created by Fant.J.
 * 2017/12/20 20:56
 */
public class InsertSort {
    public static void sort(long [] arr){
        int i, j;
        long target;
        //假定第一个元素被放到了正确的位置上
        //这样，仅需遍历1 - n-1
        for (i = 1; i < arr.length; i++)
        {
            j = i;
            target = arr[i];
            //如果当前值小于前面的值，就交换它们
            while (j > 0 && target < arr[j - 1])
            {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = target;
        }
    }
}
