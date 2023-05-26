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

import java.util.ArrayList;

public class Manager extends Karyawan implements IComposite{
    private String jenis;
    private int jumlahBawahan;
    private ArrayList<Karyawan> bawahan;

    public Manager(String nama, double tunjangan, Toko toko, String jenis, int jumlahBawahan) {
        super(nama, tunjangan, toko);
        this.jenis = jenis;
        this.jumlahBawahan = jumlahBawahan;
        this.bawahan = new ArrayList<Karyawan>();
    }
    
    public void RekrutBawahan(Karyawan k){
        bawahan.add(k);
    }
    
    @Override
    public void ShowData(){
        System.out.println("[Manager]" + nama + " - Total Tunjangan : "+ tunjangan);
    }
    
    
}
