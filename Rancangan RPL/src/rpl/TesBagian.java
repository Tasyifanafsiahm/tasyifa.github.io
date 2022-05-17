
package rpl;

/**
 *
 * @author Tasyifa
 */
public class TesBagian {
    public static void main(String[] args) {
        Bagian input = new Bagian();
        
            input.setKode_bagian(12);
            input.setNama_bagian("Riko");
            
            System.out.println("Kode Bagian    : " + input.getKode_bagian());
            System.out.println("Nama Bagian : " + input.getNama_bagian()); 
    }
}
