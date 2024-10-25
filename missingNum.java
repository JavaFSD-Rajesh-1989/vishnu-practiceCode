public class missingNum {
    public static void main(String[] args) {
        int [] arr={1,2,3,5,6,7};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
           
           
        }
        int n=arr.length+1;
        int sum1=n*(n+1)/2;
        System.out.println(sum1-sum);


    }
}
