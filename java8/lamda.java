package java8;

interface Adding {
    void add(int a, int b);
}

public class lamda {
    public static void main(String[] args) {
        Adding addition = (int a, int b) -> System.out.println(a + b);
        addition.add(2, 3);
    }
}
