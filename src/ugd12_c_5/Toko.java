/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ugd12_c_5;

import java.util.ArrayList;

/**
 * Nama : Reynold Kunarto 
 * NPM : 210711015
 * 
 * Nama : Febiola Ika Putri Wibowo
 * NPM : 210711023
 */
/**
 *
 * @author VICTUS
 */
public class Toko {
    private String namaToko;
    private String alamat;
    private Manager penanggungJawab;
    private ArrayList<Karyawan>karyawan;
    private double danaToko;

    public Toko(String namaToko, String alamat, double danaToko) {
        this.namaToko = namaToko;
        this.alamat = alamat;
        this.danaToko = danaToko;
        this.karyawan = new ArrayList<Karyawan>();
    }

    public Manager getPenanggungJawab() {
        return penanggungJawab;
    }

    public void setPenanggungJawab(Manager penanggungJawab) {
        if(!penanggungJawab.getJenis().equalsIgnoreCase("utama")){
            throw new RuntimeException("Jabatan Manager kurang tinggi!");
        }
        this.penanggungJawab = penanggungJawab;
    }
    public void tampilDaftarKaryawan(){
        System.out.println("\n\nToko "+namaToko);
        System.out.println("Alamat "+alamat);
        System.out.println("Jumlah Dana Toko: "+danaToko);
        penanggungJawab.ShowData();
    }
    
    public void RegisterObserver(Karyawan k){
        karyawan.add(k);
    }
    public void RemoveObserver(Karyawan k){
        karyawan.remove(k);
    }
    public void NotifyObserver(double jumlah){
        for(Karyawan k : karyawan){
            k.Update(jumlah);
        }
    }
    public void PenjualanBarang(double harga, int jmlBarang){
        double tempDanaToko = harga*jmlBarang;
        System.out.println("\t\tDana Toko Bertambah: "+tempDanaToko);
        danaToko+=tempDanaToko;
        NotifyObserver(tempDanaToko / 20);
    }
    public void ShowTotalTunjangan(){
        System.out.println("\n\nTotal Tunjangan: "+penanggungJawab.GetTunjangan());
    }
}
