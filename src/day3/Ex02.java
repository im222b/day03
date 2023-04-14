package day3;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력 : ");	
		int num = input.nextInt();
		
		String msg = "50 미만입니다";
		if(num >= 50) {
			msg = "50 이상입니다.";
		
		}
			System.out.println("입력하신 정수는 "+ msg);
	
	
	}

}
