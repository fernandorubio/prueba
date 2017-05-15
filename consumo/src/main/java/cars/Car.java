package cars;

import car.consumption.Consumption;

public class Car {
	
	private String id;
	private String marca;
	private String modelo;
	private int km;
	private int cv;
	private float cc;
	private Consumption consumption;
	
	public Car(String modelo, String marca){
		this.modelo = modelo;
		this.marca = marca;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public float getCc() {
		return cc;
	}

	public void setCc(float cc) {
		this.cc = cc;
	}

	public Consumption getConsumption() {
		return consumption;
	}

	public void setConsumption(Consumption consumption) {
		this.consumption = consumption;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
}
