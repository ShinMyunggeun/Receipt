package standard4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class DatabaseQuery {
	
	public Scanner scan = new Scanner(System.in);
	public int i=0;
	public int inputNo;
	public int totalPrice = 0;
	public int choiceAdd =0;
	public ArrayList<DataClass> arrData = new ArrayList<DataClass>();
	public void dbQuery() {
		
		DataClass item = new DataClass();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
		    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/goodslist",                  
		                                       "root" , "123789");
		    System.out.print("상품 번호를 입력해주세요 : ");
		    inputNo = scan.nextInt();
		    
		    Statement stmt = conn.createStatement(); 
		    ResultSet rset = stmt.executeQuery("select * from goods where no="+inputNo); 
		    if (rset.next()) { 
		    	System.out.printf("=> %d %s %d원 %s\n",rset.getInt(1),rset.getString(2),
		    			rset.getInt(3),rset.getString(4));
		    	item.goodsName=(String)rset.getString(2);
		    	item.goodsPrice=rset.getInt(3);
		    } else {
		    	System.out.println("해당하는 상품이 없습니다.");
		    }
		    rset.close(); 
		    stmt.close(); 
		    conn.close(); 
		} catch(Exception e) {
			e.printStackTrace();
		}
		arrData.add(item);
		System.out.println("몇개를 구매하시겠습니까?");
		item.goodsCount = scan.nextInt();
		
		System.out.print("1.추가구매, 2.구매종료\n");
		choiceAdd = scan.nextInt();
	}
	public void total() {
		for(int i=0;i<arrData.size();i++) {
			totalPrice += (arrData.get(i).goodsPrice) * (arrData.get(i).goodsCount);
		}
		
	}
	public void purchasedGoods() {
		for(int i=0;i<arrData.size();i++) {
			System.out.printf("%-12s\t %d\t %d\t %d\n",arrData.get(i).goodsName, arrData.get(i).goodsPrice,
					arrData.get(i).goodsCount, (arrData.get(i).goodsPrice*arrData.get(i).goodsCount));
		}
	}
	
	public void keepingBook() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
		    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/goodslist",                  
		                                       "root" , "123789");
		    
		    String sql = "insert into keepingBook(name,count,price) values(null,null,null)";
		    Statement stmt = conn.createStatement();
		    PreparedStatement pstmt = conn.prepareStatement(sql);
		    
		    for(int i=0;i<arrData.size();i++) {
		    	pstmt.setString(1, arrData.get(i).goodsName);
		    	pstmt.setInt(2, arrData.get(i).goodsPrice);
		    	pstmt.setInt(3, arrData.get(i).goodsCount);
		    	pstmt.executeUpdate();
		    }
		    stmt.close();		    
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
}