package _1012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double pi = 3.14159;
        double TRIANGULO = (a * c)/2;
        double CIRCULO = pi * Math.pow(c, 2) ;
        double TRAPEZIO = ((a+b)/2)*c;
        double QUADRADO = b*b;
        double RETANGULO = a*b;
        System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f\n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f\n", QUADRADO);
        System.out.printf("RETANGULO: %.3f\n", RETANGULO);
	}
}
