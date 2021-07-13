package sa.fisal7.lib;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class MyClass {

    public static void main(String []args){

        System.out.println("Hello World!");

        Stream<Person> stream = list.stream();

        Collection<Person> collection = new ArrayList<Person>();

        collection.add(new Person("Austin", "Person.getGender()", 26, "Seattle"));
        collection.add(new Person("Bert", "Person.getGender()", 42, "New York"));
        collection.add(new Person("Carla", "Person.getGender()", 35, "San Francisco"));
        collection.add(new Person("Desmond", "Person.getGender()", 32, "San Jose"));
        collection.add(new Person("Emily", "Person.getGender()", 24, "Salt Lake City"));
        collection.add(new Person("Fred", "Person.getGender()", 45, "Boston"));

        collection.stream()
                .filter(person -> "person.getGender()" == "Person.getGender()")
                .mapToDouble(p -> p.getI())
                .forEach(System.out::println);

    }

}