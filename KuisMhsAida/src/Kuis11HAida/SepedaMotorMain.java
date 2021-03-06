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
import java.util.Scanner;
public class SepedaMotorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SepedaMotor[] spd = new SepedaMotor[4];
        spd[0] = new SepedaMotor("Honda");
        spd[1] = new SepedaMotor("Yamaha");
        spd[2] = new SepedaMotor("Ducati");
        spd[3] = new SepedaMotor("Suzuki");
        
        for (int i = 0; i < 4; i++) {
            System.out.println(i+1 + " " + spd[i].merk);
        }
        
        System.out.print("Masukkan Pilihan: ");
        int pilih = sc.nextInt();
        
        switch(pilih){
            case 1:
                System.out.println("Honda");
                System.out.println("Pilih : ");
//                int angka = sc.nextInt();
//                switch(angka){
//                    
//                }
                break;
            case 2:
                System.out.println("Yamaha");
                System.out.println("Pilih : ");
                break;
            case 3:
                System.out.println("Ducati");
                System.out.println("Pilih : ");
                break;
            case 4:
                System.out.println("Suzuki");
                System.out.println("Pilih : ");
                break;
            default:
        }
        
      
    }
    
}
