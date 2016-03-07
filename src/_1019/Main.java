package _1019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int horas_seg = 3600;
        int tempo = scan.nextInt();
        int horas = (tempo/horas_seg);
        int minutos = (tempo -(horas_seg*horas))/60;
        int segundos = (tempo -(horas_seg*horas)-(minutos*60));
        System.out.printf("%d:%d:%d\n",horas,minutos,segundos);
	}
}
