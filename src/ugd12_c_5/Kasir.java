/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ugd12_c_5;

/**
 * Nama : Reynold Kunarto 
 * NPM : 210711015
 * 
 * Nama : Febiola Ika Putri Wibowo
 * NPM : 210711023
 */
/**
 *
 * @author Msi Modern 14
 */
public class Kasir extends Karyawan implements IComposite{
    private int jumlahLembur;

    public Kasir(int jumlahLembur, String nama, double tunjangan, Toko toko) {
        super(nama, tunjangan, toko);
        this.jumlahLembur = jumlahLembur;
    }

    @Override
    public void Update(double jumlah) {
        double bonus = jumlah + (jumlahLembur*10000);
        tunjangan += bonus;
        System.out.println("\t--- Tunjangan "+nama+" Bertambah Sebanyak Rp. "+bonus);
    }

    @Override
    public void ShowData() {
        
        System.out.println("[Kasir] "+nama+" - Total Tunjangan: "+tunjangan);
    }

    @Override
    public double GetTunjangan() {
        return tunjangan;
    }
}
