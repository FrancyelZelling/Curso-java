package application;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		Boolean state = false;
		
		while (true){
			int numero = sc.nextInt();
			if (numero < 10) {
				System.out.println("it worked!!!!!!!!!!!!!!!!!!!!!");
				break;
			}
			else {
				System.out.println("nonononononono");
			}
		}
		
		sc.close();
	}

}
