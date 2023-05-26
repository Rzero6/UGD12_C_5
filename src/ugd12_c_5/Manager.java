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

    public Manager(String nama, double tunjangan, Toko toko, String jenis) {
        super(nama, tunjangan, toko);
        this.jenis = jenis;
        this.bawahan = new ArrayList<Karyawan>();
        this.jumlahBawahan = 0;
    }
    
    public void RekrutBawahan(Karyawan k){
        bawahan.add(k);
        this.jumlahBawahan++;
    }

    @Override
    public void Update(double jumlah) {
        double bonus = 0;
        if(jenis.equalsIgnoreCase("Utama")){
            bonus = (jumlah+100000) + (jumlahBawahan*20000);
        }else if (jenis.equalsIgnoreCase("Bagian")){
            bonus = (jumlah+40000) + (jumlahBawahan*10000);
        }
        
        System.out.println("\t--- Tunjangan "+nama+" bertambah sebanyak "+bonus);
        tunjangan+=bonus;
    }

    @Override
    public void ShowData() {
        System.out.println(IComposite.space+"[Manager] "+nama+" - Total Tunjangan : "+tunjangan);
        IComposite.space.append("   ");
        for(Karyawan k : bawahan){
            System.out.print(IComposite.space+"{Bawahan "+nama+"}");
            k.ShowData();
        }
        IComposite.space.setLength(IComposite.space.length()-3);
    }
}
