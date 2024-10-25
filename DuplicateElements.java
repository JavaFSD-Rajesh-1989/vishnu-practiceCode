import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        int [] arr={1,2,2,3,3,4,5,6,7,7,8};
        duplicate(arr);
    }
    static void duplicate(int arr[]){
       Set<Integer> s=new HashSet<>();
       Set<Integer> duplicates=new HashSet<>();
       for(int n:arr){
       if(! s.add(n)){
        duplicates.add(n);
       }
       }
       System.out.println(duplicates);
       }

    
}
