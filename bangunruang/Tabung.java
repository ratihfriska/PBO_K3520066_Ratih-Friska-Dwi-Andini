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
public class Tabung {
//    atribut
    int radius;
    int tinggi;
//    methods
    public void hitungLuasPermukaan(){
        double hasil = 2 * 3.14 * radius * (radius + tinggi) ;
        System.out.println("Luas Permukaan Tabung : " + hasil);
}
    public void hitungVolume(){
      double hasil = 3.14 * (radius*radius)*tinggi;
        System.out.println("Volume Tabung : " + hasil);
    }
}
