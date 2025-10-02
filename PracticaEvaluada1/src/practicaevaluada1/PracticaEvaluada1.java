/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada1;

/* Librerías*/

import javax.swing.JOptionPane;

/**
 *  Autor: Julián Francisco Quesada Víquez
 *  Fecha de creación: 1/10/2025
 *  Descripción: Práctica Evaluada #1
 */
public class PracticaEvaluada1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Una empresa necesita determinar el monto total que debe pagar a la Caja
           Costarricense del Seguro Social (CCSS), al gobierno por el impuesto al salario y a la
           asociación de la empresa. Para esto, se requiere un programa que calcule dicho
           monto basado en el salario para un empleado especifico. El programa debe solicitar
           el nombre de la persona y el apellido por separado, el salario individual y calcular el
           monto total a pagar aplicando los siguientes rubros:
            
           - Seguro de Enfermedad y Maternidad (SEM) CCSS al 9.25% del salario.
           - Invalidez, Vejez y Muerte (IVM) CCSS al 5.08% del salario.
           - Impuesto al salario (Gobierno):
                
                * 0 % Debajo de ₡922.000,00
                * 10%: Sobre el exceso de ₡922.000, hasta ₡1.352.000
                * 15%: Sobre el exceso de ₡1.352.000, hasta ₡2.373.000
                * 20%: Sobre el exceso de ₡2.373.000, Superior
        
            - Además del monto con deducciones se le debe de calcular 2.5% para la asociación
            (Asociación de la empresa).
        */
        
        // Atributos del usuario
        
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
        
        // Declaración de Impuestos
        
        double impuestoSEM = salario * 0.0925;
        double impuestoIVM = salario * 0.0508;
        double impuestoAsociacion = salario * 0.025; 
        double impuestoGobierno = 0;
        
        // Declaración condicional
        
        if(salario < 922.000){
            impuestoGobierno = (salario - 0) * 0;;
        } else if(salario > 922000 && salario < 1352000){
            impuestoGobierno = (salario - 922000) * 0.10;
        } else if(salario > 1352000 && salario < 2373000){
            impuestoGobierno = (salario - 1352000) * 0.15;
        } else if(salario > 2373000){
            impuestoGobierno = (salario - 2373000) * 0.20;
        }
        
        // Cálculo del salario final del usuario
        salario = salario - (impuestoSEM + impuestoIVM + impuestoAsociacion + impuestoGobierno);
        
        // Resultado final
        
        JOptionPane.showMessageDialog(null, "El impuesto SEM es de: " + impuestoSEM + "." + "\n" +
                                            "El impuesto IVM es de:" + impuestoIVM + "." + "\n" +
                                            "El impuesto del Gobierno por el salario es de: " + impuestoGobierno + "." + "\n" +
                                            "El impuesto de Asociación de Empleados es de: " + impuestoAsociacion + "." + "\n" +
                                            nombre + " " + apellido + " su salario final es de: " + salario + ".");
        
        
        
        
        
    }
    
}
