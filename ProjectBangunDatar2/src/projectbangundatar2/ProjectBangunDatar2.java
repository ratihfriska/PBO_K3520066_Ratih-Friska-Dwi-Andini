/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author hp
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operasi p1= new Operasi();
//        Persegi Panjang
        System.out.println("Persegi Panjang");
        System.out.println("Keliling Persegi Panjang dengan panjang 10 dan lebar 5 adalah "+p1.KelPersegiPanjang(10, 5));
        System.out.println("Luas Persegi Panjang dengan panjang 10 dan lebar 5 adalah "+ p1.LuasPersegiPanjang(10, 5));
        System.out.println("Keliling Persegi Panjang dengan panjang 3.6 dan lebar 8 adalah "+p1.KelPersegiPanjang(3.6, 8));
        System.out.println("Luas Persegi Panjang dengan panjang 3.6 dan lebar 8 adalah "+ p1.LuasPersegiPanjang(3.6, 8));
        System.out.println("Keliling Persegi Panjang dengan panjang 6 dan lebar 8.3 adalah "+p1.KelPersegiPanjang(6, 8.3));
        System.out.println("Luas Persegi Panjang dengan panjang 6 dan lebar 8.3 adalah "+ p1.LuasPersegiPanjang(6, 8.3));
        System.out.println("Keliling Persegi Panjang dengan panjang 5.6 dan lebar 8.8 adalah "+p1.KelPersegiPanjang(5.6, 8.8));        
        System.out.println("Luas Persegi Panjang dengan panjang 5.6 dan lebar 8.8 adalah "+ p1.LuasPersegiPanjang(5.6, 8.8));
//        Persegi
        System.out.println("Persegi");
        System.out.println("Keliling Persegi dengan sisi 4.5 adalah " + p1.KelPersegi(4.5));
        System.out.println("Luas Persegi dengan sisi 4.5 adalah " + p1.LuasPersegi(4.5));
        System.out.println("Keliling Persegi dengan sisi 7 adalah " + p1.KelPersegi(7));
        System.out.println("Luas Persegi dengan sisi 7 adalah " + p1.LuasPersegi(7));
//        Lingkaran
        System.out.println("Lingkaran");
        System.out.println("Keliling Lingkaran dengan jari jari 5 adalah "+p1.KelLingkaran(5));
        System.out.println("Luas Lingkaran dengan jari jari 5 adalah "+p1.LuasLingkaran(5));
        System.out.println("Keliling Lingkaran dengan jari jari 7.4 adalah "+p1.KelLingkaran(7.4));
        System.out.println("Luas Lingkaran dengan jari jari 7.4 adalah "+p1.LuasLingkaran(7.4));
//        Segitiga
        System.out.println("segitiga");
        System.out.println("Keliling Segitiga dengan Panjang alas 8 dan Tinggi 10 adalah " + p1.Kelsegitiga(8, 10));
        System.out.println("Luas Segitiga dengan Panjang alas 8 dan Tinggi 10 adalah" + p1.LuasSegitiga(8, 10));
        System.out.println("Keliling segitiga dengan Panjang alas 8 dan Tinggi 11.5 adalah " + p1.Kelsegitiga(8, 11.5));
        System.out.println("Luas Segitiga dengan Panjang alas 8 dan Tinggi 11.5 adalah : "+p1.LuasSegitiga(8, 11.5));
        System.out.println("Keliling Segitiga dengan Panjang alas 12.2 dan Tinggi 9 adalah : "+ p1.Kelsegitiga(12.2, 9));
        System.out.println("Luas segitiga dengan Panjang alas 12.2 dan Tinggi 9 adalah " + p1.LuasSegitiga(12.2, 9));
        System.out.println("Keliling Segitiga dengan Panjang alas 13.9 dan Tinggi 20.7 adalah " + p1.Kelsegitiga(13.9, 20.7));
        System.out.println("Luas Segitiga dengan Panjang alas 13.9 dan Tinggi 20.7 adalah "+p1.LuasSegitiga(13.9, 20.7));
    }
}
