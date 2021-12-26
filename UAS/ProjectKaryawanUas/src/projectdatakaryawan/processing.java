/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatakaryawan;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class processing extends dataKaryawan implements hitungGaji {
    ArrayList<String>   kode           = new ArrayList<>();  
    ArrayList<String>   nama           = new ArrayList<>();
    ArrayList<String>   gol            = new ArrayList<>();
    ArrayList<Integer>  usia            = new ArrayList<>();
    ArrayList<String>   status          = new ArrayList<>();
    ArrayList<Integer>  jmlhAnak    = new ArrayList<>();
            
    ArrayList<Integer>  gajiPokok       = new ArrayList<>();
    ArrayList<Double>   tunjanganIstri  = new ArrayList<>();
    ArrayList<Double>   tunjangan       = new ArrayList<>();
    ArrayList<Double>   tunjanganAnak   = new ArrayList<>();
    ArrayList<Double>   gajiKotor       = new ArrayList<>();
    ArrayList<Double>   potongan        = new ArrayList<>();
    ArrayList<Double>   gajiBersih      = new ArrayList<>();
    
    int tunjanganistri  = 0;
    int gajikotor,tunjangananak = 0;
    int tunjangankaryawan       = 0;
    int gajibersih, potong, tahunlahir;
    String cari, delete;
    
    @Override
    public double hitungTunjanganIstri() {                    
            tunjanganistri = (int) (GajiPokok * 0.1);
            return tunjanganistri;
        }
    public double hitungTunjangan() {
            if(super.Usia>30){
                tunjangankaryawan           = (int) (GajiPokok * 0.15);                
            }
            tunjangankaryawan           = (int) (GajiPokok * 0.15);
            return tunjangankaryawan;
        }
    @Override
    public double hitungTunjanganAnak() {
            if(super.JmlhAnak>0){
                tunjangananak               = (int) (GajiPokok * JmlhAnak * 0.05);
            }
            tunjangananak        = (int) (GajiPokok * JmlhAnak * 0.05);
            return tunjangananak;
        }
    @Override
    public double hitungGajiKotor() {
            return
            gajikotor = GajiPokok + tunjangankaryawan + tunjanganistri + tunjangananak;
        }
    @Override
    public double hitungPotongan() {
            return
            potong = (int) (gajikotor * 0.025);
        }
    @Override
    public double hitungGajiBersih() {
            return gajibersih = gajikotor - potong;
        }
    public void Add() throws IOException {
        Scanner data = new Scanner(System.in);
        System.out.println("Tambah Data Karyawan");
        System.out.print("Masukkan Kode Karyawan    :   ");
        Kode= data.nextLine();
        System.out.print("Masukkan Nama Karyawan    :   ");
        Nama = data.nextLine();
        System.out.print("Masukkan Alamat Karyawan  :   ");
        Alamat = data.nextLine();
        System.out.print("Masukkan Tahun Kelahiran  :   ");
        System.out.print("Masukkan Tanggal Lahir (YYYY-MM-DD) :   " + (tahunlahir = data.nextInt()) + "-" +(TglLahir = data.nextLine()) );
        Usia = 2021 - tahunlahir;
        TglLahir= data.nextLine();
        
        boolean running = true;
        int j     = 0;
        while( running ) {
            System.out.print("Masukkan Golongan (A/B/C)\t\t : ");
            Gol = data.nextLine();
            if (Gol.equalsIgnoreCase("A")){
                GajiPokok =+ 5000000;
                running = false;                
            } else if (Gol.equalsIgnoreCase("B")){
                GajiPokok =+ 6000000;
                running = false;
            } else if (Gol.equalsIgnoreCase("C")){
                GajiPokok =+ 7000000;
                running = false;
            } else{
                System.out.println("Input Golongan Invalid, Masukkan dengan Benar");
                running = true;
                j++;
            }
        }
        
        boolean run = true;
        while(run){
            String Status;
            System.out.print("Masukkan Status Menikah (0:belum menikah, 1:sudah menikah)    :   ");
            Status= data.nextLine();
            
            switch (Status) {
                case "1":
                    statusMenikah = "Sudah Menikah";
                    System.out.print("Masukkan Jumlah Anak    :   ");
                    JmlhAnak = data.nextInt();
                    run = false;
                    break;
                case "0":
                    statusMenikah = "Belum Menikah";
                    System.out.println("Karyawan Belum Menikah");
                    JmlhAnak = 0;
                    run = false;
                    break;
                default:
                    System.out.print("Input Status Menikah Invalid, Masukkan dengan Benar (0:belum menikah, 1:sudah menikah)  :   ");
                    run = true;
                    j++;
                    break;
            }
        }
        kode.add(Kode);
        nama.add(Nama);
        gol.add(Gol);
        usia.add(Usia);
        status.add(statusMenikah);
        jmlhAnak.add(JmlhAnak);
        gajiPokok.add(GajiPokok);
        tunjanganIstri.add(hitungTunjanganIstri());
        tunjangan.add(hitungTunjangan());
        tunjanganAnak.add(hitungTunjanganAnak());
        gajiKotor.add(hitungGajiKotor());
        potongan.add(hitungPotongan());
        gajiBersih.add(hitungGajiBersih());
    }
    
//    SEARCH
    public void Search() throws IOException{
        Scanner data = new Scanner(System.in);
        System.out.println("Search Data Karyawan");
        System.out.print("Masukkan Kode Karyawan yang dicari  :   ");
        cari = data.nextLine();
        System.out.println("\nDATA KARYAWAN");
        for(int i = 0; i<kode.size();i++){
            if(kode.get(i).equals(cari)){
                System.out.println("Kode Karyawan           :   "+kode.get(i));
                System.out.println("Nama Karyawan           :   "+nama.get(i));
                System.out.println("Golongan                :   "+gol.get(i));
                System.out.println("Usia                    :   "+usia.get(i));
                System.out.println("Status Menikah          :   "+status.get(i));
                System.out.println("Jumlah Anak             :   "+jmlhAnak.get(i));
                System.out.println("--------------------------------------------");
                System.out.println("Gaji Pokok              :   "+gajiPokok.get(i));
                System.out.println("Tunjangan Istri/Suami   :   "+tunjanganIstri.get(i));
                System.out.println("Tunjangan Karyawan      :   "+tunjangan.get(i));
                System.out.println("Tunjangan Anak          :   "+tunjanganAnak.get(i));
                System.out.println("----------------------------------------------");
                System.out.println("Gaji Kotor              :   "+gajiKotor.get(i));
                System.out.println("Potongan                :   "+potongan.get(i));
                System.out.println("----------------------------------------------");
                System.out.println("Gaji Bersih             :   "+gajiBersih.get(i));
            } else {
                System.out.println("Mohon Maaf, Kode Karyawan tidak Ditemukan");
            }
        }
    }
    
//    VIEW
    public void View() throws IOException{
        System.out.println("DATA KARYAWAN");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("\tKODE KARY  \tNAMA KARY\tGOL\tUSIA \tSTATUS NIKAH \tJUMLAH ANAK");
        System.out.println("----------------------------------------------------------------------------------------");

        for(int i=0;i<kode.size();i++) {
            System.out.println("\t"+kode.get(i)+"\t\t"+nama.get(i)+"   \t\t"
            +gol.get(i)+"\t"+usia.get(i)+"\t"+status.get(i)
            +"\t    "+jmlhAnak.get(i));
        }
        System.out.println("----------------------------------------------------------------------------------------");		
    }
    
    public void Delete() throws IOException{
        Scanner data = new Scanner(System.in);
        System.out.println("HAPUS DATA KARYAWAN");
        System.out.print("Masukkan kode karyawan yang ingin Anda hapus  : ");
        delete = data.nextLine();
        for(int i=0; i<kode.size(); i++){
            if (kode.get(i).equals(delete)){
                kode.remove(i);
                nama.remove(i);
                gol.remove(i);
                usia.remove(i);
                status.remove(i);
                jmlhAnak.remove(i);
                gajiPokok.remove(i);
                tunjanganIstri.remove(i);
                tunjangan.remove(i);
                tunjanganAnak.remove(i);
                gajiKotor.remove(i);
                potongan.remove(i);
                gajiBersih.remove(i);
                System.out.println("Data Karyawan berhasil dihapus");
        } else {
                System.out.println("Kode tidak ditemukan");
            }
        }
    }

    @Override
    public double hitungTunjanganKaryawan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
