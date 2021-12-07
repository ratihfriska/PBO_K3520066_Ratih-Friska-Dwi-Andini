/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author ASUS
 */
public class Balok extends BangunRuang{
//    atribut
    public double panjang;
    public double lebar;
    public double tinggi;
//    method hitung Luas Permukaan
    public double hitungLuasPermukaan(){
       double luasPermukaan = 2*((this.panjang*this.lebar)+(this.panjang*this.tinggi)+(this.lebar*this.tinggi));
       return luasPermukaan;
    }
//    method hitung Volume
    public double hitungVolume(){
       double volume = this.lebar * this.panjang * this.tinggi;
       return volume;
    }
}
