/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEncapsulation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Processing {
    public dataMember dataMembers;
    ArrayList<dataMember> dataMember = new ArrayList<>();
    private String Id, Pinjam, Kembali;
    private int tglPinjam, blnPinjam, thnPinjam, tglKembali, blnKembali, thnKembali;
    
    public void input(){    
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member: ");
        Id = input.nextLine();
        member member = new member();
        member.tambah(new dataMember("M001", "Mr. X", "Silver"));
        member.tambah(new dataMember("M002", "Mr. Y", "Gold"));
        member.tambah(new dataMember("M003", "Mr. Z", "Platinum"));
        this.dataMembers = member.cari(Id);
        System.out.print("Masukkan Tgl Pinjam: ");
        tglPinjam = input.nextInt();
        System.out.print("Masukkan Bulan Pinjam: ");
        blnPinjam = input.nextInt();
        System.out.print("Masukkan Tahun Pinjam: ");
        thnPinjam = input.nextInt();
        System.out.print("Masukkan Tgl Kembali: ");
        tglKembali = input.nextInt();
        System.out.print("Masukkan Bulan Kembali: ");
        blnKembali = input.nextInt();
        System.out.print("Masukkan Tahun Kembali: ");
        thnKembali = input.nextInt();
        System.out.println();
        this.Pinjam = tglPinjam+"-"+blnPinjam+"-"+thnPinjam;
        this.Kembali = tglKembali+"-"+blnKembali+"-"+thnKembali;
        
        LocalDate calePinjam = LocalDate.of(thnPinjam, blnPinjam, tglPinjam);
        LocalDate caleKembali = LocalDate.of(thnKembali, blnKembali, tglKembali);
        long period = ChronoUnit.DAYS.between(calePinjam, caleKembali);
        if(period <0){
            System.out.println("Waktu peminjaman tidak valid");
            System.exit(1);
        }
        switch(this.dataMembers.jenis){
            case "Silver":
                silver silver = new silver();
                member.printMember();
                silver.printHasil(Pinjam, Kembali, (int)period);
                break;
            case "Gold":
                gold gold = new gold();
                member.printMember();
                gold.printHasil(Pinjam, Kembali, (int)period);
                break;
            case "Platinum":
                platinum plat = new platinum();
                member.printMember();
                plat.printHasil(Pinjam, Kembali, (int)period);
                break;
        }
    }
}
