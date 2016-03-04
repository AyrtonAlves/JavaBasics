package _1011;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        double volume = scan.nextDouble();
        double pi = 3.14159;
        volume = (4/3.0) * pi * (Math.pow(volume, 3));
        System.out.printf("VOLUME = %.3f\n", volume);
	}
}
