/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sarjana;

/**
 *
 * @author ACER
 */
public class StrataSatu extends Mahasiswa {
     private String programStudi;

    public StrataSatu (String nama, String nim, String programStudi) {
        super(nama, nim);
        this.programStudi = programStudi;
    }
    
    public void viewStrataSatu() {
        System.out.println("Program Studi: " + programStudi);
    }
}
