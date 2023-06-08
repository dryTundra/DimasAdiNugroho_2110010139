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
public class dataInchas {
    private ArrayList<String> nopes;
    private ArrayList<String> nmchas;
    private ArrayList<Double> hargachas;
    private ArrayList<Integer> pax;
    private ArrayList<Double> totalchas;

    public dataInchas(){
        nopes = new ArrayList<String>();
        nmchas = new ArrayList<String>();
        hargachas = new ArrayList<Double>();
        pax = new ArrayList<Integer>();
        totalchas = new ArrayList<Double>();
    };
    
    public void insertNoPes(String isi){
        this.nopes.add(isi);
    }
    
    public ArrayList <String> getRecordNoPes(){
        return this.nopes;
    }
    
    //
    
    public void insertNmChas(String isi){
        this.nmchas.add(isi);
    }
    
    public ArrayList <String> getRecordNmChas(){
        return this.nmchas;
    }
    
    //
    
    public void insertHargaChas(double isi){
        this.hargachas.add(isi);
    }
    
    public ArrayList <Double> getRecordHargaChas(){
        return this.hargachas;
    }
    
    //
    
    public void insertPax(int isi){
        this.pax.add(isi);
    }
    
    public ArrayList <Integer> getRecordPax(){
        return this.pax;
    }
    
    //
    
    public void insertTotalChas(double isi){
        this.totalchas.add(isi);
    }
    
    public ArrayList <Double> getRecordTotalChas(){
        return this.totalchas;
    }
}
