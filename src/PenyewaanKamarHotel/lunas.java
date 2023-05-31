/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenyewaanKamarHotel;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class lunas {
    public static int counter = 1;
    public String nolunas;
    public Date tgl;
    public Double total;
    public Double ubay;
    public Double ukem;
    String labellunas;
    String labeltgl;
    String labeltotal;
    String labelubay;
    String labelukem;
    
    public lunas(){}
    
    
    public void setLunas(){
        this.labellunas="\n\n---- PELUNASAN ----";
        this.nolunas="\nNo          : " + counter;
        counter++;
        this.labeltgl="\nTanggal     : ";
        this.tgl = tgl;
        this.labeltotal="\nTotal Bayar : ";
        this.total=2000000.00;
        this.labelubay="\nUang Bayar  : ";
        this.ubay=500000.0;
        this.labelukem="\nKembali     : ";
        this.ukem=total-ubay;
    }
    
    
    public String getLunas(){
        return this.labellunas + nolunas + labeltgl + tgl + labeltotal + total + labelubay + ubay + labelukem + ukem;
    }
            
    public void getNopes(){
        detail_pesan detail_pesan = new detail_pesan();
        System.out.println(detail_pesan.nopes);
    }
    
    public void getNik(){
        karyawan karyawan = new karyawan();
        System.out.println(karyawan.nik);
    }
    
    public void getKode(){
        kamar kamar = new kamar();
        System.out.println(kamar.kode);
    }
    
    public void getNoKtp(){
        tamu tamu = new tamu();
        System.out.println(tamu.noKTP);
    }
}