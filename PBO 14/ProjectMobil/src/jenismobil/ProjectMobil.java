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
public abstract class ProjectMobil {
    public double kecepatan;
    public double jarak;
    public double habis;
    public String perjalanan;
    public String name;
    public String jenis;
    public abstract double hitungBahanBakar();
    public abstract double hitungWaktu();
    public void tampilhasil(){
        System.out.print("Mobil "+this.name);
        System.out.println(" dengan jenis " + this.jenis);
        System.out.print("Menempuh Perjalanan " + this.perjalanan);
        System.out.println(" dengan jarak "+ this.jarak + " km");
        System.out.println("Dengan Kecepatan rata-rata " + this.kecepatan + " km/jam");
        System.out.println("Menghabiskan bahan bakar sebanyak : " + Math.ceil(this.hitungBahanBakar())+" liter");
        System.out.println("Estimasi Waktu : " + this.hitungWaktu()+ " jam");
        System.out.println("=================================================================");
    }
}
