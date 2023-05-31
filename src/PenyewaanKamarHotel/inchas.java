/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenyewaanKamarHotel;

/**
 *
 * @author Asus
 */
public class inchas {
    public String nopes;
    public String nmchas;
    public Double hargachas;
    public int pax;
    public Double totalchas;
    
    public inchas(){}
    
    public void setInchas(){
        this.nopes="";
        this.nmchas="";
        totalchas = hargachas + pax;
    }
    
    public String getInchas(){
        return this.nopes + nmchas + totalchas;
    }
}
