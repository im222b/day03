package day3;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("나이를 입력하시오");
		System.out.print("당신의 나이는? : ");	
		int num = input.nextInt();
		
		String msg = "미성년자";
		if(num >=20 ) {
			msg = "성인";
		
		}
			System.out.println("당신은"+ msg+" 입니다.");
		
		
			
		
	}
}
