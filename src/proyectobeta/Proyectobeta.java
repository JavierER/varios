/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobeta;

import java.util.Scanner;

/**
 *
 * @author jestevezrial
 */
public class Proyectobeta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n,i,t;
        Scanner obx= new Scanner(System.in);
        System.out.println("nominal:");
        n= obx.nextFloat();
        System.out.println("interes anual:");
        i= obx.nextFloat();
        i=i/(12*100);
        System.out.println("años:");
        t= obx.nextFloat();
        t=t*12;
        System.out.println("Total a pagar:"+ (n*Math.pow((1+i),t)*i)/(Math.pow((1+i),t)-1));
        
    }
    
}
