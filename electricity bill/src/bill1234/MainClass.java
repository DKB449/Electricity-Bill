package bill1234;

import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Customer customer1 = new Customer("1234","bob");
	
	int result =customer1.reading(2000,1200);
	System.out.println("Net meter reading is "+result);
		
}
}