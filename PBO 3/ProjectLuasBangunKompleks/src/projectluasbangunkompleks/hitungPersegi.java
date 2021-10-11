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
public class hitungPersegi {
    // panjang sisi
    int sisi;
    
    int hitungLuas(){
        // menghitung luas dengan memanfaatkan class persegi
        Persegi p = new Persegi();        
        p.sisi= this.sisi;
        
        // hitung luasnya
        return p.hitungLuas();
    }
}
