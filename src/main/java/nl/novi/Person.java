package nl.novi;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String lastName;
//    private int age;
//    private List<Person> children = new ArrayList<Person>();
//    private Person partner;

    public Person() {
        this.name = "John";
        this.lastName = "Doe";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

}


