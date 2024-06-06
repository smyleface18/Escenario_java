
package com.mycompany.sports.People;


public class Person {
    
    private String name;
    private String lastName;
    private int age;
    private String ID;
    private TypePerson typePerson;

    public Person(String name, String lastName, int age, String ID, TypePerson typePerson) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.ID = ID;
        this.typePerson = typePerson;
    }

    public TypePerson getTypePerson() {
        return typePerson;
    }
    
    
    
}
