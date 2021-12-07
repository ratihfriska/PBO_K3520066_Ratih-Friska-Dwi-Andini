
import bangundatar.Persegi;
import bangundatar.Lingkaran;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Tabung;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class MainClass {
    public static void main(String[] args){
//        Persegi
        Persegi a = new Persegi();
        a.sisi=10;
        System.out.println("Persegi dengan sisi "+a.sisi+" Luasnya "+a.hitungLuas() +" dan Keliling " + a.hitungKeliling());
//        Lingkaran
        Lingkaran b = new Lingkaran();
        b.r = 7;
        System.out.println("Lingkaran dengan jari-jari " +b.r+" Luasnya "+b.hitungLuas()+" dan Kelilingnya " + b.hitungKeliling() );
//        Balok
        Balok c = new Balok();
        c.panjang=10;
        c.lebar=8;
        c.tinggi=6;
        System.out.println("Balok dengan panjang " + c.panjang+", lebar "+c.lebar+", dan tinggi "+c.tinggi+" memiliki Luas Permukaan : " + c.hitungLuasPermukaan() +" dan volume : " + c.hitungVolume());
//        Bola
        Bola d = new Bola();
        d.r=7;
        System.out.println("Bola dengan jari-jari "+d.r+" memiliki Luas Permukaan : "+d.hitungLuasPermukaan()+"dan memiliki Volume : " + d.hitungVolume());
//        Tabung
        Tabung e = new Tabung();
        e.r=7;
        e.t=10;
        System.out.println("Tabung dengan jari jari " + e.r+" dan tinggi "+e.t+" memiliki Luas Permukaan : " + e.hitungLuasPermukaan() +" dan volume : " + e.hitungVolume());
    }
}
