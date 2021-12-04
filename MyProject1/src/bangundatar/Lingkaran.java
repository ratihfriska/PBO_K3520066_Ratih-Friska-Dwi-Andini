/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author hp
 */
public class Lingkaran {
//    atribut
    public int radius;
//    methods
    public void hitungLuas(){
        double hasil = 3.14 * radius * radius ;
        System.out.println("Luas Lingkaran : " + hasil);
        
    }
    public void hitungKeliling(){
      double hasil = 3.14 * 2 * radius;
        System.out.println("Keliling Lingkaran : " + hasil);
    }
}
