/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import View.InterfazVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author edisonarango
 */
public class ControlConversor implements ActionListener{
    
    private InterfazVista vista;
    private ConversorDolaresPesos conversorDolaresPesos;
    private ConversorEurosPesos conversorEurosPesos;

    public ControlConversor(InterfazVista vista, ConversorDolaresPesos conversorDolaresPesos, ConversorEurosPesos conversorEurosPesos) {
        this.vista = vista;
        this.conversorDolaresPesos = conversorDolaresPesos;
        this.conversorEurosPesos = conversorEurosPesos;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double cantidad = vista.getCantidad();
        
        switch (e.getActionCommand()) {
            case InterfazVista.PESOSADOLARES:
                vista.escribeCambio(cantidad + " pesos son: "+conversorDolaresPesos.pesosADolares(cantidad)+" dólares");
                break;
            case InterfazVista.DOLARESAPESOS:
                vista.escribeCambio(cantidad + " dólares son: "+conversorDolaresPesos.dolaresAPesos(cantidad)+" pesos");
                break;
            case InterfazVista.PESOSAEUROS:
                vista.escribeCambio(cantidad + " pesos son: "+conversorEurosPesos.pesosAEuros(cantidad)+" euros");
                break;
            case InterfazVista.EUROSAPESOS:
                vista.escribeCambio(cantidad + " euros son: "+conversorEurosPesos.eurosAPesos(cantidad)+" pesos");
                break;
            default:
                vista.escribeCambio("ERROR!");
                break;
        }
    }
    
    
    
}
