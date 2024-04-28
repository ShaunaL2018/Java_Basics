package car_dealership;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Dealership {

	public static void main(String[] args) {
			//sale1();
			//sale2();
			carLoop();
	}
	
	public static void sale1() {
		Vehicle desiredVehicle = new Vehicle("Ford", "Bronco", 2022, "red", 12000.00);
		Customer eagerCustomer = new Customer("Dan Goldman", "123 Street, Columbus, OH", "6142222222", 15000.00, false,
				false, true);
		Employee excitedEmployee = new Employee("Joe Sales", 25, "Salesman", "part-time", "61444442222");
		
		excitedEmployee.handleCustomer(eagerCustomer, desiredVehicle, false);
		System.out.println("End of 1st Customer Sale*******************");
		
	}
	
	public static void sale2() {
		Vehicle desiredVehicle2 = new Vehicle("Jeep", "Wrangler", 2021, "black", 9000.00);
		Customer eagerCustomer2 = new Customer("Jean Bowman", "333 1st Avenue, Columbus, OH", "6142222333", 8000.00, false,
				false, true);
		Employee excitedEmployee2 = new Employee("Joe Sales", 25, "Salesman", "part-time", "61444442222");
		excitedEmployee2.handleCustomer(eagerCustomer2, desiredVehicle2, false);
		System.out.println("End of 2nd Customer Sale*******************");
		
	}
	
	public static void carLoop() {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		Vehicle desiredVehicle = new Vehicle("Ford", "Bronco", 2022, "red", 12000.00);
		Vehicle desiredVehicle2 = new Vehicle("Jeep", "Wrangler", 2021, "black", 9000.00);
		vehicles.add(desiredVehicle);
		vehicles.add(desiredVehicle2);
		
		for(Vehicle cars: vehicles) {
			//System.out.println(cars);
		}
		
		HashSet<Vehicle> vehicleSet = new HashSet<Vehicle>();
		vehicleSet.add(desiredVehicle);
		vehicleSet.add(desiredVehicle2);
		vehicleSet.add(desiredVehicle2);
		
		for (Vehicle veh: vehicleSet) {
			System.out.println(veh);
		}
		
		boolean equal = desiredVehicle2.equals(desiredVehicle2);
		boolean equal2 = desiredVehicle2.equals(desiredVehicle);

		System.out.println(equal);
		System.out.println(equal2);
	}

}
