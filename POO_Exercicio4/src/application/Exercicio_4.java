package application;

import java.util.Scanner;

import entities.Account;

import java.util.Locale;

public class Exercicio_4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)?");
		char yn = sc.next().charAt(0);
		
		if (yn == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			Account accy = new Account(number, holder, balance);
			System.out.println(accy);
			
			System.out.print("\nEnter a deposit value: ");
			accy.depositValue(balance = sc.nextDouble());
			System.out.println(accy);
			
			System.out.print("\nEnter a withdraw value: ");
			accy.withdrawValue(balance = sc.nextDouble());
			System.out.println(accy);
			
		} else if (yn == 'n') {
			Account accn = new Account(number, holder);
			System.out.println(accn);
			
			System.out.print("\nEnter a deposit value: ");
			double balance;
			accn.depositValue(balance = sc.nextDouble());
			System.out.println(accn);
			
			System.out.print("\nEnter a withdraw value: ");
			accn.withdrawValue(balance = sc.nextDouble());
			System.out.println(accn);
			
		} else System.out.println("Only y or n");

		
		sc.close();

	}

}
