
package rpl;

/**
 *
 * @author Tasyifa
 */
public class TesAbsen {
    public static void main(String[] args) {
        Absen syifa = new Absen();

            syifa.setNip(2010);
            syifa.setTanggal(28032022);
            syifa.setJam_absen(7);
            syifa.setJam_pulang(17);


System.out.println("NIP     : " + syifa.getNip());
System.out.println("Tanggal : " + syifa.getTanggal()); 
System.out.println("Jam Absen: " + syifa.getJam_absen());  
System.out.println("Jam Pulang: " + syifa.getJam_pulang());  

    }
}
