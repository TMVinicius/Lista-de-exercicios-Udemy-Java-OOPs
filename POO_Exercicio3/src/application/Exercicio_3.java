package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Exercicio_3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student Std = new Student();

		Std.name = sc.nextLine();
		Std.grade1 = sc.nextDouble();
		while (Std.grade1 > 30) {
			Std.grade1 = sc.nextDouble();
		}

		Std.grade2 = sc.nextDouble();
		while (Std.grade2 > 35) {
			Std.grade2 = sc.nextDouble();
		}

		Std.grade3 = sc.nextDouble();
		while (Std.grade3 > 35) {
			Std.grade3 = sc.nextDouble();
		}

		System.out.println("FINAL GRADE = " +String.format("%.2f", Std.finalGrade()));

		if (Std.finalGrade() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED ");
			System.out.println(Std.missingPoints());

		}

		sc.close();

	}

}
