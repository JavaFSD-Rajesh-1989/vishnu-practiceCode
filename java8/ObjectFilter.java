package java8;

import java.util.List;

class Imperative {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Vishnu", Person.Gender.MALE),
            new Person("Sunny", Person.Gender.FEMALE)
        );
        people.forEach(System.out::println);
    }
    static class Person {
        private final String name;
        private final Gender gender;
        enum Gender {
            MALE, FEMALE
        }

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", gender=" + gender + "]";
        }
    }
}
