/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

import exception.InvalidMemberException;

/**
 *
 * @author HP
 */
public abstract class Participant {
    private String name;
    private int totalCrew;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setTotalCrew(int crew) throws InvalidMemberException {
        if(crew <= 0){
            throw new InvalidMemberException("Krunya kurang");
        }
        this.totalCrew = crew;
    }
    
    public int getTotalCrew(){
        return this.totalCrew;
    }
    
    public abstract void validateCrew() throws InvalidMemberException;
    public abstract void performSoundCheck();
    
}
            
