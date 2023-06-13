/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class dataLunas {
    private ArrayList<String> nolunas;
    private ArrayList<String> nopesan;
    private ArrayList<String> nik;
    private ArrayList<String> tgl;
    private ArrayList<Double> total;
    private ArrayList<Double> ubay;
    private ArrayList<Double> ukem;
    
    public dataLunas(){
        nolunas = new ArrayList<String>();
        nopesan = new ArrayList<String>();
        nik = new ArrayList<String>();
        tgl = new ArrayList<String>();
        total = new ArrayList<Double>();
        ubay = new ArrayList<Double>();
        ukem = new ArrayList<Double>();
    };
    
    public void insertNoLunas(String isi){
        this.nolunas.add(isi);
    }
    
    public ArrayList <String> getRecordNoLunas(){
        return this.nolunas;
    }
    
    //
    
    public void insertNoPes(String isi){
        this.nopesan.add(isi);
    }
    
    public ArrayList <String> getRecordNoPes(){
        return this.nopesan;
    }
    
    //
    
    public void insertNIK(String isi){
        this.nik.add(isi);
    }
    
    public ArrayList <String> getRecordNIK(){
        return this.nik;
    }
    
    //
    
    public void insertTgl(String isi){
        this.tgl.add(isi);
    }
    
    public ArrayList <String> getRecordTgl(){
        return this.tgl;
    }
    
    //
    
    public void insertTotal(double isi){
        this.total.add(isi);
    }
    
    public ArrayList <Double> getRecordTotal(){
        return this.total;
    }
    
    //
    
    public void insertUBay(double isi){
        this.ubay.add(isi);
    }
    
    public ArrayList <Double> getRecordUBay(){
        return this.ubay;
    }
    
    //
    
    public void insertUKem(double isi){
        this.ukem.add(isi);
    }
    
    public ArrayList <Double> getRecordUKem(){
        return this.ukem;
    }
}
