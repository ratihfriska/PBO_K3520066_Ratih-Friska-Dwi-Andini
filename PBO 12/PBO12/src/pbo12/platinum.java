/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12;

/**
 *
 * @author ASUS
 */
public class platinum extends Processing{
    int biayaSewa = 45000;
    int diskon = 3/100;
    int point = 10;
    int cashback = 10000;
    int bonusPulsa = 5000;

public int hitungTotalSewa(int jmlhHari){
        int totalSewaAwal = biayaSewa * jmlhHari;
        int totalSewaDiscount = totalSewaAwal * diskon;
        return totalSewaAwal - totalSewaDiscount;
    }
    
public int hitungPoint(int jmlhHari){
    return point * jmlhHari;
}
public void printHasil(String pinjam, String kembali, int jmlhHari){

    System.out.println("Tanggal Pinjam      : " + pinjam);
    System.out.println("Tanggal Kembali     : " + kembali);
    System.out.println("Lama Sewa           : " + jmlhHari + " hari\n");

    System.out.println("Total Sewa          : Rp"+hitungTotalSewa(jmlhHari));
    System.out.println("Jumlah Poin         : "+hitungPoint(jmlhHari));
    System.out.println("Jumlah Cashback     : "+cashback);
    System.out.println("Jumlah Bonus Pulsa  : "+bonusPulsa);
}
}
