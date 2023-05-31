/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenyewaanKamarHotel;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class kamar {
    public int kode;
    public String tipe;
    public String kapasitas;
    public String fasilitas;
    public String status;
    public Double hargaweekday;
    public Double hargaweekend;
    String labelweekday;
    String labelweekend;
    String labelkamar;
    
    public kamar(){} //constructor
    
    public kamar(int kd_kamar){
        setKodeKamar(kd_kamar);
        //setKapasitas(kapasitas);
     }
        
    public void setKodeKamar(int kode){
        this.labelkamar="\n\n---- KAMAR ----";
        if (kode==1){
            this.tipe="\nTipe Kamar    : Luxury";
            this.kapasitas="\nKapasitas     : 2 Orang";
            this.fasilitas="\nFasilitas     : - View Laut"
                          +"\n             - Private Beach";
            this.status="\nStatus        : Tersedia";
            this.labelweekday="\nHarga Weekday : ";
            this.hargaweekday=1000000.00;
            this.labelweekend="\nHarga Weekend : ";
            this.hargaweekend=1500000.00;
            
        } else if (kode==2) {
            this.tipe="\nTipe Kamar    : Executive";
            this.kapasitas="\nKapasitas     : 4 Orang";
            this.fasilitas="\nFasilitas     : - Private Beach";
            this.status="\nStatus        : Penuh";
            this.labelweekday="\nHarga Weekday : ";
            this.hargaweekday=800000.00;
            this.labelweekend="\nHarga Weekend : ";
            this.hargaweekend=1000000.00;
        } else {
            this.tipe="Kode Kamar Belum Diisi";
        }
    }
        
    public String getKodeKamar(){
        return this.labelkamar+ tipe + kapasitas + fasilitas + status + labelweekday + hargaweekday + labelweekday + hargaweekend;
    }
}