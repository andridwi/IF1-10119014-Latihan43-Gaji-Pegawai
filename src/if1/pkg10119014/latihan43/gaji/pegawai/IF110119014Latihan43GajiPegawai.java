/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan43.gaji.pegawai;

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * kelas: IF-1
 * NIM  : 10119014
 */
public class IF110119014Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Gajipegawai gajipegawai = new Gajipegawai();
    
    gajipegawai.setUangTunjangan(250000);
    int uangTunjangan = gajipegawai.getUangTunjangan();
    
    gajipegawai.setUangTransport(300000);
    int uangTransport = gajipegawai.getUangTransport();
    
    gajipegawai.setGajiPokok(4500000);
    int gajiPokok = gajipegawai.getGajiPokok();
    
    int jml = gajipegawai.totalGaji(uangTunjangan, uangTransport, gajiPokok);
    gajipegawai.setTotalGaji(jml);
    int totalGaji = gajipegawai.getTotalGaji();
    
    gajipegawai.tampilData("Rizki Adam Kurniam", "Jalan Semar dlm 4 NO 77/66", uangTunjangan, uangTransport, gajiPokok, totalGaji);
    }
    
}
