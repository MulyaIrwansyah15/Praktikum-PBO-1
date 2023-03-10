/*
	File      : Titik.java
	Nama      : Mulya Irwansyah
	NIM       : 240601211140110
    Tanggal   : Senen, 06 Maret 2023 

*/

public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik; //menghitung objek titik
    
    public Titik(double a, double o){
        counterTitik++;
        absis = a;
        ordinat = o;
    }
    public Titik(){
        counterTitik++;
        absis = 0;
        ordinat = 0;
    }
    public void setAbsis(double a){
        absis = a;
    }
    public void setOrdinat(double o){
        ordinat = o;
    }
    public double getAbsis(){
        return absis;
    }
    public double getOrdinat(){
        return ordinat;
    }
    public int getCounterTitik(){
        return counterTitik;
    }
}
