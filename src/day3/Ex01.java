package day3;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수 입력 : ");	
		int num = input.nextInt();
		
		String msg = "3의 배수가 아닙니다.";
		if (num % 3 == 0) {
			msg = "3의 배수 입니다.";
		}
		
		
		System.out.println("입력하신 정수는 " + msg);
		
		
	}
}
