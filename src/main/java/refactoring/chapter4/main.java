package refactoring.chapter4;

import refactoring.chapter4.before.Label;
import refactoring.chapter4.before.Person;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Person[] people = {
                new Person(new Label("Alice"), new Label("alice@example.com")),
                new Person(new Label("Bobby"), new Label("Bobby@example.com")),
                new Person(new Label("Chris")),
        };

        for (Person person : people) {
            System.out.println(person.toString());
            person.display();
            System.out.println("");
        }
    }
}
