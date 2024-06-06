/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sports.People.sportsman;

import com.mycompany.sports.People.Person;
import com.mycompany.sports.People.TypePerson;
import com.mycompany.sports.sportCenter.SPORT;

/**
 *
 * @author SCIS2
 */
public class SportsMan extends Person implements Doping, Feeding{
    
    private SPORT Sport;
    public SportsMan(String name, String lastName, int age, String ID, SPORT Sport) {
        super(name, lastName, age, ID, TypePerson.SPORTMAN);
        this.Sport = Sport;
    }

    @Override
    public void doTest() {
        System.out.println("Hacer prueba de sangre");
    }

    @Override
    public void diet() {
        if(this.Sport == Sport.FOOTBAAL){
            System.out.println("Haciendo dieta futbolera");
        }
        else if(this.Sport == Sport.BASKETBALL){
            System.out.println("Haciendo dieta basquetbolera");
        }
        else if(this.Sport == Sport.TENNIS){
            System.out.println("Haciendo dieta tenisera");
        }
    }
    
    
    
    
    
    
    
}
