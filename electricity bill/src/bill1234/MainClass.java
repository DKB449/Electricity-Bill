package bill1234;

import java.util.*;
public class MainClass {
	
	public static void main(String[] args) {
		final double costMultiplier= 0.14228;
		final double fixCharges = 22.79;
		final double carbonTaxMultiplier = 0.003095;
		final double gstMultiplier = 0.05;
		final double muniTaxMultiplier = 0.10;
		

		Customer customer1 = new Customer("1234","bob");
	
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
}
}