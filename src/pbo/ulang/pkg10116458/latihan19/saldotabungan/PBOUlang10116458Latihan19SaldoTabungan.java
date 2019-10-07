/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan19.saldotabungan;

/**
 *
 * @author
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bulan = 6;
        int i = 1;
        int saldoTabungan = 2500000;
        double bunga = 0.15;
        double saldoBulanan;
        
        while (i <= bulan) {
            saldoBulanan = bunga * saldoTabungan;        
            saldoTabungan = (int) (saldoTabungan + saldoBulanan);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + 
                    (int)saldoTabungan);
            i++;
        }
    }
    
}
