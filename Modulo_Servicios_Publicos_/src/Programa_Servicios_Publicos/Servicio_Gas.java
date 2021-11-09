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
public class Servicio_Gas {
    double unidad_Gas = 5234;
    int estrato;
    int consumo;
    double impuestoo = 0.01;
    
    Scanner teclado = new Scanner(System.in);
    
    public void leer_gas(){
        System.out.println("Estrato del inmueble: ");
        int estratoo = teclado.nextInt();
                    
        System.out.println("Consumo del inmueble: ");
        int consumoo = teclado.nextInt();
        
                            
        System.out.println("El consumo fue: "+consumoo);
        System.out.println("Valor Unidad: "+unidad_Gas);
        System.out.println("Estrato del inmueble: "+estratoo);
        double valor_Inicialo = consumoo * unidad_Gas;
        System.out.println("Costo total: "+valor_Inicialo);
        if(estratoo == 1 || estratoo == 2){
        double valor_Descuento = valor_Inicialo * -0.5;
        System.out.println("Descuento o sobrecosto: "+valor_Descuento);
        double valor_impuesto = valor_Inicialo * impuestoo;
        System.out.println("Impuesto por infraestructura: "+valor_impuesto);
        double valor_sinimpuesto = valor_Inicialo + valor_Descuento;
        double valor_factura = valor_sinimpuesto + valor_impuesto;
        System.out.println("TOTAL A PAGAR: "+valor_factura);
        }
        if(estratoo == 3 || estratoo == 4){
        double valor_Descuento = valor_Inicialo * -0.1;
        System.out.println("Descuento o sobrecosto: "+valor_Descuento);
        double valor_impuesto = valor_Inicialo * impuestoo;
        System.out.println("Impuesto por infraestructura: "+valor_impuesto);
        double valor_sinimpuesto = valor_Inicialo + valor_Descuento;
        double valor_factura = valor_sinimpuesto + valor_impuesto;
        System.out.println("TOTAL A PAGAR: "+valor_factura);
        }
        if(estratoo == 5 || estratoo == 6){
        double valor_Descuento = valor_Inicialo * 0.25;
        System.out.println("Descuento o sobrecosto: "+valor_Descuento);
        double valor_impuesto = valor_Inicialo * impuestoo;
        System.out.println("Impuesto por infraestructura: "+valor_impuesto);
        double valor_sinimpuesto = valor_Inicialo + valor_Descuento;
        double valor_factura = valor_sinimpuesto + valor_impuesto;
        System.out.println("TOTAL A PAGAR: "+valor_factura);
        }
    }
}
