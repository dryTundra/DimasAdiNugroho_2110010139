/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenyewaanKamarHotel;

/**
 *
 * @author Asus
 */
public class detail_pesan {
    public static int counter = 1;
    public String nopes;
    
    public detail_pesan(){}
    
    public void setDetailPesan(){
        this.nopes="No Pesan : " + counter;
        counter++;
    }
    
    public String getDetailPesan(){
        return this.nopes;
    }
    
    public void getkode(){
        kamar kamar = new kamar();
        System.out.println(kamar.kode);
    }
}
