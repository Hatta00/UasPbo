/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sarjana;

/**
 *
 * @author ACER
 */
public class Sarjana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StrataSatu stratasatu = new StrataSatu("Atta","1234578", "Teknik Informatika");
        System.out.println("Informasi Mahasiswa Sarjana S1:");
        stratasatu.viewMahasiswa();
        System.out.println();

        DiplomaTiga diplomatiga = new DiplomaTiga("Dedi Irawan", "67891011", "Kebidanan");
        System.out.println("Informasi Mahasiswa Sarjana D3:");
        diplomatiga.viewMahasiswa();
    
    }
}
