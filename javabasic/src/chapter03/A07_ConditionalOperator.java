/*
 * 조건연산자
 * 
 */

package chapter03;

import java.util.Scanner;

public class A07_ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*예시문
		int result;
		result = (10<5)?1:2;
		System.out.println(result);
		*/
		
		//부,모의 나이를 입력받아 나이를 많으신 분이 누구인지 출력
		Scanner sc = new Scanner(System.in);
		//아버지가 나이가 더 많으면 아버지, 어머니가 나이가 많으면 어머니,
		int mom, dad;
		String age; //원래 ㅡint를 넣었는데 int를 넣으면 안되는 이유가 
		            // int를 넣으면 숫자형 타입이기 때문에 결과값을 문자로 낼 수 X.
		
		System.out.println("어머니의 나이를 입력하시오");
		mom = sc.nextInt();
		
		System.out.println("아버지의 나이를 입력하시오");
		dad = sc.nextInt();
		
		age = (mom>dad)?"어머니":"아버지";
		System.out.println(age+"의 나이가 더 많습니다.");
		
		
	}

}
