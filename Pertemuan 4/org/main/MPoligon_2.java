/** 
 * File      : MPoligon_2.java
 * Penulis   : Mulya Irwansyah
 * Deskripsi : driver class untuk poligon dan segitiga
 */

package main;

import bangundatar.*;

public class MPoligon_2 {
    public static void main(String[] args){
        Segitiga segitiga = new Segitiga(15, 20, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
    }    
}
