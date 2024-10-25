package Strings;

public class SumOdDigits {
    public static void main(String[] args) {
        int i=6789;
        System.out.println(sumDigits(i));
    }
    static int sumDigits(int i){
        if(i==0){
            return 0;
        }
        return (i%10)+sumDigits(i/10);
    }
}
