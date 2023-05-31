/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenyewaanKamarHotel;

/**
 *
 * @author Asus
 */
public class batal {
    public String nobatal;
    
    public batal(){}
    
    public void setBatal(){
       this.nobatal="";  
    }
    
    public String getBatal(){
       return this.nobatal;
    }
    
    public void getNik(){        
        karyawan karyawan = new karyawan();
        System.out.println(karyawan.nik);
    }

    public void getnopes(){
        detail_pesan detail_pesan = new detail_pesan();
        System.out.println(detail_pesan.nopes);
    }
    
    public void getnoktp(){
        tamu tamu = new tamu();
        System.out.println(tamu.noKTP);
    }
}