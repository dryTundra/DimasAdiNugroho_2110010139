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
public class dataPesan {
    private ArrayList<String> nopesan;
    //tanggal
    //tglin
    //tglout
    private ArrayList<Integer> lama;
    private ArrayList<String> nmchas;
    private ArrayList<Double> tobay;
    private ArrayList<Double> dp;
    private ArrayList<Double> sisabayar;
    
    public dataPesan(){
        nopesan = new ArrayList<String>();
        //tanggal
        //tglin
        //tglout
        lama = new ArrayList<Integer>();
        nmchas = new ArrayList<String>();
        tobay = new ArrayList<Double>();
        dp = new ArrayList<Double>();
        sisabayar = new ArrayList<Double>();
    };
    
    public void insertNoPesan(String isi){
        this.nopesan.add(isi);
    }
    
    public ArrayList <String> getRecordNoPesan(){
        return this.nopesan;
    }
    
    //
    
    //tanggal
    
    //
    
    //tglin
    
    //
    
    //tglout
    
    //
    
    public void insertLama(int isi){
        this.lama.add(isi);
    }
    
    public ArrayList <Integer> getRecordNip(){
        return this.lama;
    }
    
    //
    
    public void insertNmChas(String isi){
        this.nmchas.add(isi);
    }
    
    public ArrayList <String> getRecordNmChas(){
        return this.nmchas;
    }
    
    // 
    
    public void insertToBay(double isi){
        this.tobay.add(isi);
    }
    
    public ArrayList <Double> getRecordToBay(){
        return this.tobay;
    }
    
    // 
    
    public void insertDP(double isi){
        this.dp.add(isi);
    }
    
    public ArrayList <Double> getRecordDP(){
        return this.dp;
    }
    
    // 
    
    public void insertSisaBayar(double isi){
        this.sisabayar.add(isi);
    }
    
    public ArrayList <Double> getRecordSisaBayar(){
        return this.sisabayar;
    }
}
