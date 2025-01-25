/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package di_tarea_7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amjpa
 */
public class ImpresoraIT {
    
    private Impresora impresoraPositiva;
    private Impresora impresoraNegativa;
    
    
    public ImpresoraIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       impresoraPositiva = new Impresora(200);
       
       // Esto no lanzará excepción, sino que establecerá 100 como capacidad
       impresoraNegativa = new Impresora(-50);  
    }
    
    @After
    public void tearDown() {
    }
    
     // Test para la creación de una impresora con un tóner positivo
    @Test
    public void testConstructorConCapacidadPositiva() {
        System.out.println("testConstructorPositivo");
        assertEquals(200, impresoraPositiva.getCapacidadToner());
        assertEquals(200, impresoraPositiva.getCantidadToner());
    }

    // Test para la creación de una impresora con una capacidad de tóner negativa
    @Test
    public void testConstructorConCapacidadNegativa() {
        System.out.println("testConstructorNegativo");
        assertEquals(100, impresoraNegativa.getCapacidadToner());
        assertEquals(100, impresoraNegativa.getCantidadToner());
    }

    /**
     * Test of getCapacidadToner method, of class Impresora.
     */
    @Test
    public void testGetCapacidadToner() {
        System.out.println("getCapacidadToner");
        int expResult = 200;
        int result = impresoraPositiva.getCapacidadToner();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of getCantidadToner method, of class Impresora.
     */
    @Test
    public void testGetCantidadToner() {
        System.out.println("getCantidadToner");
        int expResult = 200;
        int result = impresoraPositiva.getCantidadToner();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of imprime method, of class Impresora.
     */
    @Test
    public void testImprime() {
        System.out.println("testImprime");
     // Imprimo 50 páginas para ver si resta al total de la cantidad.
        impresoraPositiva.imprime(50);

        // Verifico que la cantidad de tóner haya disminuido correctamente
        assertEquals(150, impresoraPositiva.getCantidadToner());

    }

    /**
     * Test of mostrarEstadoToner method, of class Impresora.
     */
    @Test
    public void testMostrarEstadoToner() {
        System.out.println("mostrarEstadoToner");
      

    }
    
}
