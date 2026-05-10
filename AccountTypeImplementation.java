package BankingApplication;

import java.util.Scanner;

public class AccountTypeImplementation implements AccountType{
	double rate =1;
	double initialAmountDeposit;
	byte fixedDepositTime;
	@Override
	
	public void savingsBankType(double initialAmountDeposit) {
		if(initialAmountDeposit<=10000)
			rate=0.02f;
		else if(initialAmountDeposit<=100000)
			rate=0.05f;
		else if((initialAmountDeposit>100000)&&(initialAmountDeposit>=150000))
			rate=0.07f;
		else {
			System.out.println("Shifting Your Current Bank Account into CURRENT BANK TYPE ");
		}
	}
	@Override
	public void cuurentBankType(double initialAmountDeposit) {
		System.out.println("NOTE : no interst is added to your Total Amount");
		rate=1;
		}
	@Override
	public void fixedDepositType(double initialAmountDeposit) {
		System.out.println("FIXED DEPOSIT");
		
		System.out.println("How Many Years are you want to keep as fixed Deposit");
		fixedDepositTime=new Scanner(System.in).nextByte();
		
	}
	public AccountTypeImplementation() {
		
	}
	
	public AccountTypeImplementation( double initialAmountDeposit,String bankType) {
		switch(bankType.toLowerCase()) {
		case "savings"->savingsBankType(initialAmountDeposit);
		case "current"->cuurentBankType(initialAmountDeposit);
		case "fixeddeposit"->fixedDepositType(initialAmountDeposit);
		default ->System.out.println("choose Savings Account");
		}
		this.initialAmountDeposit = initialAmountDeposit;
	}
	
	
	
}
