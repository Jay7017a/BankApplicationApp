package BankingApplication;

public interface AccountType {
	
	void savingsBankType(double initialDepositAmount);
	void cuurentBankType(double initialDepositAmount);
	void fixedDepositType(double initialDepositAmount);
}
