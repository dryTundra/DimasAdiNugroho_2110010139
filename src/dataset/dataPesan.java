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
    private ArrayList<String> nik;
    private ArrayList<String> noKTP;
    private ArrayList<String> tglpesan;
    private ArrayList<String> tglin;
    private ArrayList<String> tglout;
    private ArrayList<Integer> lama;
    private ArrayList<String> nmchas;
    private ArrayList<Double> tobay;
    private ArrayList<Double> dp;
    private ArrayList<Double> sisabayar;
    private ArrayList<String> statusbayar;
    private ArrayList<String> ketpesan;
    
    public dataPesan(){
        nopesan = new ArrayList<String>();
        nik = new ArrayList<String>();
        noKTP = new ArrayList<String>();
        tglpesan = new ArrayList<String>();
        tglin = new ArrayList<String>();
        tglout = new ArrayList<String>();
        lama = new ArrayList<Integer>();
        nmchas = new ArrayList<String>();
        tobay = new ArrayList<Double>();
        dp = new ArrayList<Double>();
        sisabayar = new ArrayList<Double>();
        statusbayar = new ArrayList<String>();
        ketpesan = new ArrayList<String>();
    };
    
    public void insertNoPesan(String isi){
        this.nopesan.add(isi);
    }
    
    public ArrayList <String> getRecordNoPesan(){
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
    
    public void insertNoKTP(String isi){
        this.noKTP.add(isi);
    }
    
    public ArrayList <String> getRecordNoKTP(){
        return this.noKTP;
    }
    
    //
    
    public void insertTglPesan(String isi){
        this.tglpesan.add(isi);
    }
    
    public ArrayList <String> getRecordTglPesan(){
        return this.tglpesan;
    }
    
    //
    
    public void insertTglIn(String isi){
        this.tglin.add(isi);
    }
    
    public ArrayList <String> getRecordTglIn(){
        return this.tglin;
    }
    
    //
    
    public void insertTglOut(String isi){
        this.tglout.add(isi);
    }
    
    public ArrayList <String> getRecordTglOut(){
        return this.tglout;
    }
    
    //
    
    public void insertLama(int isi){
        this.lama.add(isi);
    }
    
    public ArrayList <Integer> getRecordLama(){
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
    
    public void insertStatusBayar(String isi){
        this.statusbayar.add(isi);
    }
    
    public ArrayList <String> getRecordStatusBayar(){
        return this.statusbayar;
    }
    
    //
    
    public void insertKetPesan(String isi){
        this.ketpesan.add(isi);
    }
    
    public ArrayList <String> getRecordKetPesan(){
        return this.ketpesan;
    }
}
