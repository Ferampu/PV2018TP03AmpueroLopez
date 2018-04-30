/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal01;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Punto1 {
    private int a;

    public Punto1() {
    }
    int[] ar=new int[10];
    public void cargar(){
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Ingrese un numero: ");
            setA(scan.nextInt());
            ar[i]=getA();
        }
    }
    public int mostrarMayor(){
        int max=ar[0];
        for(int i=0;i<10;i++){
            if(max<ar[i]){
                max=ar[i];
            }
        }
        return max;
    }
    public int mostrarMenor(){
        int min=ar[0];
        for(int i=0;i<10;i++){
            if(min>ar[i]){
                min=ar[i];
            }
        }
        return min;
    }
    public int calcularProm(){
        int suma=0;
        int prom;
        for(int i=0;i<10;i++){
            suma+=ar[i];
        }
        prom=suma/10;
        return prom;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }
}
