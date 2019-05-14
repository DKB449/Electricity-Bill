package bill1234;

import java.util.Scanner;
public class MainClass {
	
	public static void main(String[] args) {
		final double costMultiplier= 0.14228;
		final double fixCharges = 22.79;
		final double carbonTaxMultiplier = 0.003095;
		final double gstMultiplier = 0.05;
		final double muniTaxMultiplier = 0.10;
		String cus_id;
		String cus_name;
		cus_id = GetId();
		//cus_name = theGetName();
		 
		Customer customer1 = new Customer(cus_id,"bob");
		
		
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
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter your ID\n");
		id = scc.next();
		scc.close();
		return id;
	}
	public  static String theGetName() {
			String name1;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name" );
			name1 = sc.next();
			sc.close();
		return name1;
	}
}