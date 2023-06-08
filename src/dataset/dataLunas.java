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
    //tgl
    private ArrayList<Double> total;
    private ArrayList<Double> ubay;
    private ArrayList<Double> ukem;
    
    public dataLunas(){
        nolunas = new ArrayList<String>();
        //tgl
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
    
    //tgl
    
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
