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
public class ConversorMonedas {
    
    private double cambio;

    public ConversorMonedas(double cambio) {
        this.cambio = cambio;
    }
    
    public double monedaAPesos(double cantidad){ 
        return cantidad*cambio;
    }
    
    public double pesosAMoneda(double cantidad){
        return cantidad/cambio;
    }
}
