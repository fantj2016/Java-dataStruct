package com.fantj.dataStruct.array;

/**
 * Created by Fant.J.
 * 2017/12/20 18:16
 */
public class MyArray {
    private long[] arr;
    //表示有效数据的长度
    private int elements;

    public MyArray() {
        arr = new long[50];
    }

    public MyArray(int maxsize) {
        arr = new long[maxsize];
    }

    /**
     * 添加数据
     */
    public void insert(long value){
        arr[elements] = value;
        elements++;
    }

    /**
     * 显示数据
     */
    public void display(){
        System.out.print("[");
        for (int i = 0;i < elements;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

    /**
     * 查找数据(根据元素查找)
     */
    public int search(long value){
        int i;
        for (i = 0;i < elements;i++){
            if (value == arr[i]){
                break;
            }
        }
        //是否查到最后一个了
        if (i == elements){
            return -1;  //查找不到
        }else {
            return i;
        }
    }
    /**
     * 根据索引查找
     */
    public long get(int index){
        if (index >= elements || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }else {
            return arr[index];
        }
    }
    /**
     * 删除数据
     */
    public void delete(int index){
        if (index >= elements || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }else {
            for (int i = index;i < elements;i++){
                arr[index] = arr[index+1];
            }
            elements--;
        }
    }
    /**
     * 更新数据
     */
    public void update(int index,long newvalue){
        if (index >= elements || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }else {
            arr[index] = newvalue;
        }
    }
}
