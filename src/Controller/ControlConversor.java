/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author edisonarango
 */
public class ControlConversor implements ActionListener{
    
    private InterfazVista vista;
    private ConversorMonedas conversor;

    public ControlConversor(InterfazVista vista, ConversorMonedas conversor) {
        this.vista = vista;
        this.conversor = conversor;
        this.vista.escribirValorDolar(ConversorMonedas.cambioUSD);
        this.vista.escribirValorEuro(ConversorMonedas.cambioEUR);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double cantidad = vista.getCantidad();
        
        switch (e.getActionCommand()) {
            case InterfazVista.PESOSADOLARES:
                conversor.actualizarValorCambio(ConversorMonedas.cambioUSD);
                vista.escribeCambio(cantidad + " pesos son: "+conversor.pesosAMoneda(cantidad)+" dólares");
                break;
            case InterfazVista.DOLARESAPESOS:
                conversor.actualizarValorCambio(ConversorMonedas.cambioUSD);
                vista.escribeCambio(cantidad + " dólares son: "+conversor.monedaAPesos(cantidad)+" pesos");
                break;
            case InterfazVista.PESOSAEUROS:
                conversor.actualizarValorCambio(ConversorMonedas.cambioEUR);
                vista.escribeCambio(cantidad + " pesos son: "+conversor.pesosAMoneda(cantidad)+" euros");
                break;
            case InterfazVista.EUROSAPESOS:
                conversor.actualizarValorCambio(ConversorMonedas.cambioEUR);
                vista.escribeCambio(cantidad + " euros son: "+conversor.monedaAPesos(cantidad)+" pesos");
                break;
            default:
                vista.escribeCambio("ERROR!");
                break;
        }
    }
    
    
    
}
