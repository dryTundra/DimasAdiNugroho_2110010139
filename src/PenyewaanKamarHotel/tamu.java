/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenyewaanKamarHotel;

/**
 *
 * @author Asus
 */
public class tamu {
    public String noKTP;
    public String alamatTamu;
    public String namaTamu;
    public String noTelp;
    String labeltamu;
    
    public tamu(){}
    
    public void setTamu(int no_pel){
        this.labeltamu="\n ---- TAMU ----";
        if (no_pel == 1){
            this.noKTP="2345678";
            this.namaTamu="Dimas";
            this.alamatTamu="Desa Angasana";
            this.noTelp="082148524506";
        }else if (no_pel==2){
            this.noKTP="2345678";
            this.namaTamu="Wilda";
            this.alamatTamu="Desa Manggis";
            this.noTelp="082176983476";
        } else {
            this.namaTamu="\nNama Tamu Tidak Ditemukan";
        }
    }
    
    public String getTamu(){
        return 
        this.labeltamu +
             "\nNo KTP     : " + noKTP + 
             "\nNama Tamu  : " + namaTamu + 
             "\nAlamat     : " + alamatTamu + 
             "\nNo Telepon : " + noTelp;
    }
}