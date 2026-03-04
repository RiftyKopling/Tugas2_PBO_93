/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;
import exception.InvalidMemberException;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Tugas1 {
    
    
    public static void startAudition(Participant p){
        p.performSoundCheck();
        
        try {
            p.validateCrew();
            System.out.println("Sesuai anjay");
        } catch (InvalidMemberException e) {
            System.out.println("Tidak Sesuai oy, " + e.getMessage());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Soloist Nadin = new Soloist();
        Band TheKick = new Band();
        
        System.out.println("Masukkan nama Soloist : ");
        String nama = input.nextLine();
        System.out.println("Masukkan jumlah crew Soloist : ");
        int crew = input.nextInt();
        Nadin.setName(nama);
        Nadin.setTotalCrew(crew);
        input.nextLine(); // Menghapus buffer biar input yang band tidak terlewat anjay
        startAudition(Nadin);
        
        
        System.out.println("Masukkan nama Band : ");
        nama = input.nextLine();
        System.out.println("Masukkan jumlah crew Band : ");
        crew = input.nextInt();
        TheKick.setName(nama);
        TheKick.setTotalCrew(crew);
        
        startAudition(TheKick);
        
    }
    
}
