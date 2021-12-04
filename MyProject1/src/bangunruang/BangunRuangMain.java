/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author hp
 */
public class BangunRuangMain {
    public static void main(String[] args) {
        Bola p1 = new Bola();
        p1.radius = 14;
        p1.hitungVolume();
        p1.hitungLuasPermukaan();
        
        Tabung p2 = new Tabung ();
        p2.radius = 14;
        p2.tinggi = 10;
        p2.hitungVolume();
        p2.hitungLuasPermukaan();
        
        Kerucut p3 = new Kerucut();
        p3.tinggi=10;
        p3.radius= 10;
        p3.hitungVolume();
        p3.hitungLuasPermukaan();
    }    
}
