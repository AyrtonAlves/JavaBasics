package _1008;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
        int horas = scan.nextInt();
        double valor = scan.nextDouble();
        double SALARY = (horas * valor);
        System.out.printf("NUMBER = %d\n", numero );
        System.out.printf("SALARY = U$ %.2f\n", SALARY );
	}

}
