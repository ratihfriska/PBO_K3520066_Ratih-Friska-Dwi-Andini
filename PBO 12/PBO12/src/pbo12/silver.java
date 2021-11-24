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
public class silver extends Processing{
    int biayaSewa = 25000;
    int diskon = 1/100;
    int point = 1;
    
    public int hitungTotalSewa(int jmlhHari){
        int totalSewaMula = biayaSewa * jmlhHari;
        int totalSewaDisc = totalSewaMula * diskon;
        return totalSewaMula - totalSewaDisc;
    }
    
    public int hitungPoint(int banyakHari){
        return point * banyakHari;
    }
    
    
    public void printHasil(String pinjam, String kembali, int jmlhHari){
        
        System.out.println("Tanggal Pinjam      : " + pinjam);
        System.out.println("Tanggal Kembali     : " + kembali);
        System.out.println("Lama Sewa           : " + jmlhHari + " hari\n");
        
        System.out.println("Total Sewa          : Rp"+hitungTotalSewa(jmlhHari));
        System.out.println("Jumlah Poin         : "+hitungPoint(jmlhHari));
    }
}
