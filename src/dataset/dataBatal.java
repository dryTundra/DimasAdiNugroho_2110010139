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
    
    public dataBatal(){
        nobatal = new ArrayList<String>();
    };
    
    public void insertNoBatal(String isi){
        this.nobatal.add(isi);
    }
    
    public ArrayList<String> getRecordNoBatal(){
        return this.nobatal;
    }
}
