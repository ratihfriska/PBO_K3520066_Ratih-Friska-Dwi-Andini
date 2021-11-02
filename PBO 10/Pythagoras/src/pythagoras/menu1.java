/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoras;
import java.util.Scanner;


public class menu1 {
    
public void soal1(){
        Scanner jawab = new Scanner(System.in);
        System.out.println("Masukkan Nilai A : ");
        int a = jawab.nextInt();
        System.out.println("Masukkan Nilai B : ");
        int b = jawab.nextInt();
        System.out.println("Masukkan Nilai C : ");
        int c = jawab.nextInt();
        
        int d = c*c;
        int e = a*a + b*b;
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
        
        if(d == e){
            System.out.println("Merupakan Pythagoras");
            
            
        }
        else{
            System.out.println("Bukan Pythagoras");
        }
        
}
}

