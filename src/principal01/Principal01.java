/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal01;

/**
 *
 * @author acer
 */
public class Principal01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        iniciarPrograma();
        // TODO code application logic here
    }
    public static void iniciarPrograma(){
        Punto1 unArreglo=new Punto1();
        unArreglo.cargar();
        System.out.println("El numero mayor del arreglo es: "+unArreglo.mostrarMayor());
        System.out.println("El numero menor del arreglo es: "+unArreglo.mostrarMenor());
        System.out.println("El promedio es: "+unArreglo.calcularProm());
    }
    
}
