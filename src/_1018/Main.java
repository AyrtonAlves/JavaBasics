package _1018;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int n100=0, n50=0, n20=0, n10=0, n5=0, n2=0, n1=0;
        System.out.printf("%d\n", n);
        while(n >= 100){
            n100++;
            n -= 100;
        }
	    while(n >= 50){
            n50++;
            n -= 50;
        }
	    while(n >= 20){
            n20++;
            n -= 20;
        }
	    while(n >= 10){
	    	n10++;
            n -= 10;
        }
	    while(n >= 5){
            n5++;
            n -= 5;
        }
	    while(n >= 2){
            n2++;
            n -= 2;
        }
	    while(n >= 1){
	    	n1++;
            n -= 1;
        }
        System.out.printf("%d nota(s) de R$ 100,00\n", n100);
        System.out.printf("%d nota(s) de R$ 50,00\n", n50);
        System.out.printf("%d nota(s) de R$ 20,00\n", n20);
        System.out.printf("%d nota(s) de R$ 10,00\n", n10);
        System.out.printf("%d nota(s) de R$ 5,00\n", n5);
        System.out.printf("%d nota(s) de R$ 2,00\n", n2);
        System.out.printf("%d nota(s) de R$ 1,00\n", n1);
	}
}
