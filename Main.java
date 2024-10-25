// import java.util.*;

// class Student implements Comparable<Student> {
//     int age;
//     String name;

//     Student(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     // Implementing the compareTo method
//     @Override
//     public int compareTo(Student other) {
//         return this.age - other.age;  // Sorting by age
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         List<Student> list = new ArrayList<>();
//         list.add(new Student(12, "Vishnu"));
//         list.add(new Student(11, "Sunny"));
        
//         Collections.sort(list);  // Sorting using Comparable

//         // Printing the sorted list
//         for (Student s : list) {
//             System.out.println("Name: " + s.name + ", Age: " + s.age);
//         }
//     }
// }
import java.util.*;

class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;  // Sorting by age
    }
}


public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(12, "Vishnu"));
        list.add(new Student(11, "Sunny"));
        
        Collections.sort(list, new AgeComparator());  // Sorting by age
        System.out.println("Sorted by Age:");
        for (Student s : list) {
            System.out.println("Name: " + s.name + ", Age: " + s.age);
        }
        
        Collections.sort(list,new AgeComparator());}}
