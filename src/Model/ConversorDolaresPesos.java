/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import net.webservicex.*;

/**
 *
 * @author edisonarango
 */
public class ConversorDolaresPesos extends ConversorMonedas{

    public ConversorDolaresPesos() {
    }
    
    public double dolaresAPesos(double cantidad){
        return monedaAPesos(cantidad);
    }
    
    public double pesosADolares (double cantidad){
        return pesosAMoneda(cantidad);
    }
    
    public void actualizarValorCambio (){
        double valorCambio = new CurrencyConvertor().getCurrencyConvertorSoap().conversionRate(Currency.USD, Currency.CLP);
        super.setCambio(valorCambio);
    }
    
}
