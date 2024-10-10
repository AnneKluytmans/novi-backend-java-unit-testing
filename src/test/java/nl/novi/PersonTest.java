package nl.novi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    //arrange
    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void canGetName() {
        //act
        String name = person.getName();
        //assert
        Assertions.assertEquals("John", name);
    }

    @Test
    void canSetName() {
        //act
        person.setName("Jan");
        String name = person.getName();
        //assert
        Assertions.assertEquals("Jan", name);
    }

    @Test
    void canCreatePerson() {
        //arrange
        person = new Person("Lisa");
        //act
        String name = person.getName();
        //assert
        Assertions.assertEquals("Lisa", name);
    }

    @Test
    void canGetLastName() {
        //act
        String lastName = person.getLastName();
        //assert
        Assertions.assertEquals("Doe", lastName);
    }
}