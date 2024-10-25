import java.util.Arrays;
import java.util.Scanner;

class SelectionSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
               int [] arr1=sort(arr);
               System.out.println(Arrays.toString(arr1));
               sc.close();
        }
        static int[] sort(int [] arr){
            for(int i=0;i<arr.length-1;i++){
                int max=i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]>arr[max]){
                        max=j;
                    }
                }
                int temp=arr[max];
                arr[max]=arr[i];
                arr[i]=temp;
            }
            return arr;
            
        }
        
}