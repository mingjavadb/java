package chapter03;

import java.util.Scanner;

public class A01_ArithmaticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 이름, 국어, 수학, 영어 점수를 입력받아 총점과 평균을 출력하는 프로그램 작성
 
		String name;
		double korean, math, english, sum; //여기 int로 하면 소수점이 안나옴.
		                                   //그래서 더블double을 씀
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하시오.");
		name = sc.next();
		
		System.out.println("국어 점수를 입력하시오.");
		korean = sc.nextDouble();

		System.out.println("수학 점수를 입력하시오.");
		math = sc.nextDouble();
		
		System.out.println("영어 점수를 입력하시오.");
		english = sc.nextDouble();
		
		sum = korean+math+english;
		avg = sum/3.0;
		     // ㄴ앞에 변수를 int 썼다면 이 줄에서 sum 앞에 (double)을 넣는다면 강제형변환.
		
		System.out.println(name+"의 총점: "+sum+", "+"평균은 "+avg+"입니다.");
		
		
	}

}
