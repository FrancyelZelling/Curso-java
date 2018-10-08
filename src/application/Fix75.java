package application;

import java.util.Scanner;

public class Fix75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();	
		int[][] mat = new int[m][n];
		
		for (int i = 0; i<mat.length; i++) {
			for (int j = 0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int find = sc.nextInt();
		
		for (int i = 0; i<mat.length; i++) {
			for (int h = 0; h<mat[i].length;h++) {
				if (find == mat[i][h]) {
					System.out.println("Position " + i + ", "+ h);
					if(i > 0) {
						System.out.println("up: " + mat[1-i][h]);
					}
					if(i < mat.length) {
						System.out.println("down: " + mat[1+i][h]);
					}
					if(h > 0) {
						System.out.println("left: "+ mat[i][1-h]);
					}
					if(h <mat[i].length) {
						System.out.println("right: " + mat[i][1+h]);
					}
				}
			}
		}
		
		sc.close();
	}

}
