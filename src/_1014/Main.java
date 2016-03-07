package _1014;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        double c = a/b;
        System.out.printf("%.3f km/l\n",c);
	}
}
