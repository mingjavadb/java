/* p.80 복합대입연산자
 * a=a+b
 * a가 연산에 참여를 하고 있을 때, 
 * a= a+=b 라고 써줌
 * 
 * 뭔말인지 모르겠음. 이해가 안가여
 *  
 */

package chapter03;

public class A06_ComplexAssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=10, num2=20;
        num1 += 5; // num1=num1+5;
        num2 -= 5; // num2=num2-5;
        System.out.println(num1);
        System.out.println(num2);
	}

}

