/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9indira;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Latihan4 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        
        double jarak, waktu;
        double kecepatan;
        
        System.out.print ("Masukkan jarak (km) : ");
        jarak = input .nextDouble();
        
        System.out.print ("Masukkan waktu tempuh (jam) : ");
        waktu = input.nextDouble();
        
        kecepatan = jarak / waktu;
        System.out.println ("Kecepatan mobil (km/jam) : "+kecepatan);
       
    }
}
