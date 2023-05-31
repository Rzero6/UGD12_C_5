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
public abstract class Karyawan {
    protected String nama;
    protected double tunjangan;
    protected Toko toko;
    
    public Karyawan(String nama, double tunjangan, Toko toko) {
        this.nama = nama;
        this.tunjangan = tunjangan;
        this.toko = toko;
        this.toko.RegisterObserver(this);
    }
    
    public abstract void Update(double jumlah);
    public abstract void ShowData();
    public abstract double GetTunjangan();
    
}
