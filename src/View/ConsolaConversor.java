package View;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import Controller.ControlConversor;

public class ConsolaConversor implements InterfazVista{

	private ControlConversor control;
	
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	private int leeOpcion() {
		String s = null;
		try {
			s = in.readLine();
			return Integer.parseInt(s);
		}
		catch (Exception e) {
			operacionIncorrecta();
			return 0;
		}
	}
	
	private double leeCantidad() {
		String s = null;
		try {
			s = in.readLine();
			return Double.parseDouble(s);
		}
		catch(Exception e) {
			System.out.println("Error en formato del número, tiene que ser 00.00: ");
			return leeCantidad();
		}
	}
	
	private void solicitaOperacion() {
		System.out.println("\t\t******* MENU *********");
		System.out.println("\t\t===============");
		System.out.println("[1] Convertir dólares a pesos");
		System.out.println("[2] Convertir pesos a dólares");
		System.out.println("[3] Salir");
	}
	
	private void procesaNuevaOperacion() {
		int operacion;
		solicitaOperacion();
		operacion = leeOpcion();
		
		if ( operacion == 1 ) control.actionPerformed( new ActionEvent(this, operacion, ADOLARES) );
		
		if ( operacion == 2 ) control.actionPerformed( new ActionEvent(this, operacion, APESOS) );
		
		if ( operacion == 3 ) {
			System.out.println("Hasta luego!");
			System.exit(0);
		}
		operacionIncorrecta();
	}
	
	private void operacionIncorrecta() {
		// TODO Auto-generated method stub
		System.out.print("Operación incorrecta. ");
		procesaNuevaOperacion();
	}
	
	@Override
	public void setControl(ControlConversor c) {
		// TODO Auto-generated method stub
		control = c;
	}

	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		procesaNuevaOperacion();
	}

	@Override
	public double getCantidad() {
		// TODO Auto-generated method stub
		System.out.println("Cantidad a convertir (formato 99.99) : ");
		return leeCantidad();
	}

	@Override
	public void escribeCambio(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		procesaNuevaOperacion();
	}

}