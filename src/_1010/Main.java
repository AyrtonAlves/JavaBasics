package _1010;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cod = scan.nextInt();
        int qnt = scan.nextInt();
        double valor = scan.nextDouble();
        int cod2 = scan.nextInt();
        int qnt2 = scan.nextInt();
        double valor2 = scan.nextDouble();
        double total = qnt * valor;
        double total2 = qnt2 * valor2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", (total + total2));
	}

}
