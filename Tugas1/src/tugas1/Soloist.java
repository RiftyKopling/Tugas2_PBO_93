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
public class Soloist extends Participant{
    @Override
    public void validateCrew() throws InvalidMemberException{
        if(getTotalCrew() > 3){
            throw new InvalidMemberException("Jumlah kru melebihi batas!");
        }
    }
    
    @Override
    public void performSoundCheck(){
        System.out.println("Menyiapkan 1 mic vokal utama untuk " + getName());
    }
    
}
