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
public class dataBatal {
    private ArrayList<String> nobatal;
    private ArrayList<String> nopesan;
    private ArrayList<String> nik;
    private ArrayList<String> tglBatal;
    private ArrayList<String> CekIn;
    private ArrayList<String> CekOut;
    
    public dataBatal(){
        nobatal = new ArrayList<String>();
        nopesan = new ArrayList<String>();
        nik = new ArrayList<String>();
        tglBatal = new ArrayList<String>();
        CekIn = new ArrayList<String>();
        CekOut = new ArrayList<String>();
    };
    
    public void insertNoBatal(String isi){
        this.nobatal.add(isi);
    }
    
    public ArrayList<String> getRecordNoBatal(){
        return this.nobatal;
    }
    
    //
    
    public void insertNoPesan(String isi){
        this.nopesan.add(isi);
    }
    
    public ArrayList<String> getRecordNoPesan(){
        return this.nopesan;
    }
    
    //
    
    public void insertNIK(String isi){
        this.nik.add(isi);
    }
    
    public ArrayList<String> getRecordNIK(){
        return this.nik;
    }
    
    //
    
    public void insertTglBatal(String isi){
        this.tglBatal.add(isi);
    }
    
    public ArrayList<String> getRecordTglBatal(){
        return this.tglBatal;
    }
    
    //
    
    public void insertCekIn(String isi){
        this.CekIn.add(isi);
    }
    
    public ArrayList<String> getRecordCekIn(){
        return this.CekIn;
    }
    
    public void insertCekOut(String isi){
        this.CekOut.add(isi);
    }
    
    public ArrayList<String> getRecordCekOut(){
        return this.CekOut;
    }   
}
