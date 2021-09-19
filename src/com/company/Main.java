package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Person person;
        List<Person> personList=new ArrayList<Person>();

        personList.add(new Person("Tim","Dillon",36, "Comedian"));
        personList.add(new Person("Joe","Rogan",54, "Comedian"));
        personList.add(new Person("Finn","Iles",24, "Sportsman"));
        personList.add(new Person("Loic","Bruni",28, "Sportsman"));
        personList.add(new Person("Andrew","Jones",31, "Teacher"));

        //mapping 
        List<String> names=personList.stream()
                        .map(e->e.getFirstName())
                        .collect(Collectors.toList());
                names.forEach(System.out::println);
    }
}
