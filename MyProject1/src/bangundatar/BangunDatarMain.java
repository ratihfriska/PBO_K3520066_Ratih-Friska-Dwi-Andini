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
public class BangunDatarMain {
    public static void main(String[] args) {
        PersegiPanjang op1 = new PersegiPanjang();
        op1.lebar = 25;
        op1.panjang = 38;
        op1.hitungLuas();
        op1.hitungKeliling();
        Persegi A = new Persegi();
        A.sisi=10;
        A.hitungLuas();
        A.hitungKeliling();
        Persegi B = new Persegi();
        B.sisi=15;
        B.hitungLuas();
        B.hitungKeliling();
        Lingkaran X = new Lingkaran();
        X.radius = 25;
        X.hitungLuas();
        X.hitungKeliling();
        Lingkaran Z = new Lingkaran();
        Z.radius = 37;
        Z.hitungLuas();
        Z.hitungKeliling();
    }
}
