/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan52.siapakamu;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk mengetahui profesi 
 * berdasarkan NIP dan NIM.
 */
public class PBO210117064Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dsn = new Dosen ();
        Mahasiswa mhs = new Mahasiswa ();
        
        System.out.println("NIP DOSEN : 41227829930");
        dsn.siapaKamu();
        dsn.mengajarApa();
        
        System.out.println("\n"+"NIM MAHASISWA : 10117064");
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
