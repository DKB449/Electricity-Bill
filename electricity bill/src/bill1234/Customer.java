package bill1234;

import java.util.Scanner;

public class Customer {
	int cus_id;
	String cus_name; 

 Customer() {
	 cus_id = GetId();
	 cus_name = GetName();
	 
 }
public  String GetName() {
	String name;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name" );
	name = sc.nextLine();
	
	return name;
}
public int GetId() {
	int id;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your ID");
	id = sc.nextInt();
	sc.close();
	return id;
}

}
