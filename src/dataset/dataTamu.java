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
public class dataTamu {
    private ArrayList<String> noKTP;
    private ArrayList<String> alamatTamu;
    private ArrayList<String> namaTamu;
    private ArrayList<String> noTelp;
    
    public dataTamu(){
        noKTP = new ArrayList<String>();
        alamatTamu = new ArrayList<String>();
        namaTamu = new ArrayList<String>();
        noTelp = new ArrayList<String>();
    };
    
    public void insertNoKTP(String isi){
        this.noKTP.add(isi);
    }
    
    public ArrayList <String> getRecordNoKTP(){
        return this.noKTP;
    }
    
    // 
    
    public void insertAlamat(String isi){
        this.alamatTamu.add(isi);
    }
    
    public ArrayList <String> getRecordAlamat(){
        return this.alamatTamu;
    }
    
    // 
    
    public void insertNmTamu(String isi){
        this.namaTamu.add(isi);
    }
    
    public ArrayList <String> getRecordNmTamu(){
        return this.namaTamu;
    }
    
    // 
    
    public void insertNoTelp(String isi){
        this.noTelp.add(isi);
    }
    
    public ArrayList <String> getRecordNoTelp(){
        return this.noTelp;
    }
}
