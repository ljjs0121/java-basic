package roop;

public class ForDemo1 {
	public static void main(String[] args) {
		/*
		 * for문
		 * 		블록내의 수행문을 여러 번 반복 실행시킨다.
		 * 형식
		 * 		for (초기식; 조건식; 증감식) {
		 *			수행문;
		 *			수행문;
		 *			수행문; 
		 * 		}
		 * 		실행순서
		 * 		* 초기식 : 한번만 실행된다. 반복 작업의 횟수를 제어하기 위한 시작값을 설정한다.
		 * 				  초기식에서 선언한 변수는 for문의 블록내에서 선언한 변수와 같은 변수 범위를 가진다.
		 * 				  초기식에서 성넌한 변수는 조건식, 증감식, for 블록의 수행문에서만 사용가능하다.
		 * 		* 조건식 : 조건식이 true로 판정될 때 블록내의 수행문을 실행한다.
		 * 				  조건식이 false로 판정되면 for문을 빠져나간다.
		 * 		 		  조건식은 반복을 언제까지 지속해야 되는지를 결정한다.
		 * 				  조건식은 초기식에서 지정한 시작값이 조건식을 만족할 때 까지 반복작업을 수행하게 한다.
		 * 		* 수행문 : 조건식이 true로 판정될 때 마다 실행된다.
		 * 				  수행문의 실행이 완료되면 다음 번 반복을 위해서 증감식으로 이동한다.
		 * 		* 증감식 : 초기식에서 지정한 시작값에 변화를 준다.
		 * 				  증감식을 수행하고 나면 조건식으로 이동해서 다시 조건식을 실행한다. 
		 * 			초기식 -> (조건식 -> 수행문 -> 증감식) 반복
		 *	예시
		 *		for(int i = 1; i <= 10; i++) {
		 *			System.out.println("안녕");
		 *		} 
		 */
		
		// 수행문을 10번 반복하기
		for(int i = 1; i <= 10; i++) {
			System.out.println("실행");
		}
		
		System.out.println();
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("실행");
		}
		
	}
}
