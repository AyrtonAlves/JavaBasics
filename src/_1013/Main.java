package _1013;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int MaiorAB =(a+b+Math.abs(a-b))/2;
        int maior=(MaiorAB+c+Math.abs(MaiorAB-c))/2;
        System.out.printf("%d eh o maior\n",maior);
	}
}
