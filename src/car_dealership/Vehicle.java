package car_dealership;

import java.util.Objects;

public class Vehicle {

	private String carModel;
	private String carType;
	private int carYear;
	private String carColor;
	private Double carCost;
	
	public Vehicle(String carModel, String carType, int carYear, String carColor, Double carCost) {
		super();
		this.carModel = carModel;
		this.carType = carType;
		this.carYear = carYear;
		this.carColor = carColor;
		this.carCost = carCost;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getCarYear() {
		return carYear;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public Double getCarCost() {
		return carCost;
	}
	public void setCarCost(Double carCost) {
		this.carCost = carCost;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [carModel=" + carModel + ", carType=" + carType + ", carYear=" + carYear + ", carColor="
				+ carColor + ", carCost=" + carCost + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(carColor, carCost, carModel, carType, carYear);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(carColor, other.carColor) && Objects.equals(carCost, other.carCost)
				&& Objects.equals(carModel, other.carModel) && Objects.equals(carType, other.carType)
				&& carYear == other.carYear;
	}
	
	
	
}
