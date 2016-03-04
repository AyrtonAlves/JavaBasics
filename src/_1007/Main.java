package _1007;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int DIFERENCA  = (a * b - c * d);
        System.out.printf("DIFERENCA = %d\n", DIFERENCA );
	}

}
