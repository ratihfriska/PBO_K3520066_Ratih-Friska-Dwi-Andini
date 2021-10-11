/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author hp
 */
public class hitungLingkaran {
    double radius;
    
    double hitungLuas(){
    // menghitung luas dengan memanfaatkan class Lingkaran
        Lingkaran p = new Lingkaran();
        p.radius = this.radius;
        
        // hitung luasnya
        return p.hitungLuas();
    }
}
