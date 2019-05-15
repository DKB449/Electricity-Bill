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

public double costCalculation ( int read, double multiplier, double charges) {
double finalCharges =0;
finalCharges = (read * multiplier) + charges; 
return finalCharges;	
}
public double carbonTaxCalculation(int read, double multiplier1, double multiplier2) {
	double carbTaxCharg =0;
	carbTaxCharg =  multiplier1 *read * multiplier2;
	return carbTaxCharg; 
}
     public double surchargeTaxCalculation(double multiplier3, double multiplier4, double finalCharges ) {
    	 double surcharge =0, gstCharge=0,totgstsurcharge=0;
    	 surcharge = finalCharges * multiplier3;
    	  gstCharge = finalCharges * multiplier4;
    	  totgstsurcharge = surcharge + gstCharge;
    	  return totgstsurcharge;
    
         }
     public double totalElectricCharges (double finalCharges, double carbTaxCharg, double totgstsurcharge) {
    	 double totElecCharg =0;
    	 totElecCharg = finalCharges + carbTaxCharg + totgstsurcharge; 
    	 return totElecCharg;
     }
}  
     



