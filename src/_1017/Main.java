package _1017;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
        int b = scan.nextInt();
        double distancia = (a*b)/12.0;
        System.out.printf("%.3f\n",distancia);
	}
}
