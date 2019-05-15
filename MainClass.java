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
		
		System.out.println("=====================================================================\n");
		System.out.println("WELCOME TO ABCPOWER CUSTOMER MANAGEMENT AND BILLING SYSTEM");
		System.out.println("=====================================================================\n");
		System.out.println("Choose one of following option");
		System.out.println("1. create New Customer Account");
		System.out.println("2. Update Customer Details");
		System.out.println("3. Delete Customer Account");
		System.out.println("4. Generate Bill for the Customer");
		System.out.println("=====================================================================\n");
		scc = new Scanner (System.in);
		int i = scc.nextInt();
		if (i==1) {
			createNewCustomer();
		}
		else if (i==2) {
			updateCustomer();			
		}
		
		
		cus_id = GetId();
		cus_name = theGetName();
		 
		Customer customer1 = new Customer(cus_id,cus_name);
		
		
		//System.out.println("ID of Customer is :" +num);
		System.out.println("Customer Number is :" +customer1.custNumber);
		System.out.println("Customer Name is :" +customer1.custName);
		int result =customer1.reading(38043,38383);
		System.out.println("Net meter reading is "+result+" kW.h");
		double cost = customer1.costCalculation(result, costMultiplier,fixCharges);	
		System.out.println("Total Cost  "+cost+ " $");
		double carbonTaxCharges = customer1.carbonTaxCalculation(result,carbonTaxMultiplier,gstMultiplier );
		System.out.println("CarbonTaxCharges = "+carbonTaxCharges +" $");
		double totalGstSurcharges = customer1.surchargeTaxCalculation(muniTaxMultiplier,gstMultiplier,cost);
		System.out.println("Total sur charge and GST  = "+totalGstSurcharges +" $");
		double totalCharges = customer1.totalElectricCharges(cost, carbonTaxCharges, totalGstSurcharges);
		System.out.println("Total Monthly Electric Charges = "+totalCharges + " $");
		
	
		

		
	//Display display = new Display();
	
}
	public static String GetId() {
		String id;
		scc = new Scanner(System.in);
		System.out.println("Enter your ID\n");
		id = scc.nextLine();
		return id;
	}
	
	public  static String theGetName() { 
	try {
			String name1;
			scc = new Scanner(System.in);
			System.out.println("Enter your name" );
			name1 = scc.nextLine();
		return name1;
	}catch (Exception e) {
		System.out.println ("Error in this method " +e.getMessage());
		return null; 
}
}
}