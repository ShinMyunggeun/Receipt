package standard4;

import java.util.Scanner;

public class PrintClass {
	public int inputPrice = 0;
	public Scanner scan = new Scanner(System.in);
	public void inputPrice() {
		System.out.print("지불한 금액은?");
		inputPrice = scan.nextInt();
		System.out.println("\n===================================");
	}
	public void printTotalPrice(int totalPrice) {
		System.out.println("=====================================");
		System.out.printf("총 금액은 %d 원입니다.\n", totalPrice);
	}
	public void justPrint() {
		System.out.println("	     [영  수  증]	\n");
		System.out.println("[사업자] 178-02-01306");
		System.out.println("[주소] 서울  강남구  봉은사로61길  31 (삼성");
		System.out.println("동, 이화빌리지) 1층 101호 (삼성동)");
		System.out.println("[대표자] 김유경	 [TEL] 010-5918-4947");
		System.out.println("=====================================");
		System.out.printf("%5s %7s %8s %8s \n", "상품명", "단가", "수량", "금액");
	}
	public void finalPrice(int totalPrice) {
		System.out.println("-------------------------------------");
		System.out.printf("할인 금액 %27s \n", 0);
		System.out.println("-------------------------------------");
		System.out.println("** 할인내역 :   	                없음");
		System.out.println("-------------------------------------");
		System.out.printf("결제금액 %28d \n",           totalPrice);
		System.out.println("-------------------------------------");
		System.out.printf("합계 금액 %27d \n",           totalPrice);
		System.out.println("-------------------------------------");
		System.out.println("      *** 신용승인정보(고객용)[1] ***  ");
		System.out.println("-------------------------------------");
		System.out.println("# 따스한_봄날_민주와_함께");
		System.out.println("# 민주의_21번째_생일을_축하해");
	}
}