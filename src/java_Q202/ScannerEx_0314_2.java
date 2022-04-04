package java_Q202;

import java.util.Scanner;

public class ScannerEx_0314_2 {

	public static void main(String[] args) {
		System.out.println("여러 줄에 걸쳐 당신의 신상정보를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		System.out.print("한글 이름: ");
		String s1 = sc.next();
		System.out.print("영어 이름: ");
		String s2 = sc.next();
		System.out.print("주민등록번호: ");
		String s3 = sc.next();
		System.out.print("학교: ");
		String s4 = sc.next();
		System.out.print("학과: ");
		String s5 = sc.next();
		System.out.print("전공: ");
		String s6 = sc.next();
		System.out.print("자격증: ");
		String s7 = sc.next();
		System.out.print("이메일: ");
		String s8 = sc.next();
		System.out.print("전화번호: ");
		String s9 = sc.next();
		System.out.print("수상경력: ");
		String s10 = sc.next();
		System.out.print("주소: ");
		String s11 = sc.next();
		System.out.print("자기소개: ");
		String s12 = sc.next();
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("|                        자기소개서                           |");
		System.out.println("-----------------------------------------------------------");
		System.out.println("| 한글 이름                  |" + s1 + "                        |");
		System.out.println("| 영어 이름                  |" + s2 + "                        |");
		System.out.println("| 주민등록번호                |" + s3 + "                        |");
		System.out.println("| 학교                      |" + s4 + "                        |");
		System.out.println("| 학과                      |" + s5 + "                        |");
		System.out.println("| 전공                      |" + s6 + "                        |");
		System.out.println("| 자격증                     |" + s7 + "                        |");
		System.out.println("| 이메일                     |" + s8 + "                        |");
		System.out.println("| 전화번호                   |" + s9 + "                        |");
		System.out.println("| 수상경력                   |" + s10 + "                        |");
		System.out.println("| 주소                      |" + s11 + "                        |");
		System.out.println("| 자기소개                   |" + s12 + "                        |");
		System.out.println("----------------------------------------------------------");
		sc.close();
	}

}
