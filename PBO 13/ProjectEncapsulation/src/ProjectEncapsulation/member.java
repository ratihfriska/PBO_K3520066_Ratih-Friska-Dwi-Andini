/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectEncapsulation;

/**
 *
 * @author ASUS
 */
public class member extends Processing{
    public void tambah(dataMember data) {
        this.dataMember.add(data);
    }
    
    public dataMember cari(String memberId){
        boolean found = false;
        int j = -1;
        for(int i=0; i<this.dataMember.size(); i++){
            if (this.dataMember.get(i).Id.equals(memberId)){
                j = i;
                found = true;
                break;
            }
        }

        if(j>-1){
            this.dataMembers = this.dataMember.get(j);
        }else{
            System.out.println("ID Member tidak valid/ditemukan");
            System.exit(1);
        }
        return this.dataMembers;
    }
    
    public void printMember(){
        System.out.println("ID Member           : "+this.dataMembers.Id);
        System.out.println("Nama Member         : "+this.dataMembers.nama);
        System.out.println("Jenis Member        : "+this.dataMembers.jenis+"\n");
    }
    
}
