/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package di_tarea_7;

/**
 *
 * @author amjpa
 */
public class DI_Tarea_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
    Impresora impresora = new Impresora(-1);
    impresora.imprime(0);
    impresora.mostrarEstadoToner();
    impresora.pruebaTest();
    
    }
    
}
