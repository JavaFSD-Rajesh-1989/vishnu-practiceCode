package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
         int[] arr = {3, 9, 5, 1, 7, 5, 12, 34};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int [] arr){
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
        }
       
       }    }
    
}
