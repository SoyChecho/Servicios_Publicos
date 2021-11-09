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
public class Servicio_Energia {
    int unidad_Energia = 6200;
    int estrato;
    int consumo;
    double impuesto = 0.01;
    
    
    Scanner teclado = new Scanner(System.in);
    
    public void leer_energia(){
        
        System.out.println("Estrato del Inmueble");
        estrato = teclado.nextInt();
        
        System.out.println("Consumo del Inmueble");
        consumo = teclado.nextInt();
        
        System.out.println("El consumo fue: "+consumo);
        System.out.println("Valor Unidad: "+unidad_Energia);
        System.out.println("Estrato del inmueble: "+estrato);
        double valor_Inicial = consumo * unidad_Energia;
        System.out.println("Costo total: "+valor_Inicial);
        
        if(estrato == 1 || estrato == 2){
            double valor_Descuento = valor_Inicial * -0.5;
            System.out.println("Descuento o sobrecosto: "+valor_Descuento);
            double valor_impuesto = valor_Inicial * impuesto;
            System.out.println("Impuesto por infraestructura: "+valor_impuesto);
            double valor_sinimpuesto = valor_Inicial + valor_Descuento;
            double valor_factura = valor_sinimpuesto + valor_impuesto;
            System.out.println("TOTAL A PAGAR: "+valor_factura);
        }
        if(estrato == 3 || estrato == 4){
            double valor_Descuento = valor_Inicial * -0.1;
            System.out.println("Descuento o sobrecosto: "+valor_Descuento);
            double valor_impuesto = valor_Inicial * impuesto;
            System.out.println("Impuesto por infraestructura: "+valor_impuesto);
            double valor_sinimpuesto = valor_Inicial + valor_Descuento;
            double valor_factura = valor_sinimpuesto + valor_impuesto;
            System.out.println("TOTAL A PAGAR: "+valor_factura);
        }
        if(estrato == 5 || estrato == 6){
            double valor_Descuento = valor_Inicial * 0.25;
            System.out.println("Descuento o sobrecosto: "+valor_Descuento);
            double valor_impuesto = valor_Inicial * impuesto;
            System.out.println("Impuesto por infraestructura: "+valor_impuesto);
            double valor_sinimpuesto = valor_Inicial + valor_Descuento;
            double valor_factura = valor_sinimpuesto + valor_impuesto;
            System.out.println("TOTAL A PAGAR: "+valor_factura);
        }
    }
     
}
