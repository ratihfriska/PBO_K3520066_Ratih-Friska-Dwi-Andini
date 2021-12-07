/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenismobil;

/**
 *
 * @author ASUS
 */
public class MainClass {
    public static void main(String[] args){
//        Mobil A 
        Sedan A = new Sedan();
        A.name= "A";
        A.jenis="Sedan";
        A.perjalanan="Solo-Kudus";
        A.habis=10;
        A.jarak=157;
        A.kecepatan=60;
        A.tampilhasil();
//      Mobil B
        Sedan B = new Sedan();
        B.name="B";
        B.jenis="Sedan";
        B.perjalanan="Solo-Jakarta";
        B.habis=10;
        B.jarak=536;
        B.kecepatan=65;
        B.tampilhasil();
//      Mobil C
        SUV C = new SUV();
        C.name="C";
        C.jenis="SUV";
        C.perjalanan="Solo-Banten";
        C.habis=12;
        C.jarak=661;
        C.kecepatan=57;
        C.tampilhasil();
//      Mobil D
        SUV D = new SUV();
        D.name="D";
        D.jenis="SUV";
        D.perjalanan="Solo-Bandung";
        D.habis=12;
        D.jarak=532;
        D.kecepatan=62;
        D.tampilhasil();
//      Mobil E
        MPV E = new MPV();
        E.name="E";
        E.jenis="MPV";
        E.perjalanan="Solo-Banyuwangi";
        E.habis=14;
        E.jarak=539;
        E.kecepatan=53;
        E.tampilhasil();
//        Mobil F
        MPV F = new MPV();
        F.name="F";
        F.jenis="MPV";
        F.perjalanan="Solo-Jember";
        F.habis=14;
        F.jarak=431;
        F.kecepatan=53;
        F.tampilhasil();
    }
}
