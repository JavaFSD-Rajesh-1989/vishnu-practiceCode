package SearchingAlgo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 18, 20};
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the target : ");
      int target=sc.nextInt();
      binaryGo(arr,target);
      sc.close();
    }
    static void binaryGo(int []arr,int target){
        List<Integer> result = new ArrayList<>();
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid =  (end + start) / 2;

            if (arr[mid] == target) {
                int left = mid;
                while (left >= 0 && arr[left] == target) {
                    result.add(left);
                    left--;
                }

                int right = mid + 1;
                while (right < arr.length && arr[right] == target) {
                    result.add(right);
                    right++;
                }
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (result.isEmpty()) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at indexes: " + result);
        }
    }
}

