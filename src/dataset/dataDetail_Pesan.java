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
    
    public dataDetail_Pesan(){
        nopes = new ArrayList<String>();
    };
    
    public void insertNoPes(String isi){
        this.nopes.add(isi);
    }
    
    public ArrayList<String> getRecordNoPes(){
        return this.nopes;
    }
}
