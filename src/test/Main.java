package test;

import examples.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.setAge(30);
        System.out.println("Name " + person.getName() + "\nAge " + person.getAge());
    }
}
