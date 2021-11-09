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
public class Servicio_Acueducto {
    int unidad_Agua = 9256;
    int estrato;
    int consumo;
    double impuesto0 = 0.01;
    
    Scanner teclado = new Scanner(System.in);
    
    public void leer_acueducto(){
        System.out.println("Estrato del inmueble: ");
        int estrato0 = teclado.nextInt();
                    
                    
        System.out.println("Consumo del inmueble: ");
        int consumo0 = teclado.nextInt();
        
        System.out.println("El consumo fue: "+consumo0);
        System.out.println("Valor Unidad: "+unidad_Agua);
        System.out.println("Estrato del inmueble: "+estrato0);
        double valor_Inicial0 = consumo0 * unidad_Agua;
        System.out.println("Costo total: "+valor_Inicial0);
        if(estrato0 == 1 || estrato0 == 2){
        double valor_Descuento = valor_Inicial0 * -0.5;
        System.out.println("Descuento o sobrecosto: "+valor_Descuento);
        double valor_impuesto = valor_Inicial0 * impuesto0;
        System.out.println("Impuesto por infraestructura: "+valor_impuesto);
        double valor_sinimpuesto = valor_Inicial0 + valor_Descuento;
        double valor_factura = valor_sinimpuesto + valor_impuesto;
        System.out.println("TOTAL A PAGAR: "+valor_factura);
        }
        if(estrato0 == 3 || estrato0 == 4){
        double valor_Descuento = valor_Inicial0 * -0.1;
        System.out.println("Descuento o sobrecosto: "+valor_Descuento);
        double valor_impuesto = valor_Inicial0 * impuesto0;
        System.out.println("Impuesto por infraestructura: "+valor_impuesto);
        double valor_sinimpuesto = valor_Inicial0 + valor_Descuento;
        double valor_factura = valor_sinimpuesto + valor_impuesto;
        System.out.println("TOTAL A PAGAR: "+valor_factura);
        }
        if(estrato0 == 5 || estrato0 == 6){
        double valor_Descuento = valor_Inicial0 * 0.25;
        System.out.println("Descuento o sobrecosto: "+valor_Descuento);
        double valor_impuesto = valor_Inicial0 * impuesto0;
        System.out.println("Impuesto por infraestructura: "+valor_impuesto);
        double valor_sinimpuesto = valor_Inicial0 + valor_Descuento;
        double valor_factura = valor_sinimpuesto + valor_impuesto;
        System.out.println("TOTAL A PAGAR: "+valor_factura);
        }
    }
    
}
