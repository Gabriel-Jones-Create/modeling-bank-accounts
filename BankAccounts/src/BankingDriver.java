
public class BankingDriver{
	public static void main(String[] args) {
	
		BankAccount nicksAcct = new BankAccount("Nick",450,550);
		BankAccount carolsAcct = new BankAccount("Carol", 600, 700);
		nicksAcct.printReport();
		carolsAcct.printReport();
		System.out.println("Total money in all accounts: $"+(nicksAcct.getCheckMoney()+nicksAcct.getSaveMoney()+carolsAcct.getCheckMoney()+carolsAcct.getSaveMoney()));
		nicksAcct.makeCheckingDeposit(100);
		nicksAcct.printReport();
		int nickChecking = nicksAcct.getCheckMoney();
		int nickSaving = nicksAcct.getSaveMoney();
		nicksAcct.makeCheckingWithdrawal(nickChecking);
		nicksAcct.makeSavingsWithdrawal(nickSaving);
		carolsAcct.makeCheckingDeposit(nickChecking);
		carolsAcct.makeCheckingDeposit(nickSaving);
		nicksAcct.printReport();
		carolsAcct.printReport();
		
	}
}
