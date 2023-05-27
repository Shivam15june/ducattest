package exceptiondemo;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1=:");
		int num1 = sc.nextInt();

		System.out.println("Enter num2=:");
		int num2 = sc.nextInt();
		try {
			int div = num1 / num2;

			System.out.println(div);
		} catch (Exception e) {
			System.out.println(e);
			// e.printStackTrace();
		} finally {
			sc.close();
		}

		System.out.println("Continue compilation...........");

	}

}
