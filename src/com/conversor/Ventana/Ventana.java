package com.conversor.Ventana;

import javax.swing.JOptionPane;

import com.conversor.moneda.funcionDivisas;
import com.conversor.temperatura.funcionTemperaturas;

public class Ventana {

	public static void main(String[] args) {
		Object tipo[] = {"Divisas", "Temperaturas"};
		boolean activo = true;
		
		funcionDivisas monedas = new funcionDivisas();
		funcionTemperaturas grados = new funcionTemperaturas();
		
		while (activo) {
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion", null, JOptionPane.QUESTION_MESSAGE, null, tipo, "Seleccion")).toString();
			
			switch (opciones) {
			case "Divisas":
				String valor = JOptionPane.showInputDialog("Ingrese el monto a convertir:");
				if (Validar(valor)) {
					double num = Double.parseDouble(valor);
					monedas.ConvertirMonedas(num);
					
					int res = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion");
					if(JOptionPane.OK_OPTION == res) {
						System.out.println("Acepta");
					}else {
						activo = false;
						JOptionPane.showMessageDialog(null, "Programa terminado");
						}
				}else {
					JOptionPane.showMessageDialog(null, "Valor incorrecto, debe ingresar un numero");
				}
				break;
				
			case "Temperaturas":
				valor = JOptionPane.showInputDialog("Ingrese la temperatura a convertir:");
				if (Validar(valor)) {
					double num = Double.parseDouble(valor);
					grados.ConvertirTemperaturas(num);
					
					int res = 0;
					res = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion");
					if((res == 0) && ((Validar(valor)) == false)) {
						System.out.println("Acepta");
					}else {
						activo = false;
						JOptionPane.showMessageDialog(null, "Hasta pronto");
						}
				}else {
					JOptionPane.showMessageDialog(null, "Valor incorrecto, debe ingresar un numero");
				}
				break;
			
			default:
				break;
			}
			
		}
		
	}

	private static boolean Validar(String valor) {
		try {
			double num = Double.parseDouble(valor);
			if((num < 0) || num > 0) {
				return true;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return false;
		}
		return false;
	}
	
}
