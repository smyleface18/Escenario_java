

package com.mycompany.sports.sportCenter;

import com.mycompany.sports.People.TypePerson;
import java.util.ArrayList;


public class SportCenter {

    private String name;
    private String location;
    private String schedule;
    private ArrayList <Scenary> scenaries = new ArrayList<>();

    public SportCenter(String name, String location, String schedule) {
        this.name = name;
        this.location = location;
        this.schedule = schedule;
    }
    
    
    public void addScenary(Scenary scenary){
        this.scenaries.add(scenary);
    
    }
    
    public void resesrvScenary(TypePerson type, Scenary scenary) throws Exception{
        
        if(type == TypePerson.COACH || type ==  TypePerson.SPORTMAN){
            int index = this.scenaries.indexOf(scenary);
            if( index != -1){
                Scenary sc = this.scenaries.get(index);
                System.out.println("escenario reservado");
                if(sc.isAvailable()){
                    sc.setAvailable(false);
                }
            }
            else{
                throw new Exception("error");
            }
        }
        
    }
    
}
