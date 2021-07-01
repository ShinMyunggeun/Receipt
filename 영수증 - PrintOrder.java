package standard3;

import java.util.ArrayList;

public class PrintOrder {

	int totalPrice = 0;
	public void PrintOrder(ArrayList<OrderListArray> orderList) {
		
		System.out.println("	     [영  수  증]	\n");
		System.out.println("[사업자] 178-02-01306");
		System.out.println("[주소] 서울  강남구  봉은사로61길  31 (삼성");
		System.out.println("동, 이화빌리지) 1층 101호 (삼성동)");
		System.out.println("[대표자] 김유경	 [TEL] 010-5918-4947");
		System.out.println("=====================================");
		System.out.printf("%5s %7s %8s %8s \n", "상품명", "단가", "수량", "금액");
		for(int index=0; index < orderList.size(); index++) {
		System.out.printf("%-10s %-8d %3d %10d\n", orderList.get(index).name, orderList.get(index).price, 
				orderList.get(index).count,orderList.get(index).total);
		}
		for(int index=0; index < orderList.size(); index++) {
			totalPrice += orderList.get(index).price * orderList.get(index).count;}
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
