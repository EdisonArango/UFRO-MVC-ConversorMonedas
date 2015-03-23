/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author edisonarango
 */
public class ConversorEurosPesos extends ConversorMonedas{

    public ConversorEurosPesos() {
        super(700);
    }
    
    public double eurosAPesos(double cantidad){
        return monedaAPesos(cantidad);
    }
    
    public double pesosAEuros (double cantidad){
        return pesosAMoneda(cantidad);
    }
    
}
