/** 
 * File      : PersegiPanjang.java
 * Penulis   : Mulya Irwansyah
 * Deskripsi : representasi dari objek persegi panjang, turunan kelas poligon
 */

package bangundatar;

import poligon.Poligon;

public class PersegiPanjang extends Poligon{
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Bangun Persegi Panjang berisi : "+this.getJumlahSisi());
    }
}