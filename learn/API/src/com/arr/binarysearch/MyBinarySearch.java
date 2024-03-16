package com.arr.binarysearch;

public class MyBinarySearch {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        int number = 3;
        int index=SearchForIndex(arr,number);
        System.out.println(index);
    }

    private static int SearchForIndex(int[] arr, int number) {
        int min =0;
        int max=arr.length-1;
        while(min<=max){
            int mid = (min+max)>>1;
            if (arr[mid]>number){
                max=mid-1;
            } else if (arr[mid]<number) {
                min=mid+1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
