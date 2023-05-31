/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenyewaanKamarHotel;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class pesan {
    public String nopesan;
    public Date tanggal;
    public Date tglin;
    public Date tglout;
    public int lama;
    public String nmchas;
    public Double tobay;
    public Double dp;
    public Double sisabayar;
    String labelpesan;
    String labeltglin;
    String labeltglout;
    String labellama;
    String labelnmchas;
    String labeltobay;
    String labeldp;
    String labelsisabayar;
    
    public pesan(){}
    
    public void setPesan(String nopesan){
        this.labelpesan="\n\n---- PEMESANAN ----";
        if (nopesan=="1"){
            this.labeltglin="\nTanggal Check-In  : ";
            this.tglin = tglin;
            this.labeltglout="\nTanggal Check-Out : ";
            this.tglout = tglout;
            this.labellama="\nLama Menginap : ";
            this.lama=1;
            this.labelnmchas="\nNama Chas : ";
            this.nmchas="";
            this.labeltobay="\nTotal Bayar : ";
            this.tobay=1.0;
            this.labeldp="\nDown Payment : ";
            this.dp=1.0;
            this.labelsisabayar="\nSisa Bayar : ";
            this.sisabayar=1.0;
        }else if (nopesan=="2"){
            this.labeltglin="\nTanggal Check-In  : ";
            this.tglin = tglin;
            this.labeltglout="\nTanggal Check-Out : ";
            this.tglout = tglout;
            this.labellama="\nLama Menginap : ";
            this.lama=1;
            this.labelnmchas="\nNama Chas : ";
            this.nmchas="";
            this.labeltobay="\nTotal Bayar : ";
            this.tobay=1.0;
            this.labeldp="\nDown Payment : ";
            this.dp=1.0;
            this.labelsisabayar="\nSisa Bayar : ";
            this.sisabayar=1.0;
        }else{
            
        }
    }
    
    public String getPesan(){
        return this.lama + nmchas + tobay + dp + sisabayar;
    }
    
    public void getNoKtp(){
        tamu tamu = new tamu();
        System.out.println(tamu.noKTP);
    }
    
    public void getNik(){
        karyawan karyawan = new karyawan();
        System.out.println(karyawan.nik);
    }
}