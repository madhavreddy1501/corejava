package com.xyz.oops.inheritance;

//example abstraction
abstract class SenderAccount {
	abstract void sendingAmount();//method deccleration
}

class ReciverAccount extends SenderAccount{
	//method implementation
	@Override
	void sendingAmount() {
		int sendAccount = 3000;
		int reciveAccount = 2000;
		//Transaction 
		sendAccount = sendAccount - 2000;
		reciveAccount = reciveAccount + 2000;
		
		System.out.println("Sender Account amount "+sendAccount);
		System.out.println("Reciver Account amount "+reciveAccount);
	}
}
public class BankingAbstraction {
	public static void main(String[] args) {
		SenderAccount sendrefObject=(SenderAccount)new ReciverAccount();//up-casting
		sendrefObject.sendingAmount();
	}
}
