package Strings;
public class RevEachWord {
    public static void main(String[] args) {
        String s="vishnu is cool and notcool";
        String[] arr=s.split("\\s+");
       
        //reverse word in a sentence
        for(int i=arr.length-1;i>=0;i--){
          System.out.print(arr[i]+" ");
        }

       //reverse each word
      //  for(int i=0;i<arr.length;i++){
      //   int j=arr[i].length()-1;
      //         while(j>=0){
      //           System.out.print(arr[i].charAt(j));
      //           j--;
      //         }
      //         System.out.println( );
      //  }
    }
}
