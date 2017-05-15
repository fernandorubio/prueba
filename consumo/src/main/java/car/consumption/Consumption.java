package car.consumption;

import java.time.LocalDate;

public class Consumption {

	private LocalDate date;
	private int liters;
	private int km;
	private float kmLiterCar;
	private float avgConsumption;
	private float avgConsumptioncar;
	private int avgSpeed;
	private String fuel;
	private String observation;
	
	public Consumption(int liters, int km, LocalDate date) {
		this.date = date;
		this.liters = liters;
		this.km = km;
		
		calculateAvgConsumption();
	}

	/**
	 * Calculate and set the Consumption in liters per 100 Km.
	 */
	private void calculateAvgConsumption() {
		avgConsumption = (liters/km)*100;
	}


	/**
	 * Getters & Setters.
	 */
	
	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public float getKmLiterCar() {
		return kmLiterCar;
	}

	public void setKmLiterCar(float kmLiterCar) {
		this.kmLiterCar = kmLiterCar;
	}

	public float getAvgConsumptioncar() {
		return avgConsumptioncar;
	}

	public void setAvgConsumptioncar(float avgConsumptioncar) {
		this.avgConsumptioncar = avgConsumptioncar;
	}

	public int getAvgSpeed() {
		return avgSpeed;
	}

	public void setAvgSpeed(int avgSpeed) {
		this.avgSpeed = avgSpeed;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public LocalDate getDate() {
		return date;
	}

	public int getLiters() {
		return liters;
	}

	public float getAvgConsumption() {
		return avgConsumption;
	}
	
}
