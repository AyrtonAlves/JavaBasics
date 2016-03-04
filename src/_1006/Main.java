package _1006;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double MEDIA = ((a*2)+(b*3)+(c*5))/10;
        System.out.printf("MEDIA = %.1f\n", MEDIA);
	}

}
