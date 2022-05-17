package rpl;

/**
 *
 * @author Tasyifa
 */
public class TesKaryawan {
    public static void main(String[] args) {
        Karyawan syifa = new Karyawan();

            syifa.setNip(2010);
            syifa.setNama_pegawai("Riko");
            syifa.setAlamat("Karawang");
            syifa.setNo_telp(02674123);
            syifa.setKode_bagian(12);



System.out.println("NIP     : " + syifa.getNip());
System.out.println("Nama Pegawai : " + syifa.getNama_pegawai()); 
System.out.println("Alamat: " + syifa.getAlamat());  
System.out.println("No Telepon: " + syifa.getNo_telp());  
System.out.println("Kode Bagian: " + syifa.getKode_bagian());  


    }
}

