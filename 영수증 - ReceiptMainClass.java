package standard3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner; 

public class ReceiptMainClass {

		public static void main(String[] args) { 

		ArrayList<OrderListArray> orderList = new ArrayList<OrderListArray>(); 
		ChooseOrder inputOr = new ChooseOrder(); 
		PrintOrder printOr = new PrintOrder(); 
		OrderListClass listOr = new OrderListClass(); 

		while(true) {

		OrderListArray item = new OrderListArray();	
		listOr.ListOrder(inputOr,item);

		orderList.add(item);

		inputOr.inputAdd();

		if (inputOr.type == 1) { continue; } 
		else if(inputOr.type == 2) { break;} 

		} printOr.PrintOrder(orderList);
	}
} 