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
public class gold extends Processing{
    private final int biayaSewa = 30000;
    private final int diskon = 2/100;
    private final int point = 5;
    private final int cashback = 5000;
    private final int bonusPulsa = 0;
    
    public int hitungTotalSewa(int jmlhHari){
        int totalSewaAwal = biayaSewa * jmlhHari;
        int totalSewaDiscount = totalSewaAwal * diskon;
        return totalSewaAwal - totalSewaDiscount;
    }
    
    public int hitungPoint(int jmlhHari){
        return point * jmlhHari;
    }
    
    
//    @Override
    public void printHasil(String pinjam, String kembali, int jmlhHari){
        
        System.out.println("Tanggal Pinjam  : " + pinjam);
        System.out.println("Tanggal Kembali     : " + kembali);
        System.out.println("Lama Sewa           : " + jmlhHari + " hari\n");
        
        System.out.println("Total Sewa          : Rp"+hitungTotalSewa(jmlhHari));
        System.out.println("Jumlah Poin         : "+hitungPoint(jmlhHari));
        System.out.println("Jumlah Cashback     : "+cashback);
    }
}
