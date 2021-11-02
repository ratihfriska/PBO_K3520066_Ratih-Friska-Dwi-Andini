/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;
import java.util.Scanner;
/**
 *
 * @author hp
 */
class TebakAngka {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int random, tebak, jumlah;
        random = (int) (Math.random() * 100);
        System.out.println("Main Tebak Angka Kuyy !!");
        System.out.println("angkanya dari 0 - 100 yaaa");
        Scanner masukan = new Scanner(System.in);
        jumlah = 0;
 
        //Proses
        do {
            jumlah++;
            System.out.print("Kuy Tebak : ");
            tebak = masukan.nextInt();
 
            //Output
            if (tebak > random) {
                System.out.println("Yahh kegedean");
            } else if (tebak < random) {
                System.out.println("Yahh kekecilan bun");
            } else {
                System.out.print("Yeayy Benerr! Setelah " + jumlah + " kali nebak wkwk");
            }
        } while (tebak != random);
    }
}