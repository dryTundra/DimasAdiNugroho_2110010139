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
public class dataDetail_Pesan {
    private ArrayList<String> nopes;
    private ArrayList<String> kode;
    private ArrayList<Double> hargaKamar;
    
    public dataDetail_Pesan(){
        nopes = new ArrayList<String>();
        kode = new ArrayList<String>();
        hargaKamar = new ArrayList<Double>();
    };
    
    public void insertNoPes(String isi){
        this.nopes.add(isi);
    }
    
    public ArrayList<String> getRecordNoPes(){
        return this.nopes;
    }
    
    //
    
    public void insertKdKamar(String isi){
        this.kode.add(isi);
    }
    
    public ArrayList<String> getRecordKdKamar(){
        return this.kode;
    }
    
    //
    
    public void insertHargaKmr(double isi){
        this.hargaKamar.add(isi);
    }
    
    public ArrayList<Double> getRecordHargaKmr(){
        return this.hargaKamar;
    }
}
