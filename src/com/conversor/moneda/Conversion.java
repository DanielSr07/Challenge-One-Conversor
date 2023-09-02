package com.conversor.moneda;

import javax.swing.JOptionPane;

public class Conversion {

	public void ConversorPesoDolar(Double valor){
		double montoDolar = valor / 17.0917;
		montoDolar = (double) Math.round(montoDolar *100d)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en dolares es: $" + montoDolar);
	}
	
	public void ConversorDolarPeso(Double valor){
		double montoPeso = valor * 17.0917;
		montoPeso = (double) Math.round(montoPeso *100d)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en pesos es: $" + montoPeso);
	}
	
	public void ConversorPesoEuro(Double valor){
		double montoEuro = valor / 18.4216;
		montoEuro = (double) Math.round(montoEuro *100d)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en Euros es: $" + montoEuro);
	}
	
	public void ConversorEuroPeso(Double valor){
		double montoPeso = valor * 18.4216;
		montoPeso = (double) Math.round(montoPeso *100d)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en pesos es: $" + montoPeso);
	}
	
	public void ConversorPesoLibra(Double valor){
		double montoLibra = valor / 21.5133;
		montoLibra = (double) Math.round(montoLibra *100d)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en Libras es: $" + montoLibra);
	}
	
	public void ConversorLibraPeso(Double valor){
		double montoPeso= valor * 21.5133;
		montoPeso = (double) Math.round(montoPeso *100d)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en pesos es: $" + montoPeso);
	}
	
	public void ConversorPesoYen(Double valor){
		double montoYen = valor / 0.1169;
		montoYen = (double) Math.round(montoYen *100d)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en Yenes es: $" + montoYen);
	}
	
	public void ConversorYenPeso(Double valor){
		double montoPeso= valor * 0.1169;
		montoPeso = (double) Math.round(montoPeso *100d)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en pesos es: $" + montoPeso);
	}
	
	public void ConversorPesoWon(Double valor){
		double montoWon = valor / 0.013;
		montoWon = (double) Math.round(montoWon *100d)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en Wones es: $" + montoWon);
	}
	
	public void ConversorWonPeso(Double valor){
		double montoPeso = valor * 0.013;
		montoPeso = (double) Math.round(montoPeso *100d)/100.0;
		JOptionPane.showMessageDialog(null, "El monto en pesos es: $" + montoPeso);
	}
	
}
