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
        
        if (e.getActionCommand().equals(vista.ADOLARES)) {
            vista.escribeCambio(cantidad + " pesos son: "+modelo.pesosADolares(cantidad)+" dólares");   
        }
        else if (e.getActionCommand().equals(vista.APESOS)) {
            vista.escribeCambio(cantidad + " dólares son: "+modelo.dolaresAPesos(cantidad)+" pesos");
        }
        else{
            vista.escribeCambio("ERROR!");
        }
    }
    
    
    
}
