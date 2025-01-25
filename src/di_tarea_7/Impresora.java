/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di_tarea_7;

/**
 *
 * @author amjpa
 */
public class Impresora {
    //Capacidad del tóner en páginas
    private int capacidadToner;  
    //Cantidad de páginas restantes
    private int cantidadToner;   

    //Constructor
    public Impresora(int capacidadToner) {
        
        if (capacidadToner < 0) {
            //Si la capacidad es negativa, se establece en 100
            this.capacidadToner = 100;  
            
            //Cantidad inicial coincide con la capacidad
            this.cantidadToner = 100;   
        } else {
            this.capacidadToner = capacidadToner;
            this.cantidadToner = capacidadToner;
        }
    }

    //Getter y setter
    public int getCapacidadToner() {
        return capacidadToner;
    }
    
    public int getCantidadToner() {
        return cantidadToner;
    }

    
    //Método para imprimir un número de páginas
    public void imprime(int cant) {
        if (cant <= cantidadToner) {
            
            for (int i = 1; i <= cant; i++) {
                System.out.println("Pagina " + i + " impresa."); 
            }
            
            //Se resta la cantidad de tóner utilizada
            cantidadToner -= cant;  
            System.out.println("Se han impreso " + cant + " paginas.");
            System.out.println("Paginas restantes: " + cantidadToner);
        } else {
            System.out.println("No hay suficiente toner para imprimir esa cantidad de paginas.");
            System.out.println("Paginas restantes: " + cantidadToner);
        }
    }

    //Método que muestra el estado del tóner en porcentaje
    public void mostrarEstadoToner() {
        double resultado = (double) cantidadToner / capacidadToner;
        double estado = resultado;
        System.out.println("El estado del toner es: " + (estado * 100) + "%");
    }

}
