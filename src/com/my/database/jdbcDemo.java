package com.my.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo {

	public static void main(String[] args) {
		
		jdbcExample1();
		//jdbcDeleteExample();
		//jdbcInsertExample();
	}
	
	public static void jdbcExample1() {
		//set up MYSQL - installation and workbench
		//URL Below
		//Driver needs to be added to the build path
		
		String url = "jdbc:mysql://localhost:3306/employees_database";
		try {
			Connection conn = DriverManager.getConnection(url, "Shauna","Covid2020%!");
			
			//Building Option 1
			//Statement statement = conn.createStatement();
			//ResultSet dataResults = statement("Select * from employees_tbl");
			//conn.prepareStatement(statement);
			
			//Buidling Option 2
			String statement = "Select * from employees_tbl";
			PreparedStatement pstmt = conn.prepareStatement(statement);
			ResultSet dataResults = pstmt.executeQuery();
			
			/*
			 * INSERT INTO employees_tbl (id, fName, lName, dept, salary)values(600,'Romeo',
			 * 'Sales', 'Legal', 80000); INSERT INTO employees_tbl values(300,'Myra',
			 * 'Long', 'Acct', 70000); Use employees_database
			 */
			while(dataResults.next()) {
				System.out.println(dataResults.getInt("id"));
				System.out.print(dataResults.getString("fName"));
				System.out.println(dataResults.getString("lName"));
				System.out.println(dataResults.getString("dept"));
				System.out.println(dataResults.getInt("salary"));
				
			}
			System.out.println(dataResults.getFetchSize());
			
			//UPDATE			
			//ORstatment.executeUpdate
		//	pstmt.executeUpdate("INSERT INTO employees_tbl"
		//			+ "(id, fName, lName, dept, salary) values"
		//			+ "(700,'Ron','Tombs', 'Customer Service', 35000);");
			//executeUpdate returns rows affect, so can declare an int and capture.			System.out.println("Executing Update Statement");
			
		    //Delete also used the ExecuteUpdate - client has safe update to prevent full delete; eclipse does not - be careful
		//   pstmt.executeUpdate("DELETE from employees_tbl where id = 600");
			
		   pstmt.executeUpdate("UPDATE employees_tbl SET salary = 40000 where id = 700");
						
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void jdbcDeleteExample() {
			String url = "jdbc:mysql://localhost:3306/employees_database";
			String statement = "Delete from employees_tbl where id = 700";
			
			//try with closable resources
			try (Connection conn = DriverManager.getConnection(url,"Shauna","Covid2020%!");
					PreparedStatement pstmt = conn.prepareStatement(statement);){
					
				int rowsImpacted = pstmt.executeUpdate();
					System.out.println("Rows Impacted: " + rowsImpacted);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	public static void jdbcInsertExample() {
		String url = "jdbc:mysql://localhost:3306/employees_database";
		String statement = "INSERT INTO employees_tbl (id, fName, lName, dept, "
				+ "salary)values(600,'Romeo','Sales', 'Legal', 80000)";			
		
		//try with closable resources
		try (Connection conn = DriverManager.getConnection(url,"Shauna","Covid2020%!");
				PreparedStatement pstmt = conn.prepareStatement(statement);){
				
			int rowsImpacted = pstmt.executeUpdate();
				System.out.println("Rows Impacted: " + rowsImpacted);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
