package BankingApplication;

import java.util.Scanner;

public abstract class UserLogin extends AccountTypeImplementation{
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

		this(accountHolderName, adharCardNumber, "savings", 0.0, address, fatherOrHusbandOF, mobileNumber,
				"single");
	}

	public UserLogin(String accountHolderName, long adharCardNumber, String bankType, double initialAmountDeposit,
			String address, String fatherOrHusbandOF, long mobileNumber, String martialStatus) {
		this(accountHolderName, adharCardNumber, bankType, initialAmountDeposit, null, address, fatherOrHusbandOF,
				mobileNumber, martialStatus);

	}

	public UserLogin(String accountHolderName, long adharCardNumber, String bankType, double initialAmountDeposit,
			String pANCardNumber, String address, String fatherOrHusbandOF, long mobileNumber, String martialStatus) {
		super(initialAmountDeposit,bankType);
		this.accountHolderName = accountHolderName;
		this.mobileNumber = validationCheckingMobile(mobileNumber);
		this.adharCardNumber = validationCheckingAdhar(adharCardNumber);
		this.bankType = bankType;
		this.PANCardNumber = validationCheckingPAN(pANCardNumber);
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

	 long validationCheckingMobile(long mobileNumber) {
		if (String.valueOf(mobileNumber).matches("[0-9]{10}")) {
			return mobileNumber;
		} else {

			throw new IllegalArgumentException("Invalid Mobile Number");
		}
	}

	long validationCheckingAdhar(long adharCardNumber) {
		if (String.valueOf(adharCardNumber).matches("[0-9]{12}")) {
			return adharCardNumber;

		} else {
			throw new IllegalArgumentException("Invalid PAN Card Number");
		}
	}

	String validationCheckingPAN(String PANCardNumber) {
		if (PANCardNumber.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			return PANCardNumber;
		}
		else {
			throw new IllegalArgumentException("Invalid PAN Card Number");
		}
	}

}
