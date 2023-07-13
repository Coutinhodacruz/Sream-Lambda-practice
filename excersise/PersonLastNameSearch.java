package chapter17.excersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonLastNameSearch {
    public static void main(String[] args) {
        List<Person> people = createPeopleCollection();

        Optional<Person> personOptional = people.stream()
                .filter(person -> person.getLastName().equals("Jones"))
                .findFirst();

        if (personOptional.isPresent()) {
            Person person = personOptional.get();
            System.out.println("First person with last name Jones: " + person.getFirstName() + " " + person.getLastName());
        } else {
            System.out.println("No person with last name Jones found.");
        }
    }

    private static List<Person> createPeopleCollection() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Doe"));
        people.add(new Person("Jane", "Smith"));
        people.add(new Person("Mike", "Jones"));
        people.add(new Person("Emily", "Jones"));
        people.add(new Person("Mark", "Jones"));
        return people;
    }

    private static class Person {
        private final String firstName;
        private final String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
