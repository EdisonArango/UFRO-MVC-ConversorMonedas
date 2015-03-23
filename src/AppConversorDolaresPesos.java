/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.ConversorDolaresPesos;
import View.*;
import Controller.ControlConversor;
/**
 *
 * @author edisonarango
 */
public class AppConversorDolaresPesos {
    
    
    public static void main(String[] args) {
        ConversorDolaresPesos modelo =  new ConversorDolaresPesos();
        
        InterfazVista vista = new VentanaConversor();
//        InterfazVista vista = new ConsolaConversor();
        
        ControlConversor control = new ControlConversor(vista,modelo);
        
        vista.setControl(control);
        vista.arrancar();
    }
}
