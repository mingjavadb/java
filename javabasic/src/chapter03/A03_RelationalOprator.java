//관계연산자

package chapter03;

import java.util.Scanner;

public class A03_RelationalOprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 생년을 입력받아 성년(19세 이상) 여부를 판단하라.
		
		int age, birthYear;
		boolean adult;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 연도를 입력하시오.");
		birthYear = sc.nextInt();
		
		age = 2019-birthYear+1;
		adult = age>=20;
		System.out.println("성년 여부 : " + adult);
		

	}

}
