package _1016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int total = (60*x1)/30;
        System.out.printf("%d minutos\n",total);
	}
}
