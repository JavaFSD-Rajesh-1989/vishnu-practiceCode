public class LargestSubArraySum {
    public static void main(String[] args) {
        int [] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum=Integer.MIN_VALUE;
        int currentMax=0;
        for(int i=0;i<arr.length;i++){
          currentMax+=arr[i];
          if(currentMax>maxSum){
            maxSum=currentMax;
          }
          if(currentMax<0){
            currentMax=0;
          }
        }
     System.out.println(maxSum);
    }
}
