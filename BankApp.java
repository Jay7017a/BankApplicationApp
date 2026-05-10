package BankingApplication;

public class BankApp extends UserLogin{
	String accountHolderName;
	long mobileNumber;
	long adharCardNumber;
	String bankType;
	String PANCardNumber;
	String address;
	String fatherOrHusbandOF;
	double initialAmountDeposit;
	String martialStatus;
	BankApp(String accountHolderName,Long adharCardNumber,String bankType,double initialAmountDeposit,String PANCardNumber,String address, String fatherOrHusbandOF,long mobileNumber,String martialStatus)
	{
		super(accountHolderName,adharCardNumber,bankType,initialAmountDeposit,PANCardNumber,address,fatherOrHusbandOF,mobileNumber,martialStatus);
	}
	
	public static void main(String[] args) {
		
		String accountHolderName;
		long mobileNumber;
		long adharCardNumber;
		String bankType;
		String PANCardNumber;
		String address;
		String fatherOrHusbandOF;
		double initialAmountDeposit;
		String martialStatus;
		
		System.out.println("----------------------------------");
		System.out.println("WELCOME TO THIS BANK");
		System.out.println("----------------------------------");
		System.out.println("Application Form");
		System.out.println("Make sure to fill All the Details");
		System.out.println("Enter Account Holder Name");
		accountHolderName=sc.next();
		System.out.println("Enter Mobile Number");
		mobileNumber=sc.nextLong();
		System.out.println("Enter Adhard Card Number ");
		adharCardNumber=sc.nextLong();
		System.out.println("Enter Bank Type");
		bankType=sc.next();
		System.out.println("Enter PAN Card Number");
		PANCardNumber=sc.next();
		System.out.println("Enter Initial Deposit");
		initialAmountDeposit=sc.nextDouble();
		System.out.println("Enter Address");
		address=sc.next();
		System.out.println("Enter martial Status");
		martialStatus=sc.next();
		System.out.println("Either father/Husband Of");
		fatherOrHusbandOF=sc.next();
		BankApp addUser1=new BankApp(accountHolderName,adharCardNumber,bankType,initialAmountDeposit,PANCardNumber,address,fatherOrHusbandOF,mobileNumber,martialStatus);
		

	}



}
