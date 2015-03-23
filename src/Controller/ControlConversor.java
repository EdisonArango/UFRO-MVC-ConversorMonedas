/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.ConversorDolaresPesos;
import View.InterfazVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author edisonarango
 */
public class ControlConversor implements ActionListener{
    
    private InterfazVista vista;
    private ConversorDolaresPesos modelo;

    public ControlConversor(InterfazVista vista, ConversorDolaresPesos modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double cantidad = vista.getCantidad();
        
        switch (e.getActionCommand()) {
            case InterfazVista.PESOSADOLARES:
                vista.escribeCambio(cantidad + " pesos son: "+modelo.pesosADolares(cantidad)+" dólares");
                break;
            case InterfazVista.DOLARESAPESOS:
                vista.escribeCambio(cantidad + " dólares son: "+modelo.dolaresAPesos(cantidad)+" pesos");
                break;
            case InterfazVista.PESOSAEUROS:
                vista.escribeCambio(cantidad + " pesos son: "+modelo.pesosADolares(cantidad)+" euros");
                break;
            case InterfazVista.EUROSAPESOS:
                vista.escribeCambio(cantidad + " euros son: "+modelo.dolaresAPesos(cantidad)+" pesos");
                break;
            default:
                vista.escribeCambio("ERROR!");
                break;
        }
    }
    
    
    
}
