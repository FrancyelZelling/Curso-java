package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Fix72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<Employee> emp = new ArrayList<>();
		System.out.print("How many employees will be registered? :");
		int empRegister = sc.nextInt();

		for (int i = 0; i < empRegister; i++) {
			System.out.println("Employee #" + ++i);
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			emp.add(new Employee(id, name, salary));
		}
		for (Employee x : emp) {
			System.out.println(x);
		}

		while (true) {
			System.out.print("Enter the ID of the employee that will receive a raise: ");
			int id = sc.nextInt();
			Employee empToRaise = emp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			
			if (empToRaise != null) {
				System.out.print("Enter the amount to raise: ");
				double percentage = sc.nextDouble();
				empToRaise.raiseSalary(percentage);
				break;
			}
			else {
				System.out.println("This employee doesn't exist.");
			}
		}
		
		for (Employee obj : emp) {
			System.out.println(obj);
		}

		sc.close();
	}

}
