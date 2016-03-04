package _1002;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double pi = 3.14159;
        double a = scan.nextDouble();
		double x = Math.pow(a, 2);
        System.out.printf("A=%.4f\n", (pi*x));
	}
}
