/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.ControlConversor;

/**
 *
 * @author edisonarango
 */
public interface InterfazVista {
    
    static final String PESOSADOLARES = "Pesos a dolares";
    static final String DOLARESAPESOS = "Dolares a pesos";
    static final String PESOSAEUROS = "Pesos a euros";
    static final String EUROSAPESOS = "Euros a pesos";
    
    void setControl(ControlConversor c);
    
    void arrancar();
    
    double getCantidad();
    
    void escribeCambio(String s);
    
    void escribirValorDolar(double valor);
    
    void escribirValorEuro(double valor);
    
    
}
