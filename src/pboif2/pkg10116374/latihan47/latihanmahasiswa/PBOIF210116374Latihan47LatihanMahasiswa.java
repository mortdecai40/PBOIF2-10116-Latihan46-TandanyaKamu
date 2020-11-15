package pboif2.pkg10116374.latihan47.latihanmahasiswa;

/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melakukan proses penilaian pada mahasiswa
 *
 */

public class PBOIF210116374Latihan47LatihanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         NilaiAkhir na1,na2,na3;
        
        na1 = new NilaiAkhir(75, 45, 34);
        na1.tampilNilai();
        na2 = new NilaiAkhir(60, 80, 75);
        na2.tampilNilai();
        na3 = new NilaiAkhir(30, 80, 40);
        na3.tampilNilai();
    }
    
}
