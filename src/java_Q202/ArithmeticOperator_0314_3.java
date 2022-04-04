package java_Q202;

import java.util.Scanner;

public class ArithmeticOperator_0314_3 {
	
	static void print_star(int num, String s) {
		System.out.print("\n");
		System.out.print(s + ": ");
		for (int i = 0; i < num; i++)
			System.out.print("*");
		System.out.print(" " + num);
    }
	
	public static void main(String[] args) {
		Scanner sc	= new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int time	= sc.nextInt();
		int second	= time % 60;
		int minute	= (time / 60) % 60;
		int hour	= (time / 60) / 60;

		System.out.print(time	+ "초는 ");
		print_star(hour / 24, "일");
		print_star(hour % 24, "시");
		print_star(minute, "분");
		print_star(second, "초");
		
		sc.close();
	}
}
