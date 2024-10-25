package Sorting;

import java.util.Arrays;

public class selctionSort {
    public static void main(String[] args) {
          int [] arr={3,9,5,1,7,5,12,34};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr,int start,int end){
       for(int i=0;i<arr.length;i++){
        int low=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[low]){
                 low =j;
            }
        }
        int temp=arr[i];
        arr[i]=arr[low];
        arr[low]=temp;
       }
    }
}
