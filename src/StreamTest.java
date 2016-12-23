import java.util.ArrayList;

/**
 * Created by udaka on 9/6/16.
 */
public class StreamTest {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Abc", 16 , Person.Gender.MALE));
        people.add(new Person("Def", 19 , Person.Gender.FEMALE));
        people.add(new Person("Efg", 22 , Person.Gender.MALE));
        people.add(new Person("Hij", 34 , Person.Gender.MALE));
        people.add(new Person("Klm", 33 , Person.Gender.FEMALE));
        people.add(new Person("Nop", 47 , Person.Gender.MALE));
        people.add(new Person("Xyz", 29 , Person.Gender.FEMALE));

        String[] names;
        names = people.parallelStream()
               // .filter((Person p) -> {return p.gender == Person.Gender.MALE;})
               .map((p) -> {return p.firstName;})
                .toArray((l) -> {return new String[l];});





        for (String str : names ) {
            System.out.println(str);
        }

    }

    public static class Person {
        public String firstName;
        public int age;
        public Gender gender;

        public Person (String name , int age , Gender g) {
            this.firstName = name;
            this.age = age;
            this.gender = g;
        }


        public static enum Gender {
            MALE(), FEMALE();
        }

    }



}
