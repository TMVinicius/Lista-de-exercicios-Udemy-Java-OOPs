package application;

import entities.Triangle;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Triangle x, y;

		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX, areaY, px, py;

		px = (x.a + x.b + x.c) / 2;
		areaX = Math.sqrt(px * (px - x.a) * (px - x.b) * (px - x.c));

		py = (y.a + y.b + y.c) / 2;
		areaY = Math.sqrt(py * (py - y.a) * (py - y.b) * (py - y.c));

		System.out.println("Triangle X area: " + areaX);
		System.out.println("Triangle Y area: " + areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}

		sc.close();

	}

}
