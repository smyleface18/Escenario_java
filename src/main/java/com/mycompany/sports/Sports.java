

package com.mycompany.sports;

import com.mycompany.sports.People.Person;
import com.mycompany.sports.People.TypePerson;
import com.mycompany.sports.People.coach.Coach;
import com.mycompany.sports.People.sportsman.SportsMan;
import com.mycompany.sports.sportCenter.SPORT;
import com.mycompany.sports.sportCenter.Scenary;
import com.mycompany.sports.sportCenter.SportCenter;


public class Sports {

    public static void main(String[] args) throws Exception {

        SportCenter sportCenter = new SportCenter("MegaParque", "Ocaña", "7am a 7pm");
       
        Scenary fut5 = new Scenary("Fut5", SPORT.FOOTBAAL, 250);
        Scenary tennis = new Scenary("tennis", SPORT.TENNIS, 350);
        SportsMan caleb = new SportsMan("caleb", "acosta", 19, "100", SPORT.TENNIS);
        Coach pedro = new Coach("pedro", "carrascal", 32, "01", SPORT.TENNIS);

        sportCenter.addScenary(fut5);
        sportCenter.addScenary(tennis);
        
        caleb.diet();
        try{
            sportCenter.resesrvScenary(TypePerson.COACH, tennis);       
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
