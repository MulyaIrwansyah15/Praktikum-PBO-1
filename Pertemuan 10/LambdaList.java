import java.util.ArrayList;

/**
 *  File        : LambdaList.java
 *  Pembuat     : Mulya Irwansyah / 24060121140110
 *  Deskripsi   : Implementasi lambda pada List, digunakan sebagai parameter pada method.
 */

public class LambdaList{
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}