package standard4;

import standard4.DatabaseQuery;
import standard4.PrintClass;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseQuery dbQuery = new DatabaseQuery();
		PrintClass print = new PrintClass();
		
		do {
			dbQuery.dbQuery();
		}while(dbQuery.choiceAdd==1); 
		dbQuery.total();
		print.printTotalPrice(dbQuery.totalPrice);
		print.inputPrice();
		print.justPrint();
		
		dbQuery.purchasedGoods();

		print.finalPrice(dbQuery.totalPrice);
		dbQuery.keepingBook();	
	}
}
