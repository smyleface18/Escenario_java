
package com.mycompany.sports.sportCenter;

import com.mycompany.sports.People.TypePerson;


public class Scenary {
    
    private String name;
    private SPORT sport;
    private int size;
    private boolean available = true;

    public Scenary(String name, SPORT sport, int size) {
        this.name = name;
        this.sport = sport;
        this.size = size;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
            this.available = available;

    }
    

    
    
    
    
    
}
