package _1009;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome = scan.next();
        double salario = scan.nextDouble();
        double bonus = scan.nextDouble();
        double total = (bonus * 0.15) + salario;
        System.out.printf("TOTAL = R$ %.2f\n", total );
	}

}
