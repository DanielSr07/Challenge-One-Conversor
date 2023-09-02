package com.conversor.temperatura;

import javax.swing.JOptionPane;

public class convTemperatura {

	public void ConversorCelsiusxFahrenheit(Double valor){
		double GdoFahren = (valor * 9 / 5 ) + 32;
		GdoFahren = (double) Math.round(GdoFahren *100d)/100.0;
		JOptionPane.showMessageDialog(null, "La cantidad de grados Fahrenheit es: $" + GdoFahren);
	}
	
	public void ConversorFahrenheitxCelsius(Double valor){
		double GdoCel = (valor - 32) * 5 / 9;
		GdoCel = (double) Math.round(GdoCel *100d)/100.0;
		JOptionPane.showMessageDialog(null, "La cantidad de grados Celsius es: $" + GdoCel);
	}
	
	public void ConversorCelsiusxKelvin(Double valor){
		double GdoCel = valor + 273.15;
		GdoCel = (double) Math.round(GdoCel *100d)/100.0;
		JOptionPane.showMessageDialog(null, "La cantidad de grados Kelvin es: $" + GdoCel);
	}
	
	public void ConversorKelvinxCelsius(Double valor){
		double GdoCel = valor - 273.15;
		GdoCel = (double) Math.round(GdoCel *100d)/100.0;
		JOptionPane.showMessageDialog(null, "La cantidad de grados Celsius es: $" + GdoCel);
	}
	
	public void ConversorFahrenheitxkelvin(Double valor){
		double GdoCel = (valor - 32) * 5 / 9 + 273.15;
		GdoCel = (double) Math.round(GdoCel *100d)/100.0;
		JOptionPane.showMessageDialog(null, "La cantidad de grados Kelvin es: $" + GdoCel);
	}
	
	public void ConversorKelvinxFahrenheit(Double valor){
		double GdoCel = (valor - 273.15) * 9 / 5 + 32;
		GdoCel = (double) Math.round(GdoCel *100d)/100.0;
		JOptionPane.showMessageDialog(null, "La cantidad de grados Fahrenheit es: $" + GdoCel);
	}
}
