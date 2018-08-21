/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9indira;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Latihan5 {
    public static int max(int a, int b, int c)
    { 
        if(a > b && a > c)
            return a;
        else if(b > a && b > c)
            return b;
        else
            return c;
    }
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        int bil1, bil2, bil3;
        
        System.out.print("Masukkan bilangan I : ");
        bil1 = baca.nextInt();
        
        System.out.print("Masukkan bilangan II : ");
        bil2 = baca.nextInt();
        
        System.out.print("Masukkan bilangan III : ");
        bil3 = baca.nextInt();
        
        System.out.println("Nilai terbesar adalah " +  max(bil1, bil2, bil3));
        
        max(bil1, bil2, bil3);
    }
}
