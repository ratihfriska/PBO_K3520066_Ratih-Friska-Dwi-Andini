/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author ASUS
 */
public class Lingkaran extends BangunDatar {
//    atribut jari-jari
    public double r;
//    method untuk hitung luas lingkaran
    public double hitungLuas(){
        double luas = 3.14 * this.r * this.r;
        return luas;
    }
//    method untuk hitung keliling
    public double hitungKeliling(){
        double keliling = 3.14 *2*this.r;
        return keliling;
    }
}
