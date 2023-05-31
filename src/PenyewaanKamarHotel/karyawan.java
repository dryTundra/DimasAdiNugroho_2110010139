/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenyewaanKamarHotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class karyawan {
    
    public String nama;
    public String nik;
    public String tempat;
    public LocalDate tgllahir;
    public String agama;
    public String jnskel;
    public String jabatan;
    public String norek;
    public String alamat;
    public String telp;
    public String password;
    String labelkaryawan;
    
    public karyawan(){}
    
    public karyawan(String nm_karyawan, String nik, String tempat, LocalDate tgl_lahir, String agama, String jns_kelamin, String jabatan, String no_rek, String alamat, String telp, String pass) {
       this.nik = nik;
       this.nama = nm_karyawan;
       this.tempat = tempat;
       this.tgllahir = tgllahir;
       this.agama = agama;
       this.jnskel = jns_kelamin;
       this.jabatan = jabatan;
       this.norek = no_rek;
       this.alamat = alamat;
       this.telp = telp;
       this.password = pass;
    }
    
    public void setKaryawan(int kd_karyawan) {
        this.labelkaryawan="\n\n---- KARYAWAN ----";
        if (kd_karyawan==1){
            this.nik="12342536375";
            this.nama="Heru";
            this.tempat="Bandung";
            this.tgllahir=tgllahir;
            this.agama="Islam";
            this.jnskel="Laki-laki";
            this.jabatan="Cleaning Service";
            this.norek="3782392";
            this.alamat="Jalan Nangka";
            this.telp="086745794679";
            this.password="Heru123";
        }else if (kd_karyawan==2){
            this.nik="463569095845";
            this.nama="Bambang";
            this.tempat="Sukabumi";
            this.tgllahir=tgllahir;
            this.agama="Islam";
            this.jnskel="Laki-laki";
            this.jabatan="Manager";
            this.norek="23875972";
            this.alamat="Jalan Timun";
            this.telp="085678394826";
            this.password="Bambang123";
        }
    }
    
    public String getKaryawan() {
        return
        this.labelkaryawan + 
        "\nNIK            : " + nik +
        "\nNama           : " + nama +
        "\nTempat         : " + tempat +
        "\nTanggal Lahir  : " + tgllahir +
        "\nAgama          : " + agama +
        "\nJenis Kelamin  : " + jnskel +
        "\nJabatan        : " + jabatan +
        "\nNomor Rekening : " + norek +
        "\nAlamat         : " + alamat +
        "\nTelepon        : " + telp +
        "\nPassword       : " + password;
    }
    
    public void getNik(){
        String nik = this.nik;
    }
}
