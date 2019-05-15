package bill1234;

import java.util.Scanner;
public class MainClass {
	static Scanner scc = new Scanner(System.in);
	public static void main(String[] args) {
		final double costMultiplier= 0.14228;
		final double fixCharges = 22.79;
		final double carbonTaxMultiplier = 0.003095;
		final double gstMultiplier = 0.05;
		final double muniTaxMultiplier = 0.10;
		String cus_id;
		String cus_name;
		//cus_id = GetId();
		//cus_name = theGetName();
		System.out.println("=====================================================================\n");
		System.out.println("WELCOME TO ABCPOWER CUSTOMER MANAGEMENT AND BILLING SYSTEM");
		System.out.println("=====================================================================\n");
		System.out.println("Choose one of following option");
		System.out.println("1. Create New Customer Account");
		System.out.println("2. Update Customer Details");
		System.out.println("3. Delete Customer Account");
		System.out.println("4. Generate Bill for the Customer");
		System.out.println("=====================================================================\n");
		Scanner scc = new Scanner (System.in);
		int i = scc.nextInt();
		if (i==1)
		{	Customer customer1 = new Customer();
			customer1.createNewCustomer();
		
		}
		 
		
}
}