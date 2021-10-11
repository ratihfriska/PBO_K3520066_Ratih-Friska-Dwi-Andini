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
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        PROJECT 1
        hitungPersegi A = new hitungPersegi();
        A.sisi= 42;
        
        hitungLingkaran B = new hitungLingkaran();
        B.radius = 21;
        
        double totalLuas = A.hitungLuas() + B.hitungLuas();
        System.out.println("Bangun Pada Project 1 Luasnya : " + totalLuas );
        
//        PROJECT 2
//      Setengah Lingkaran Besar
        hitungLingkaran D = new hitungLingkaran();
        D.radius= 14;
//        Lingkaran kecil
        hitungLingkaran E = new hitungLingkaran();
        E.radius = 3.5;
//        LUAS TOTAL
        double luastotal =((0.5) * D.hitungLuas()) - E.hitungLuas();
        System.out.println("Bangun Pada Project 2 Luasnya " + luastotal);
       
    }
    
}
