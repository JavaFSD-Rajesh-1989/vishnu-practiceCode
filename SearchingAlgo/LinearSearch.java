package SearchingAlgo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,4,6,7,23,45,76,12,99,76,44,23,9};
        System.out.print("enter the target : ");
        int target=sc.nextInt();
        linearGo(arr,target);
        sc.close();
    }
    static void linearGo(int []arr ,int target){
     List<Integer> index=new ArrayList<>();
     for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            index.add(i);
        }
     }
     if(index.size()>0){
       
     System.out.println("found at : "+index);
     System.out.println( index.size());
     }
    else{
        System.out.println("not found");
    }
}
}

