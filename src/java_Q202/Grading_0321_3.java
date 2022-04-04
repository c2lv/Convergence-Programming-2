package java_Q202;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Grading_0321_3 {

	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);

		while (++i <= 10)
		{
			int score;

			System.out.print("점수를 입력하세요(0~100): ");
			try
			{
				score = sc.nextInt();
			}
			catch (InputMismatchException e)
			{
				System.out.println(e);
				sc = new Scanner(System.in);
				continue ;
			}
			if (score > 100 || score < 0)
				System.out.println("점수가 범위 밖입니다.");    
			else if (score >= 95)
				System.out.println("A+");
			else if (score >= 90)
				System.out.println("A");
			else if (score >= 85)
				System.out.println("B+");
			else if (score >= 80)
				System.out.println("B");
			else if (score >= 75)
				System.out.println("C+");
			else if (score >= 70)
				System.out.println("C");
			else if (score >= 65)
				System.out.println("D+");
			else if (score >= 60)
				System.out.println("D");
			else
				System.out.println("F");
		}
		sc.close();
	}
}
