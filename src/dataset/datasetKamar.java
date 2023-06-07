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
public class datasetKamar {
    private ArrayList <Integer> kode;
    private ArrayList <String> tipe;
    private ArrayList <String> kapasitas;
    private ArrayList <String> fasilitas;
    private ArrayList <String> status;
    private ArrayList <Double> hargaWeekday;
    private ArrayList <Double> hargaWeekend;

    
    public datasetKamar(){
      kode = new ArrayList<Integer>();
      tipe = new ArrayList<String>();
      kapasitas = new ArrayList<String>();
      fasilitas = new ArrayList<String>();
      status = new ArrayList<String>();
      hargaWeekday = new ArrayList<Double>();
      hargaWeekend = new ArrayList<Double>();
    };
    
    public void insertKode(int isi){
        this.kode.add(isi);
    }
    
    public ArrayList <Integer> getRecordKode(){
        return this.kode;
    }
    
    //
    
    public void insertTipe(String isi){
        this.tipe.add(isi);
    }
    
    public ArrayList <String> getRecordTipe(){
        return this.tipe;
    }
    
    //
    
    public void insertKapasitas(String isi){
        this.kapasitas.add(isi);
    }
    
    public ArrayList <String> getRecordKapasitas(){
        return this.kapasitas;
    }
    
    //
    
    public void insertFasilitas(String isi){
        this.fasilitas.add(isi);
    }
    
    public ArrayList <String> getRecordFasilitas(){
        return this.fasilitas;
    }
    
    //
    
    public void insertStatus(String isi){
        this.status.add(isi);
    }
    
    public ArrayList <String> getRecordStatus(){
        return this.status;
    }
    
    //
    
    public void insertHargaWeekday(double isi){
        this.hargaWeekday.add(isi);
    }
    
    public ArrayList <Double> getRecordHargaWeekday(){
        return this.hargaWeekday;
    }
    
    //
    
    public void insertHargaWeekend(double isi){
        this.hargaWeekend.add(isi);
    }
    
    public ArrayList <Double> getRecordHargaWeekend(){
        return this.hargaWeekend;
    }
    
}
