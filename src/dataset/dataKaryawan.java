/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class dataKaryawan {
    private ArrayList<String> nama;
    private ArrayList<String> nik;
    private ArrayList<String> tmplahir;
    private ArrayList<String> tgllahir;
    private ArrayList<String> agama;
    private ArrayList<String> jnskel;
    private ArrayList<String> jabatan;
    private ArrayList<String> norek;
    private ArrayList<String> alamat;
    private ArrayList<String> telp;
    private ArrayList<String> password;
    
    public dataKaryawan(){
        nama = new ArrayList<String>();
        nik = new ArrayList<String>();
        tmplahir = new ArrayList<String>();
        tgllahir = new ArrayList<String>();
        agama = new ArrayList<String>();
        jnskel = new ArrayList<String>();
        jabatan = new ArrayList<String>();
        norek = new ArrayList<String>();
        alamat = new ArrayList<String>();
        telp = new ArrayList<String>();
        password = new ArrayList<String>();
    };
    
    public void insertNama(String isi){
        this.nama.add(isi);
    }
    
    public ArrayList <String> getRecordNama(){
        return this.nama;
    }
    
    //
    
    public void insertNIK(String isi){
        this.nik.add(isi);
    }
    
    public ArrayList <String> getRecordNIK(){
        return this.nik;
    }
    
    //
    
    public void insertTmpLahir(String isi){
        this.tmplahir.add(isi);
    }
    
    public ArrayList <String> getRecordTmpLahir(){
        return this.tmplahir;
    }
    
    //
    
    public void insertTglLahir(String isi){
        this.tgllahir.add(isi);
    }
    
    public ArrayList <String> getRecordTglLahir(){
        return this.tgllahir;
    }
    
    //
    
    public void insertAgama(String isi){
        this.agama.add(isi);
    }
    
    public ArrayList <String> getRecordAgama(){
        return this.agama;
    }
    
    //
    
    public void insertJnsKel(String isi){
        this.jnskel.add(isi);
    }
    
    public ArrayList <String> getRecordJnsKel(){
        return this.jnskel;
    }
    
    //
    
    public void insertJabatan(String isi){
        this.jabatan.add(isi);
    }
    
    public ArrayList <String> getRecordJabatan(){
        return this.jabatan;
    }
    
    //
    
    public void insertNoRek(String isi){
        this.norek.add(isi);
    }
    
    public ArrayList <String> getRecordNoRek(){
        return this.norek;
    }
    
    //
    
    public void insertAlamat(String isi){
        this.alamat.add(isi);
    }
    
    public ArrayList <String> getRecordAlamat(){
        return this.alamat;
    }
    
    //
    
    public void insertTelp(String isi){
        this.telp.add(isi);
    }
    
    public ArrayList <String> getRecordTelp(){
        return this.telp;
    }
    
    //
    
    public void insertPassword(String isi){
        this.password.add(isi);
    }
    
    public ArrayList <String> getRecordPassword(){
        return this.password;
    }
}
