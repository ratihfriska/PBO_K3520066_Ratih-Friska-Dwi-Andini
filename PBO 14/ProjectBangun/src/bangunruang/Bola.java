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
public class Bola extends BangunRuang{
//    atribut
    public double r;
//    method hitung Luas Permukaan
    public double hitungLuasPermukaan(){
       double luasPermukaan = 4 * 3.14 * this.r * this.r;
       return luasPermukaan;
    }
//    method hitung Volume
    public double hitungVolume(){
        double volume = (4*3.14*this.r*this.r*this.r)/3;
        return volume;
    }
}
