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
public class ConversorDolaresPesos extends ConversorMonedas{

    public ConversorDolaresPesos() {
        super(651.45D);
    }
    
    public double dolaresAPesos(double cantidad){
        return dolaresAMonedas(cantidad);
    }
    
    public double pesosADolares (double cantidad){
        return monedaADolares(cantidad);
    }
    
}
