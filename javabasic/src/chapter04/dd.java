package chapter04;

import java.util.Scanner;

public class dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// 키보드로부터 숫자를 입력받아 홀수 짝수를 판단하여 출력하세요
		// 숫자를 2로 나누어서 나머지가 1이면 홀수,d 나머지가 0이면 짝수
		
		Scanner sc=new Scanner (System.in);
				int number;
				number=sc.nextInt();
		if((number%2)==1) {System.out.println("홀수");}
		else {System.out.println("짝수");}
		
		
		
	}

}
