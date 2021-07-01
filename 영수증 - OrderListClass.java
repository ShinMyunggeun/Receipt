package standard3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class OrderListClass {

public void ListOrder(ChooseOrder inputOrd, OrderListArray item) {
					
	try {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
	    Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/goodslist", "root", "123789");
	    String a = "a";

	    item.no = inputOrd.InputNo(); 
	    Statement stmt = conn.createStatement(); 
	    ResultSet rset = stmt.executeQuery("SELECT * FROM goods WHERE no=" + item.no);

    if (rset.next()) {   
    	item.name = rset.getString(2);
    	item.price = rset.getInt(3);		    	
	    } else { System.out.println("해당하는 상품이 없습니다."); }

	    rset.close();
	    stmt.close(); 
	    conn.close(); 
		} catch(Exception e) { e.printStackTrace(); }
		item.count = inputOrd.inputCount();   
		item.total = item.price * item.count; 
	}
} 