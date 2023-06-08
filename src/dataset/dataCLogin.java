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
public class dataCLogin {
    private ArrayList<String> nama;
    private ArrayList<String> password;
    
    public dataCLogin(){
        nama = new ArrayList<String>();
        password = new ArrayList<String>();
    };
    
    public void insertNama(String isi){
        this.nama.add(isi);
    }
    
    public ArrayList<String> getRecordNama(){
        return this.nama;
    }
    
    //
    
    public void insertPassword(String isi){
        this.password.add(isi);
    }
    
    public ArrayList<String> getRecordPassword(){
        return this.password;
    }
}
