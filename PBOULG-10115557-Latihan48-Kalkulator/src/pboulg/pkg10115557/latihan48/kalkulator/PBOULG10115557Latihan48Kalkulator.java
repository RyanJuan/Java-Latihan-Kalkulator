/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan48.kalkulator;

/**
 *
 * @author RyanJuan
 * NAMA              : RAYAN
 * KELAS             : PBOULG
 * NIM               : 10115557
 * Deskripsi Program : Membuat Program kalkulator
 */
public class PBOULG10115557Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    kalkulator kal = new kalkulator();
        kal.setValue1(7);
        kal.setValue2(5);
        System.out.println("VALUE 1 = "+kal.getValue1());
        System.out.println("VALUE 2 = "+kal.getValue2());
        kal.setNameProject();
      kal.setNoteProject("this project shown you how to manage method in java");
        System.out.println("Result add is = "+kal.add(kal.getValue1(),
                kal.getValue2()));
        System.out.println("Result minus is = "+kal.minus
        (kal.getValue1(),kal.getValue2()));
        System.out.println("Result Mutiple is = "+kal.multiplication
        (kal.getValue1(),kal.getValue2()));
        System.out.println("Result Division is = "+kal.division(
                kal.getValue1(),kal.getValue2()));
    
    
    }
    
}
