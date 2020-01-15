/*Hello World*/
import java.util.Scanner;

public class Biodata {

    public static void main(String[] args) {
        //deklarasi veriable
        String Nama;
        String Nim;
        String Kelas;
        String Alamat;
        //memberikan nilai pada variable secara dinamis
        //memanggil class scanner
        Scanner input_bio=new Scanner (System.in);
        //nama
        System.out.print("Nama:");
        Nama="Soleh";
        //nim
        System.out.print("Nim:");
        Nim="1917";
        //Kelas
        System.out.print("Kelas:");
        Kelas="1200";
        //Alamat
        System.out.print("Alamat:");
        Alamat="Jakarta";
        //cetak nama, nim, kelas, dan alamat
        System.out.println("Nama"+Nama);
        System.out.println("Nim"+Nim);
        System.out.println("Kelas"+Kelas);
        System.out.println("Alamat"+Alamat);
    }
    
}
