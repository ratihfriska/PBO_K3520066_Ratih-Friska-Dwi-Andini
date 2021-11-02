/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoras;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Pythagoras {
int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
            
        }
    static void menu (){
        System.out.println("Project Pythagoras");
        System.out.println("Menu Utama");
        System.out.println("1. Cek triple pythagoras");
        System.out.println("2. Menentukan sisi miring segitiga");
        System.out.println("3. Menentukan sisi siku-siku segitiga");
        System.out.println("4. Keluar");
        System.out.println("Pilih menu: ");
        
        
        int index = input.nextInt();
        switch (index) {
            case 1:
                menu1 a = new menu1();
                a.soal1();
                break;
            case 2:
                menu2 b = new menu2();
                b.soal2();
                break;
            case 3:
                menu3 c = new menu3();
                c.soal3();
                break;
            case 4:
                keluar();
                break;
            default:
                menu();
            }
    }
        static void keluar(){
            System.out.println("Terimakasih");
            System.exit(0);
    }
    }