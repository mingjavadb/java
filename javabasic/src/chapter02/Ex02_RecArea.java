package chapter02;

import java.util.Scanner;

public class Ex02_RecArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in); ;
		int w, h, area;
		System.out.println("가로 길이를 입력하세요.");
		w=sc.nextInt();
		System.out.println("세로 길이를 입력하세요.");
		h=sc.nextInt();
		System.out.printf("넓이는 : ", w*h);
	}

}


