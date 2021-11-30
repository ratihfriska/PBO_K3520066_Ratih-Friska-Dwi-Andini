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
public class silver extends Processing{
    private int biayaSewa = 25000;
    private int diskon = 1/100;
    private int point = 1;
    
    public void setBiayaSewa(int biayaSewa){
        this.biayaSewa = biayaSewa;
    }
    public int getBiayaSewa(){
        return this.biayaSewa;
    }
    public void setDiskon(int diskon){
        this.diskon= diskon;
    }
    public void setPoint(int point){
        this.point= point;
    }
    public int hitungTotalSewa(int jmlhHari){
        int totalSewaMula = this.biayaSewa * jmlhHari;
        int totalSewaDisc = totalSewaMula * diskon;
        return totalSewaMula - totalSewaDisc;
    }
    
    public int hitungPoint(int banyakHari){
        return this.point * banyakHari;
    }
    
    public void printHasil(String pinjam, String kembali, int jmlhHari){
        
        System.out.println("Tanggal Pinjam      : " + pinjam);
        System.out.println("Tanggal Kembali     : " + kembali);
        System.out.println("Lama Sewa           : " + jmlhHari + " hari\n");  
        System.out.println("Total Sewa          : Rp"+hitungTotalSewa(jmlhHari));
        System.out.println("Jumlah Poin         : "+hitungPoint(jmlhHari));
    }
}
