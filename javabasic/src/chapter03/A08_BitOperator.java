/*비트 p.83
 *리터럴 = 들어가는 숫자 자체 . 일반적인 숫자값.
 *어떤 변수를 선언을 해놓고 오른쪽 항에 들어가는 숫자를 내가 임의로 컨트롤 할 수 있음.
 *
 *비트로 숫자값을 지정해서 변수에 넣어줄 수 있다.
 *
 *
 */

package chapter03;

public class A08_BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int number = 5;
		//int number = 0b101; : 2진수
		//int number = 012;   : 8진수 
		//int number = 0xa;   : 16진수
		//System.out.println(number);
		
		//숫자를 진수로 출력하기 (예시는 16진수)
		//int number = 10;
		//System.out.printf("%x", number);
		//x를 대문자로 고치면 대문자로 출력이 됨.
		//출력 된 a는 숫자 a가 출력이 된 것.
		
		
		/*
		 * 포맷터 : System.out.printf("", number );
		 * println 이 아닌 printf 구문
		 */
		
		
		/*
		 * 포맷터 아래에 적어줄 수 있는 것 : 
		 * % [-][0][m][.n]_  >> 적을때는  이 순서대로 적으면 됨.
		            지수형 :숫자를 출력하는데 지수형으로 출력해라
		 * % : 퍼센트지는 반드시 붙여야됨
		 * 퍼센트뒤에 _ 빈공간에 d 가 들어가면 십진정수
		 *         f 실수
		 *         b 가 들어가면 boolean
		 *         o (영어알파벳임.숫자ㄴ) 가 들어가면 8진수
		 *         x 또는 X 가 들어가면 16진수
		 *         e 
		 *         c char(문자)
		 *         s 문자열
		 * []는 적을수도 있고 안 적을 수 도 있는 것들
		 * [-] : 왼쪽정렬에서 출력을 하면서 빈 칸은 공백으로 처리해라
		 * [0] : 오른쪽정렬 빈칸 0으로 채워서 출력
		 * [m] : 숫자(실수형)를 출력할 때 전체자릿수를 몇자리를 맞춰서 출력해라. 
		 * [.n]: 소수점이하 자릿수



		 *         
		 */
		 /*
		  double number = 10.123;
		  System.out.printf("%5.2f", number);
		  //숫자 실수형에다가 5자리, 소수점은 2자리까지 출력
		*/
		
		
		
		/*
		 * double number = 10.123; 
		 * System.out.printf("%010.2f", number);
		 */
		//앞에는 0으로 채우고 10은 전체자리수, 소수점은 2자리

		/* & 연산자
		 * byte num1 = 0b0101; 
		 * byte num2 = 0b1010; 
		 * int result = num1 & num2;
		 *        //숫자가 크게 출력되기때문에 byte 말고 int로 
		 * System.out.println(result); //답 0
		 */		
		
		
		/* | 연산자
		byte num1 = 0b0101;
		byte num2 = 0b1010;
		int  result = num1 | num2; 
		System.out.println(result);
		값: 15
		*/
		
		/* 팩트 현상
		byte num1 = 0b0101;
		byte num2 = 0b1010;
		int  result = num1 ^ num2; 
		System.out.println(result);
		값 : 15
		*/
		
		/* 팩트 현상
		byte num1 = 0b00001101;
		byte num2 = 0b00001010;
		int  result = num1 ^ num2; 
		System.out.println(result);
		값: 7
		*/
		
		
		
		/*
		~ 연산자
		byte num1 = 0b00001101;
		byte num2 = 0b00001010;
		int  result = ~num1; 
		System.out.println(result);
		값: -14
		*/
		
		
		/*
		 * 원리 : 이해 못 함 껄껄껄
		이진수를 반전했다면 2의 보수로 표현해줘야함.
		~00001010 : 11110101 = 64+32+16+4+1 하지만 이 결과값은 안 나옴
		                 ㄴ 부호비트(맨앞쪽 숫자)는 그대로 쭉 내려오고 나머지아이들은 반전.
		              2의 보수 : 1의 보수를 취하고 +1를 한 것
		              
		*/
		
		/* 레프트 쉬프트 연산자
		int result;
		int num3=10;
		result=num3 << 2;
		System.out.println(result);
		닶 : 40
		*/
		
		
		/* 라이트 쉬프트 연산자
		int result;
		int num3=10;
		result=num3 >> 2;
		System.out.println(result);
		*/
		
		int num;
		num = -5+3*10/2;
		System.out.println(num);
		
		
		
		
		/*
		 * 제어구문 : 순차적 실행 : 순서대로 진행
		 *         선택제어    : 상황에 따라서 어떻게 할 건지
		 *                  if 구문을 사용한다
		 *                  if(조건식) 실행문장;
		 *                  if(조건식) 조건이 맞을때 실행해야 되는 문장
		 *                   else 조건이 안 맞을때실행해야되는문장 
		 *                        if 그 조건조차도 또 안 맞으면 
		 *                   else 이렇게 실행을 해라.
		 *         반복제어    : 반복적으로 진행
		 * 세상의 모든 로직은 이 세가지만 가지고 짤 수 있다.
		 * */
		
		
		
		
		
		
		
		
	}

}


