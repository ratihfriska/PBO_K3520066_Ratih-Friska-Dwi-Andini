/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdatakaryawan;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class MainClass {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        processing krywn = new processing();
        Scanner data = new Scanner(System.in);
        String plhn, jwb ="y";
        while(jwb.equalsIgnoreCase("y")){
            System.out.println("=================================");
            System.out.println("DATA KARYAWAN");
            System.out.println("---------------------------------");
            System.out.println("Menu Utama");
            System.out.println("1. Tambah Data Karyawan");
            System.out.println("2. Hapus Data Karyawan");	
            System.out.println("3. Cari Data Karyawan");
            System.out.println("4. Lihat Data Karyawan ");
            System.out.println("5. Exit");
            System.out.print("\nMenu yang dipilih : ");
            plhn = data.nextLine();
            switch (plhn) {
                case "1":
                    System.out.println("===================================================================");
                    krywn.Add();
                    break;
                case "2":
                    System.out.println("===================================================================");
                    krywn.Delete();
                    break;
                case "3":
                    System.out.println("===================================================================");
                    krywn.Search();
                    break;
                case "4":
                    System.out.println("===================================================================");
                    krywn.View();
                    break;
                case "5":
                    System.out.println("Terimakasih, Sampai Jumpa Kembali");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada pada menu");
                    break;
            }
            
            System.out.print("Ingin Melanjutkan? (y=Ya ; n=Tidak)   :   ");
            jwb = data.nextLine();
        } if (jwb.equalsIgnoreCase("n")){
            System.out.println("Terimakasih, Sampai Jumpa Kembali");
            System.exit(0);
        }
    }
    
}
