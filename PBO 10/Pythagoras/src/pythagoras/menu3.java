/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoras;

import java.util.Scanner;

public class menu3 {
    public static void soal3 (){
        Scanner jawab = new Scanner(System.in);
        System.out.println("Masukkan Nilai A : ");
        int a = jawab.nextInt();
        System.out.println("Masukkan Nilai C : ");
        int c = jawab.nextInt();
        int b = c*c - a*a;
        double d = Math.sqrt(b);
        System.out.println("Jadi Nilai dari B adalah "+d);
    }
}
