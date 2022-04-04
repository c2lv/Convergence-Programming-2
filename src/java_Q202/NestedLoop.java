package java_Q202;

public class NestedLoop {
	public static void main(String[] args) {
		// 이진수 구구단
		for(int i=1; i<10; i++)
		{
			System.out.println(i + "단");
			for(int j=1; j<10; j++)
				System.out.println(Integer.toBinaryString(i) + "x" + Integer.toBinaryString(j) + "=" + Integer.toBinaryString(i*j));
			System.out.println();
		}
		
		// 별 구구단
		for(int i=1; i<10; i++)
		{
			System.out.println(i + "단");
			for(int j=1; j<10; j++)
			{
				System.out.println(i + "x" + j);
				print_star(i*j);				
			}
			System.out.println();
		}
	}

	private static void print_star(int i) {
		int cnt = 0;
		
		while (i > 0)
		{
			if (cnt != 0 && cnt % 10 == 0)
				System.out.println();
			System.out.print("*");
			cnt++;
			i--;
		}
		System.out.println();
	}
}
