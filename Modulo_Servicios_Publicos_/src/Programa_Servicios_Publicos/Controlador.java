/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa_Servicios_Publicos;

import java.util.Scanner;

/**
 *
 * @author Sergio Castro
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4){
            
            System.out.println("PAGO DE SERVICIOS PUBLICOS");
            System.out.println("Seleccione el servicio publico:");
            System.out.println("1.Energia");
            System.out.println("2.Acueducto");
            System.out.println("3.Gas Natural");
            System.out.println("4.Salir");
            System.out.println("Opcion:");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    Servicio_Energia energia = new Servicio_Energia();
                    System.out.println("Pago de Servicio de Energia");
                    energia.leer_energia();

                    break;
                case 2: 
                    Servicio_Acueducto acueducto = new Servicio_Acueducto();
                    System.out.println("Pago de Servicio de Acueducto");
                    acueducto.leer_acueducto();

                    break;
                case 3:
                    Servicio_Gas gas = new Servicio_Gas();
                    System.out.println("Pago de Servicio de Gas Natural");
                    gas.leer_gas();

                    break;
                case 4: 
                    System.out.println("Hasta pronto");
                    break;
            }
        }
        
        
      
        
        
    }
    
}
