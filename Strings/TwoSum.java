package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int sum=7;
        int arr[]={1, 2, 3, 4, 6};
       int [] result= twoSum(arr,sum);
       System.out.println(Arrays.toString(result));
    }
    static int [] twoSum(int []arr,int sum){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
        int target=sum-arr[i];
        if(map.containsKey(target)){
            return new int[]{map.get(target),i};
        }
        map.put(arr[i],i);
    }
    return null;
    }
}