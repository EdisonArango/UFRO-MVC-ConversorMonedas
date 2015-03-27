/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.*;
import View.*;
import Controller.*;
/**
 *
 * @author edisonarango
 */
public class AppConversorDolaresPesos {
    
    
    public static void main(String[] args) {
//        ConversorDolaresPesos conversorDolaresPesos =  new ConversorDolaresPesos();
//        ConversorEurosPesos conversorEurosPesos =  new ConversorEurosPesos();
        ConversorMonedas conversor = new ConversorMonedas();
        
        InterfazVista vista = new VentanaConversor();
//        InterfazVista vista = new ConsolaConversor();
        
        ControlConversor control = new ControlConversor(vista,conversor);
        
        vista.setControl(control);
        vista.arrancar();
    }
}
