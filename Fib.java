package vijji;

import java.util.Scanner;

public class Fib {
	
	private static Scanner s;

	public static void main(String[] args) {
		int a=0,b=1,c;
		s = new Scanner(System.in);
		System.out.println("enter n value to get n numbers in fibonacci series");
		int n=s.nextInt();
		System.out.print(a + " " + b);
		for(int i=1;i<=n-2;i++){
			c=a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
		}
	}
} 
