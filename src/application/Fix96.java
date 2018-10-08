package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Fix96 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date: ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items will be ordered? : ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Enter item #"+ i +" data");
			System.out.print("Product name: ");
			sc.nextLine();
			String pName = sc.nextLine();
			System.out.print("Product price: ");
			Double pPrice = sc.nextDouble();
			Product product = new Product(pName, pPrice);
			System.out.println("Quantity: ");
			int pQuantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(pQuantity, pPrice , product);
			
			order.addProduct(orderItem);
		}
		System.out.println();
		System.out.println("Order sumary:");
		System.out.println(order);
		sc.close();
	}
}
