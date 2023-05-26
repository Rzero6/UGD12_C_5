/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ugd12_c_5;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.ArrayList;
/**
  
 *
 * @author VICTUS
    Reynold Kunarto             210711015   C
    Febiola Ika Putri Wibowo    210711023   C
 */
public class UGD12_C_5 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner scan = new Scanner (System.in);
        // TODO code application logic here
        Toko toko = new Toko("One Shop", "Jl. Merdeka No.241", 20000000);
        Manager mu = new Manager("Smith", 3500000, toko, "Utama",6);
        Manager mb1 = new Manager("Michael", 3000000, toko,"Bagian",2);
        Manager mb2 = new Manager("Andreson", 1000000, toko,"Bagian",2);
        Kasir k1 = new Kasir(1, "Wilson", 300000, toko);
        Kasir k2 = new Kasir(8, "Olivia", 800000, toko);
        Kasir k3 = new Kasir(3, "Brian", 400000, toko);
        Kasir k4 = new Kasir(5, "Evans", 500000, toko);
        mb1.RekrutBawahan(k1);
        mb1.RekrutBawahan(k2);
        mb2.RekrutBawahan(k3);
        mb2.RekrutBawahan(k4);
        mu.RekrutBawahan(mb1);
        mu.RekrutBawahan(mb2);
        toko.setPenanggungJawab(mu);
        toko.tampilDaftarKaryawan();
        System.out.println("Tampilkan Observernya saat terjadi penjualan dengan jumlah barang 5 dan harga 450000\n");
        toko.PenjualanBarang(450000, 5);
        System.out.println("\n\n\tSetelah Penjualan Berhasil\n\n");
        toko.tampilDaftarKaryawan();
    }

}
