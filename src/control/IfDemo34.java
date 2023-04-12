package control;

public class IfDemo34 {
	/*
	 * IfDemo3 코드의 리팩토링
	 */
	// 구매금액이 100만원 이상이면 구매금액의 5%를 포인트로 적립한다.
	// 구매금액이 70만원 이상이면 구매금액의 2%를 포인트로 적립한다. 
	// 구매금액이 50만원 이상이면 구매금액의 1%를 포인트로 적립한다.
	// 구매금액이 10만원 이상이면 구매금액의 0.1%를 포인트로 적립한다.
	public static void main(String[] args) {
		int orderAmount = 1_500_000;
		double depositRate = 0;
		
		if (orderAmount >= 1_000_000) {
			depositRate = 0.05;
		} else if (orderAmount >= 700_000) {
			depositRate = 0.02;
		} else if (orderAmount >= 500_000) {
			depositRate = 0.01;
		} else if (orderAmount >= 100_000) {
			depositRate = 0.001;
		}
			int point =(int) (orderAmount*depositRate);
			System.out.println("구매금액 : " + orderAmount + "원");
			System.out.println("적립률 : " + depositRate + "%");
			System.out.println("적립포인트 : " + point + "점");
	}
}
