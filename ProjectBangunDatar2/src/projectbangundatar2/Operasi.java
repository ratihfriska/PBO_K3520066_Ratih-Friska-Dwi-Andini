/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author hp
 */
public class Operasi {
//    Persegi Panjang
    int KelPersegiPanjang(int p, int l){
        return(2*(p+l));
    }
    double KelPersegiPanjang(double p, double l){
        return(2*(p+l));
    }
    int LuasPersegiPanjang(int p, int l){
        return(p*l);
    }
    double LuasPersegiPanjang(double p, double l){
        return(p*l);
    }
    
//    Persegi
    int KelPersegi(int s){
        return(4*s);
    }
    double KelPersegi(double s){
        return(4*s);
    }
    int LuasPersegi(int s){
        return(s*s);
    }
    double LuasPersegi(double s){
        return(s*s);
    }
//    Lingkaran
    double KelLingkaran(int r){
        return(2*3.14*r);
    }
    double KelLingkaran(double r){
        return(2*3.14*r);
    }
    double LuasLingkaran(int r){
        return(3.14*r*r);
    }
    double LuasLingkaran( double r){
        return(3.14*r*r);
    }
//Segitiga (Ceritanya Segitiga sama kaki hehe)
    double Kelsegitiga(int a, int t){
        double s1= (a*a)+(t*t);
        double s2= Math.pow(s1, .5);
        return(a+s2+s2);
    }
    double Kelsegitiga(double a, double t){
        double s1= (a*a)+(t*t);
        double s2= Math.pow(s1, .5);
        return(s2);
    }
    double LuasSegitiga(int a, int t){
        return(0.5*a*t);
    }
    double LuasSegitiga(double a, double t){
        return(0.5*a*t);
    }
    
}
