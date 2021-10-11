/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author hp
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operasi p1 = new Operasi();
        System.out.println(p1.jumlahkan(3,4));
        System.out.println(p1.jumlahkan(4, 7, -9));
        System.out.println(p1.jumlahkan(3.4, -0.002, 0.12313));
    }
    
}
