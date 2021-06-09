/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk2;

/**
 *
 * @author MOKLET-2
 */
public class Siswa {
    public String Nama = new String();
    public String Alamat = new String();
    Siswa(String Nama, String Alamat ){
        this.Nama = Nama;
        this.Alamat = Alamat;
        
        }
    public void print(){
        System.out.println("Nama: "+ this.Nama);
        System.out.println("Alamat: "+ this.Alamat);
        
    }
}
