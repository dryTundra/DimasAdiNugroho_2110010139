/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dimasadinugroho_2110010139;

import PenyewaanKamarHotel.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class DimasAdiNugroho_2110010139 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        tamu tamu = new tamu();
        tamu.setTamu(2);
        System.out.println(tamu.getTamu());
        
        kamar pemesanan = new kamar();
        pemesanan.setKodeKamar(2);
        System.out.println(pemesanan.getKodeKamar());
        
        lunas lunas = new lunas();
        lunas.setLunas();
        System.out.println(lunas.getLunas());
        
        detail_pesan detail = new detail_pesan();
        detail.setDetailPesan();
        System.out.println("\n\n---- DETAIL PELUNASAN ----\n" + detail.getDetailPesan());
        
        karyawan Karyawan = new karyawan();
        Karyawan.setKaryawan(1);
        System.out.println(Karyawan.getKaryawan());
    }
}
