
package com.mycompany.sports.People.coach;

import com.mycompany.sports.People.Person;
import com.mycompany.sports.People.TypePerson;
import com.mycompany.sports.sportCenter.SPORT;

public class Coach extends Person{
    
    private SPORT Sport;
    private boolean available = true;

    
    public Coach(String name, String lastName, int age, String ID,SPORT Sport ) {
        super(name, lastName, age, ID,TypePerson.COACH);
        this.Sport = Sport;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
}
