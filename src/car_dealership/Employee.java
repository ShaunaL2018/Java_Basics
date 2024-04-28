package car_dealership;

import java.util.Objects;

public class Employee {
	
	private String name;
	private int employeeId;
	private String employeeType;
	private String employeeShift;
	private String employerContactNumber;
	
	public Employee(String name, int employeeId, String employeeType, String employeeShift,
			String employerContactNumber) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.employeeType = employeeType;
		this.employeeShift = employeeShift;
		this.employerContactNumber = employerContactNumber;
	}
	
	public void handleCustomer(Customer customer, Vehicle vehicle, boolean finance) {
		if(finance) {
		  runCreditHistory(customer, vehicle.getCarCost());
		}else if (vehicle.getCarCost() <= customer.getCashOnHand()) {
		    processTransaction(customer, vehicle);
		}else { 
			haltTransaction(customer);
		}		
	}
	
	public void runCreditHistory(Customer customer, Double vehicleCost) {
		
		if (customer.isCreditFavorable()) {
			System.out.println("Credit Result:" + customer.getCustomerName()
			+ "is elibility to purchase Vehicle on Credit for the amount of: " 
			+ vehicleCost);
		}
	}
	
	public void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println(customer.getCustomerName() + " is able to purchase the " + vehicle.getCarColor() + " " + 
			vehicle.getCarModel() + " " + vehicle.getCarType() + " with cash.");
	}
	
	public void haltTransaction(Customer customer) {
		System.out.println(customer.getCustomerName() + " does not have enough cash on hand to purchase the vehicle.");
		System.out.println(customer.getCustomerName() + " to return to dealership with enough money to purchase the vehicle.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	public String getEmployeeShift() {
		return employeeShift;
	}
	public void setEmployeeShift(String employeeShift) {
		this.employeeShift = employeeShift;
	}
	public String getEmployerContactNumber() {
		return employerContactNumber;
	}
	public void setEmployerContactNumber(String employerContactNumber) {
		this.employerContactNumber = employerContactNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeShift, employeeType, employerContactNumber, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(employeeShift, other.employeeShift)
				&& Objects.equals(employeeType, other.employeeType)
				&& Objects.equals(employerContactNumber, other.employerContactNumber)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", employeeType=" + employeeType
				+ ", employeeShift=" + employeeShift + ", employerContactNumber=" + employerContactNumber + "]";
	}
	
	

}
