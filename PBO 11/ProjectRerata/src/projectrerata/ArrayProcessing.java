/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ArrayProcessing {
     int[] dataBil = new int[100];
     
     int n;
     
     void input(){
     Scanner input = new Scanner(System.in);
         System.out.println("Masukkan banyaknya data (n) :");
         this.n = input.nextInt();
         for(int i = 0; i<n; i++){
             System.out.println("Masukkan bil ke-" + (i+1)+ ": ");
             this.dataBil[i] = input.nextInt();
         }
     }
     double hitungRerata(int[] data){
     double sum=0;
     
     for(int i=0; i<this.n ; i++){
         sum += data[i];
     }
     double rerata = sum/this.n;
     return rerata;
     }
     int hitungMax(int[] data){
        int max = data[0];
        for (int i = 0; i < this.n; i++) {
            if (data[i]>max){
                max = data[i];
        }
        
     }
       return max;
     }
     int hitungMin(int[] data){
        int min = data[0];
        for (int i = 0; i < this.n; i++) {
                if(data[i]<min){
                min = data[i];
            }
        }
        return min;
     }
      
     int urutkan(int[] data){
         int i,j,swap;
         for ( i = 0; i < this.n; i++){
             for(j=0;j<this.n-i-1;j++)
                {
                 if (data[j] > data[j+1])
                 {
                  swap = data[j];
                  data[j] = data[j+1];
                  data[j+1]=swap;
                 }
            }
         }
         System.out.print("Urutan : ");
         for(i=0;i<this.n; i++){
             System.out.print(data[i] +" ");
         }
         return 0;
     }  
     void output(){
         System.out.println("Rerata: " + this.hitungRerata(this.dataBil));
         System.out.println("Max : " + this.hitungMax(this.dataBil));
         System.out.println("Min : " + this.hitungMin(this.dataBil));
         this.urutkan(this.dataBil);

}
}