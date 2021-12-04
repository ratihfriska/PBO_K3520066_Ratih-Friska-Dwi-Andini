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
public class Kerucut {
//    atribut
    int tinggi;
    int radius;
//    methods
    public void hitungLuasPermukaan(){
        double S = Math.sqrt(( radius * radius) + (tinggi*tinggi));
        double hasil = 3.14 * radius * S ;
        System.out.println("Luas Permukaan Kerucut  : " + hasil);
}
    public void hitungVolume(){
      double hasil = (3.14 * (radius * radius ) * tinggi )/3;
      System.out.println("Volume Kerucut : " + hasil);
    }
}
