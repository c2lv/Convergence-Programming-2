package java_Q202;

import java.util.Scanner;

public class CoffeePrice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] orders = {"아메리카노","민트초코","딸기스무디","초코쿠키","아몬드쿠키","용감한쿠키","허니브레드","와플","당근케이크"};

		int[] prices = {1000,2000,3000,4000,5000,6000,7000,8000,9000};
		int total = 0;
		System.out.println("====메뉴판====");
		for (int i = 0; i < 9; i++)
			System.out.println(orders[i] + "\t" + prices[i]);
		System.out.println("============");	
		while (true)
		{
			System.out.print("무슨 메뉴 드릴까요? ");
			String order = sc.next();
			int price = 0;
			switch (order)
			{
			case "아메리카노":
				price = prices[0];
				break ;
			case "민트초코":
				price = prices[1];
				break ;
			case "요거트스무디":
				price = prices[2];
				break ;
			case "초코쿠키":
				price = prices[3];
				break ;
			case "아몬드쿠키":
				price = prices[4];
				break ;
			case "용감한쿠키":
				price = prices[5];
				break ;
			case "허니브레드":
				price = prices[6];
				break ;
			case "와플":
				price = prices[7];
				break ;
			case "당근케이크":
				price = prices[8];
				break ;
			case "이상입니다":
				price = 0;
				break ;
			default:
				System.out.println("없는 메뉴입니다.");
			}
			if (price != 0)
			{
				System.out.println(order + "는 " + price + "원입니다.");
				total += price;
			}
			else
				break ;
		}
		System.out.println("멤버십 카드 있으신가요? ");
		String answer = sc.next();
		if (answer.equals("네"))
			total *= 0.9;
		System.out.println("총 가격은 " + total + "원입니다.");	
		sc.close();
	}
}
