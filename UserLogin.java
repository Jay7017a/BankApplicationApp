package BankingApplication;

import java.util.Scanner;

public abstract class UserLogin {
	static public Scanner sc = new Scanner(System.in);
	private String accountHolderName;
	private long mobileNumber;
	private long adharCardNumber;
	private String bankType;
	private String PANCardNumber;
	private String address;
	private String fatherOrHusbandOF;
	private double initialAmountDeposit;
	private String martialStatus;
	

	public UserLogin(String accountHolderName, long mobileNumber, long adharCardNumber, String address,
			String fatherOrHusbandOF) {

		this(accountHolderName, adharCardNumber, "savingsBank", 0.0, address, fatherOrHusbandOF, mobileNumber,
				"single");
	}

	public UserLogin(String accountHolderName, long adharCardNumber, String bankType, double initialAmountDeposit,
			String address, String fatherOrHusbandOF, long  mobileNumber, String martialStatus) {
		this(accountHolderName, adharCardNumber, bankType, initialAmountDeposit, null, address, fatherOrHusbandOF,
				mobileNumber, martialStatus);

	}

	public UserLogin(String accountHolderName, long adharCardNumber, String bankType, double initialAmountDeposit,
			String pANCardNumber, String address, String fatherOrHusbandOF, long mobileNumber, String martialStatus) {
		super();
		this.accountHolderName = accountHolderName;
		this.mobileNumber = mobileNumber;
		this.adharCardNumber = adharCardNumber;
		this.bankType = bankType;
		this.PANCardNumber = pANCardNumber;
		this.address = address;
		this.fatherOrHusbandOF = fatherOrHusbandOF;
		this.initialAmountDeposit = initialAmountDeposit;
		this.martialStatus = martialStatus;
	}

	void addNewAccountUser() {
		System.out.println("----------------------------------");
		System.out.println("WELCOME TO THIS BANK");
		System.out.println("----------------------------------");
		System.out.println("Application Form");
		System.out.println("Make sure to fill All the Details");
		System.out.println("enter Account Holder Name");
		

	}

}
