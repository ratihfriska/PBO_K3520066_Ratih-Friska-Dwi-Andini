/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author hp
 */
public class OperasiBilangan {
    // atribut
    public int bilPertama;
    public int bilKedua;
    // methods
    public void hitungPenjumlahan(){
        int hasil = bilPertama + bilKedua;
        System.out.println("Hasil penjumlahan " + bilPertama + " + " + bilKedua + " = " + hasil);
    }
    public void hitungPengurangan(){
        int hasil = bilPertama - bilKedua;
        System.out.println("Hasil pengurangannya " + bilPertama + " - " + bilKedua + " = " + hasil);
    }
    public void hitungPerkalian(){
        int hasil = bilPertama * bilKedua;
        System.out.println("Hasil perkaliannya " + bilPertama + " * " + bilKedua + " = " + hasil);
    }
    public void hitungPembagian(){
        double hasil = bilPertama / bilKedua;
        System.out.println("Hasil pembagiannya " + bilPertama + " * " + bilKedua + " = " + hasil);
    }
}
