/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenismobil;

/**
 *
 * @author ASUS
 */
public class Sedan extends ProjectMobil{
    public double hitungWaktu(){
       double waktu = this.jarak / this.kecepatan;
       return waktu;
    }
    public double hitungBahanBakar(){
        double bahanBakar = this.jarak / this.habis;
        return bahanBakar;
    }
}
