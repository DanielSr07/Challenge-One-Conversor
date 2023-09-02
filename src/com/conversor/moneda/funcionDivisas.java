package com.conversor.moneda;

import javax.swing.JOptionPane;

public class funcionDivisas {
	String Tipo[] = {"Pesos MXN a Divisas", "Divisas a Pesos MXN"};
	String PesosxDivisas[] = {"MXN a USD", "MXN a EUR", "MXN a GBP", "MXN a JPY", "MXN a KRW"};
	String DivisasxPesos[] = {"USD a MXN", "EUR a MXN", "GBP a MXN", "JPY a MXN", "KRW a MXN"};
	String opcion;

	Conversion pesos = new Conversion();
	
	public void ConvertirMonedas(double num) {
		
		String tipo = (JOptionPane.showInputDialog(null, "Elija eltipo de conversion a realziar", "Divisas", JOptionPane.PLAIN_MESSAGE, null, Tipo, "Seleccion")).toString();
		if(tipo == "Pesos MXN a Divisas") {
			opcion = (JOptionPane.showInputDialog(null, "Elija eltipo de conversion a realziar", "Divisas", JOptionPane.PLAIN_MESSAGE, null, PesosxDivisas, "Seleccion")).toString();
		}else {
			opcion = (JOptionPane.showInputDialog(null, "Elija eltipo de conversion a realziar", "Divisas", JOptionPane.PLAIN_MESSAGE, null, DivisasxPesos, "Seleccion")).toString();
		}
		
		switch (opcion) {
		case "MXN a USD":
			pesos.ConversorPesoDolar(num);
			break;
		case "MXN a EUR":
			pesos.ConversorPesoEuro(num);
			break;
		case "MXN a GBP":
			pesos.ConversorPesoLibra(num);
			break;
		case "MXN a JPY":
			pesos.ConversorPesoYen(num);
			break;
		case "MXN a KRW":
			pesos.ConversorPesoWon(num);
			break;
		case "USD a MXN":
			pesos.ConversorDolarPeso(num);
			break;
		case "EUR a MXN":
			pesos.ConversorEuroPeso(num);
			break;
		case "GBP a MXN":
			pesos.ConversorLibraPeso(num);
			break;
		case "JPY a MXN":
			pesos.ConversorYenPeso(num);
			break;
		case "KRW a MXN":
			pesos.ConversorWonPeso(num);
			break;
		}
			
	}
	
}
