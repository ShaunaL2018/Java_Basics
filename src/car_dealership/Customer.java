package car_dealership;

import java.util.Objects;

public class Customer {
	
	private String customerName;
	private String customerAddress;
	private String customerContactNumber;
	private Double cashOnHand;
	private boolean creditFavorable;
	private boolean finance;
	private boolean carSold;
		
	public Customer(String customerName, String customerAddress, String customerContactNumber, Double cashOnHand,
			boolean finance, boolean carSold, boolean creditFavorable) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerContactNumber = customerContactNumber;
		this.cashOnHand = cashOnHand;
		this.finance = finance;
		this.carSold = carSold;
		this.creditFavorable = creditFavorable;
	}
	
	public boolean purchaseCar (Vehicle vehicle, Employee employee, boolean finance) {
		boolean purchaseCar = false;
		
		if (vehicle !=null && employee !=null) {
			if (finance) {
				System.out.println("Customer financed the vehicle.");
				purchaseCar = true;
			} else {
				System.out.println("Customer purchased the vehicle with cash.");
				purchaseCar = true;
			}
		}
		
		return purchaseCar;
		
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerContactNumber() {
		return customerContactNumber;
	}
	public void setCustomerContactNumber(String customerContactNumber) {
		this.customerContactNumber = customerContactNumber;
	}
	public Double getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(Double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	public boolean isFinance() {
		return finance;
	}
	public void setFinance(boolean finance) {
		this.finance = finance;
	}
	public boolean isCarSold() {
		return carSold;
	}
	public void setCarSold(boolean carSold) {
		this.carSold = carSold;
	}
	public boolean isCreditFavorable() {
		return creditFavorable;
	}

	public void setCreditFavorable(boolean creditFavorable) {
		this.creditFavorable = creditFavorable;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carSold, cashOnHand, creditFavorable, customerAddress, customerContactNumber, customerName,
				finance);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return carSold == other.carSold && Objects.equals(cashOnHand, other.cashOnHand)
				&& creditFavorable == other.creditFavorable && Objects.equals(customerAddress, other.customerAddress)
				&& Objects.equals(customerContactNumber, other.customerContactNumber)
				&& Objects.equals(customerName, other.customerName) && finance == other.finance;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerAddress=" + customerAddress
				+ ", customerContactNumber=" + customerContactNumber + ", cashOnHand=" + cashOnHand
				+ ", creditFavorable=" + creditFavorable + ", finance=" + finance + ", carSold=" + carSold + "]";
	}
	
	

}
