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

public class Manager extends Karyawan{
    private String jenis;
    private int jumlahBawahan;
    private ArrayList<Karyawan> bawahan;

    public Manager(String nama, double tunjangan, Toko toko, String jenis, int jumlahBawahan) {
        super(nama, tunjangan, toko);
        this.jenis = jenis;
        this.bawahan = new ArrayList<Karyawan>();
        this.jumlahBawahan = jumlahBawahan;
    }
    
    public void RekrutBawahan(Karyawan k){
        bawahan.add(k);
    }

    @Override
    public void Update(double jumlah) {
        double bonus;
        if(jenis.equalsIgnoreCase("utama")){
            bonus = jumlah+100000 + (jumlahBawahan*20000);
        }else{
            bonus = jumlah+40000 + (jumlahBawahan*10000);
        }
        
        System.out.println("\t--- Tunjangan "+nama+" bertambah sebanyak "+bonus);
        tunjangan+=bonus;
    }

    @Override
    public void ShowData() {
        System.out.println(Karyawan.space+"[Manager] "+nama+" - Total Tunjangan : "+tunjangan);
        Karyawan.space.append("   ");
        for(Karyawan k : bawahan){
            System.out.println(Karyawan.space+"\n{Bawahan "+nama+"} ");
            k.ShowData();
        }
        Karyawan.space.setLength(Karyawan.space.length()-3);
    }
    
    
}
