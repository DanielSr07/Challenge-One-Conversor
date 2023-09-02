package com.conversor.temperatura;

import javax.swing.JOptionPane;


public class funcionTemperaturas {

	String Unidades[] = {"C a F", "F a C", "C a K", "K a C", "F a K", "K a F"};
	String opcion;

	convTemperatura grados = new convTemperatura();
	
	public void ConvertirTemperaturas(double num) {
		opcion = (JOptionPane.showInputDialog(null, "Elija el tipo de conversion a realizar", "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, Unidades, "Seleccion")).toString();
		
		switch (opcion) {
		case "C a F":
			grados.ConversorCelsiusxFahrenheit(num);
			break;
		case "C a K":
			grados.ConversorCelsiusxKelvin(num);
			break;
		case "F a C":
			grados.ConversorFahrenheitxCelsius(num);;
			break;
		case "K a C":
			grados.ConversorKelvinxCelsius(num);
			break;
		case "F a K":
			grados.ConversorFahrenheitxkelvin(num);
			break;
		case "K a F":
			grados.ConversorKelvinxFahrenheit(num);
			break;
		}
			
	}
	
}
