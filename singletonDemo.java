class Singleton{
private  static Singleton singleton;
public  static Singleton getInstance(){
    if(singleton==null){
      singleton= new Singleton();
    }
    return singleton;
}

    private Singleton(){
        System.out.println("private constructor");
    }

}
class singletonDemo{
    public static void main(String[] args) {
        Singleton s=Singleton.getInstance();
        Singleton s1=Singleton.getInstance();
        System.out.println(s.equals(s1));
    }
}