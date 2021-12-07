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
public abstract class BangunRuang {
    public abstract double hitungVolume();
    public abstract double hitungLuasPermukaan();
    public void tampilhasil(){
        System.out.println("Luasnya : " + this.hitungLuasPermukaan());
        System.out.println("Volumnya : " + this.hitungVolume());
    }
}
