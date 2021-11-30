/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEncapsulation;

/**
 *
 * @author ASUS
 */
public class gold extends Processing{
    private int biayaSewa = 30000;
    private int diskon = 2/100;
    private int point = 5;
    private int cashback = 5000;
    
    public void setBiayaSewa(int biayaSewa){
        this.biayaSewa = biayaSewa;
    }
    public void setDiskon(int diskon){
        this.diskon= diskon;
    }
    public void setPoint(int point){
        this.point= point;
    }
    public void setCashBack(int cashback){
        this.cashback=cashback;
    }
    
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
    }
}
