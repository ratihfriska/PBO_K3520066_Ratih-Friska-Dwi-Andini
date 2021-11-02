/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoras;

import java.util.Scanner;

/**
 *
 * @author windmouse
 */
public class menu2 {
    public static void soal2(){
        Scanner jawab = new Scanner(System.in);
        System.out.println("Masukkan Nilai A : ");
        int a = jawab.nextInt();
        System.out.println("Masukkan Nilai B : ");
        int b = jawab.nextInt();
        int c = a*a + b*b;
        double d = Math.sqrt(c);
        
        System.out.println("Sisi Miringnya adalah : "+d);
    }
}
