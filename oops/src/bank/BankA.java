package bank;

public class BankA implements Bank{ ////BankA is a class which implements the Bank Interface...
	//Declaration...
	int rs;
	
	//Parameterized constructor of BankA
	public BankA(int rs) {
		this.rs=rs;
	}

	@Override
	public int getBalance() {
		return rs;
		
		
	}

}