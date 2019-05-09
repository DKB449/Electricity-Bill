package bill1234;

import java.util.Scanner;

public class Customer {
	public String custNumber;
	public String custName; 

 public Customer() {
 }
 
 public  Customer(String custNumber,String custName) {
	 this.custNumber = custNumber;
	 this.custName = custName;
	 System.out.println("Customer class is called");
 }
	
 //cus_id = GetId();
	 //cus_name = GetName();
	 
 
//public  String GetName() {
	//String name;
	//Scanner sc = new Scanner(System.in);
	//System.out.println("Enter your name" );
	//name = sc.nextLine();
	//sc.close();
	//return name;
//}
//public int GetId() {
	//int id;
	//Scanner scc = new Scanner(System.in);
	//System.out.println("Enter your ID");
	//id = scc.nextInt();
	//scc.close();
	//return id;
//}
public int  reading (int readingOne, int readingTwo) {
	int read=0;
	if (readingTwo < readingOne)
	{
		System.out.println("Error in reading");
	}else {
	
	read = readingTwo - readingOne;
	}
	return read;
}

}

