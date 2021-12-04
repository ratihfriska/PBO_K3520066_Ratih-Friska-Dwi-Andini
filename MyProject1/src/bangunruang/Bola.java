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
public class Bola {
//    atribut
    int radius;
//    methods
    public void hitungLuasPermukaan(){
        double hasil = 4 * 3.14 * radius * radius;
        System.out.println("Luas Permukaan Bola : " + hasil);
}
    public void hitungVolume(){
     double hasil = (4 * 3.14 *(radius * radius * radius))/3;
        System.out.println("Volume Bola : " + hasil);
    }
}
