package application;

import entities.Guest;
import java.util.Locale;
import java.util.Scanner;

import entities.Guest;

public class Fix67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? :");
		int rentRooms = sc.nextInt();
		Guest[] vect = new Guest[10];
		
		System.out.println("Enter guest information");
		
		for (int i=0; i<rentRooms; i++) {
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Witch room you want?: ");
			int room = sc.nextInt();
			vect[room] = new Guest(name, email);
		}
		
		System.out.println("Busy rooms :");
		for (int h=0; h<vect.length; h++) {
			if (vect[h]!= null) {
				System.out.println(h + " : "+ vect[h].toString());
			}
		}
		sc.close();
	}

}
