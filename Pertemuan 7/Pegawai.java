/** 
* File      : Pegawai.java
* Penulis   : Mulya Irwansyah
* Deskripsi : Kelas yang berupa metode untuk menghitung gaji pegawai
*
*/

public class Pegawai {
    private String nama;
    private int gajiPokok;

    public void SetNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : " + this.nama + ", " + "Gaji Pokok : " + this.gajiPokok);
    }
}