/** 
 * File      : Segitiga.java
 * Penulis   : Mulya Irwansyah
 * Deskripsi : representasi dari objek segitiga, turunan kelas poligon
 */

package bangundatar;

import poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return (alas * tinggi)/2;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga berisi : "+this.getJumlahSisi());
    }
}