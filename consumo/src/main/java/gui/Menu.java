package gui;

import cars.Car;

public class Menu {

	private Car car;
	
	public void principalMenu() {
		System.out.println("==> Menu principal <==");
		System.out.println("----------------------");
		System.out.println();
		if(car != null) {
			System.out.println("Coche seleccionado: " + car.getModelo());
		}
		System.out.println("1. Coche: ");
		System.out.println("2. Consumo: ");
	}
	
	public void consumptionGui() {
		System.out.println("==> Menu principal <==");
		System.out.println("----------------------");
		System.out.println();
		System.out.println("1. Añadir consumo:");
		System.out.println("2. Monstrar Consumos: ");
	}
}
