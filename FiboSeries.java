public class FiboSeries {
   public static void main(String[] args) {
    int a=0;
    int b=1;
    int n=10;
    fiboseries(a,b,n);
   } 
   static void fiboseries(int a,int b,int n){
   System.out.print(a+" "+b+" ");
    for(int i=2;i<n;i++){
        int c =a+b;
        a=b;
        b=c;

        System.out.print(c+" ");
    }
   

   }
}
