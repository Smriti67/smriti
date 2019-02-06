package com.cg.banking.client;

import java.util.Scanner;

import com.cg.banking.beans.Account;
import com.cg.banking.exceptions.AccountBlockedException;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.exceptions.BankingServicesDownException;
import com.cg.banking.exceptions.InsufficientAmountException;
import com.cg.banking.exceptions.InvalidAccountTypeException;
import com.cg.banking.exceptions.InvalidAmountException;
import com.cg.banking.exceptions.InvalidPinNumberException;
import com.cg.banking.services.BankingServices;
import com.cg.banking.services.BankingServicesImpl;

public class MainClass {
	static Scanner sc= new Scanner(System.in);
	static BankingServices services=new BankingServicesImpl();



	public static void main(String args[]) throws InvalidAmountException, InvalidAccountTypeException, BankingServicesDownException, AccountNotFoundException, AccountBlockedException, InsufficientAmountException, InvalidPinNumberException {
		mainScreen();
		int userChoice=sc.nextInt();
		startMenu(userChoice);
	}
	public static void startMenu(int userChoice) throws InvalidAmountException, InvalidAccountTypeException, BankingServicesDownException, AccountNotFoundException, AccountBlockedException, InsufficientAmountException, InvalidPinNumberException {
		switch(userChoice) {
		case 1: System.out.println("Enter the type of account you want to open:");
		System.out.println("Note: Savings or Current");
		String accountType=sc.next();
		System.out.println("Enter your client Balance");
		long initialBalance=sc.nextLong();
		Account account = services.openAccount(accountType,initialBalance);
		System.out.println("******ACCOUNT CREATED******");
		System.out.println(account);
		break;
		case 2:System.out.println("Enter the account number");
		long accountNumber=sc.nextLong();
		System.out.println(services.getAccountDetails(accountNumber));
		break;
		case 3: System.out.println(services.getAllAccountDetails());
		break;
		case 4:  System.out.println("Enter the account number:");
		long accountNoDeposit = sc.nextLong();
		System.out.println("Enter the amount to deposit:");
		float amountToDeposit=sc.nextFloat();
		System.out.println(services.depositAmount(accountNoDeposit, amountToDeposit));
		break;
		case 5: System.out.println("Enter the account number:");
		long accountNoWithdraw = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the amount :");
		float amountToWithdraw = sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter the PIN number please:");
		int pinNumber = sc.nextInt();
		System.out.println(services.withdrawAmount(accountNoWithdraw, amountToWithdraw, pinNumber));
		break;
		case 6:System.out.println("Enter the account of Receiver:");
		long accountNoTo=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the account Number of Sender:");
		long accountNoFrom=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the transfer amout:");
		float transferAmount=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter the pin number :");
		int  pinNumber1=sc.nextInt();
		System.out.println(services.fundTransfer(accountNoTo, accountNoFrom, transferAmount, pinNumber1));
		break;


		default: 
			System.out.println("Invalid Choice,Please Try Again!!!!!!");
		}
		System.out.println("What do you want to do now ?");
		System.out.println("1. Continue");
		System.out.println("2. Exit");
		int choice =sc.nextInt();
		if(choice==2)
			System.exit(0);
		main(null);
	}
	public static void mainScreen(){
		System.out.println("__________________________________Welcome to My Bank__________________________________");
		System.out.println("Please enter any one of the given choices :");
		System.out.println("1. Create a account");
		System.out.println("2. Get your account details");
		System.out.println("3. Get all account details");
		System.out.println("4. Deposit Money");
		System.out.println("5. Withdraw Money");
		System.out.println("6. Fund Transfer\n\n\n");
	}

}
