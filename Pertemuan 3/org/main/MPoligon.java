/** 
 * File      : MPoligon.java
 * Penulis   : Mulya Irwansyah
 * Deskripsi : driver class untuk poligon dan persegi panjang
 */

package main;

import bangundatar.*;

public class MPoligon{
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
    }    
}
