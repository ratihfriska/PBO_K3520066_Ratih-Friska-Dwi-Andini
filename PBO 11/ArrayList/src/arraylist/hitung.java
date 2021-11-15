/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author hp
 */
public class hitung {
      ArrayList<String> dataBil = new ArrayList<>();
    
    void add(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan data string: ");
        this.dataBil.add(input.nextLine());
        System.out.print("Ketik Enter untuk kembali ke menu");
        input.nextLine();
    }
     void read(){
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar string dalam array list: "+ this.dataBil);
        System.out.print("Ketik Enter untuk kembali ke menu");
        input.nextLine();
    }
    void search(){
        Scanner input = new Scanner(System.in);
        System.out.print("String yang mau dicari: ");
        String data = input.nextLine();
        int index = this.dataBil.indexOf(data);
        if(index>-1){
            System.out.print("String " + data + " ada di index ke " + index + " di dalam data");
        }else{
            System.out.print("String " + data + " tidak ada dalam data");
        }
        System.out.print("Ketik Enter untuk kembali ke menu");
        input.nextLine();
    }
    
    void delete(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan string yang mau dicari: ");
        String data = input.nextLine();
        int index = this.dataBil.indexOf(data);
        if(index>-1){
            this.dataBil.remove(index);
            System.out.print("String "+data+" sudah dihapus di dalam data");
        }else{
            System.out.print("String "+data+" tidak ada dalam data");
        }
        System.out.print("Ketik Enter untuk kembali ke menu");
        input.nextLine();
    }
    void menu(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Menu Utama");
            System.out.println("1. Tambah");
            System.out.println("2. Cari");
            System.out.println("3. Hapus");
            System.out.println("4. Tampil");
            System.out.println("5. keluar");
            System.out.print("Pilih menu: ");
            int handler = input.nextInt();
            switch(handler){
                case 1:
                    add();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    read();
                    break;
                case 5:
                    System.out.println("Terimakasih");
                    System.exit(0);
                    break;
            }
        }
    }
   
    
    
}

