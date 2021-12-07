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
public class Tabung extends BangunRuang{
    //    atribut
    public double r;
    public double t;
//    method hitung Luas Permukaan
    public double hitungLuasPermukaan(){
       double luasPermukaan = (2*3.14*this.r)*(this.r+this.t);
       return luasPermukaan;
    }
//    method hitung Volume
    public double hitungVolume(){
        double volume = 3.14*this.r*this.r*this.t;
        return volume;
    }
}
