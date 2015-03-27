/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;

/**
 *
 * @author edisonarango
 */
public class ConversorMonedas {
    
    private double cambioActual;
    
    public static double cambioUSD;
    public static double cambioEUR;
    private CurrencyConvertor conversorWS;

    public ConversorMonedas() {
        conversorWS = new CurrencyConvertor();
        cambioUSD = conversorWS.getCurrencyConvertorSoap().conversionRate(Currency.USD, Currency.CLP);
        cambioEUR = conversorWS.getCurrencyConvertorSoap().conversionRate(Currency.EUR, Currency.CLP);
    }
    
    public double monedaAPesos(double cantidad){ 
        return cantidad*cambioActual;
    }
    
    public double pesosAMoneda(double cantidad){
        return cantidad/cambioActual;
    }
    
    public void actualizarValorCambio (double cambio){
        cambioActual = cambio;
    }

    
}
