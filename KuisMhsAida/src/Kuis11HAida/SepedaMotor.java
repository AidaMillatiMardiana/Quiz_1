/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis11HAida;

/**
 *
 * @author HP
 */
public class SepedaMotor {
    String merk;
    boolean kontakMotor = false;
    int kecepatanMotor;
    
    SepedaMotor(){
    }
    
    SepedaMotor(String merk){
        this.merk = merk;
    }
    
    void nyalakanMotor(boolean kontak){
        this.kontakMotor = kontak;
    }
    
    void matikanMotor(boolean kontak){
        this.kontakMotor = kontak;
    }
    
    void tambahKecepatanMotor(int kec){
        if (kecepatanMotor >= 100) {
            System.out.println("Kecepatan maksimum mesin adalah 100 Km/jam");
        } 
    }
    
    void kurangiKecepatanMotor(int kec){
        if (kecepatanMotor <= 0) {
            System.out.println(" kecepatan mininumnya adalah 0 Km/jam.");
        }
    }
    
    void info(){
        
    }
}
