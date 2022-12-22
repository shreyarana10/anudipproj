package bank;

public class BankB implements Bank{//BankB is a class which implements the Bank Interface...
	
	
		
		//Declaration...
		int rs;
		
		//Parameterized constructor of BankB
		public BankB(int rs) {
			this.rs=rs;
		}
		@Override
		public int getBalance() {
			
			return rs;
			
			
		}

	}

