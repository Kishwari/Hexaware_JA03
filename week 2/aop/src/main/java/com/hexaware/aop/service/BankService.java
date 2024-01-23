package com.hexaware.aop.service;

import org.springframework.stereotype.Service;

import com.hexaware.aop.exception.InsufficientFundExp;

@Service
public class BankService {
	
	
	public void login() {
		
			System.out.println("Login Success ....");
		
	}
	

	public void deposit() {

		System.out.println("Amount Deposited successfully...");

	}

	public void withdraw() {

		System.out.println("Amount Withdraw Successfully..");

	}

	public void fundTransfer() {

		System.out.println("Fund Transfered Successfully..");

	}

	public int checkBalance(int acno) throws InsufficientFundExp {

		int balance = 0;

		if (acno > 0) {

			balance = 50000;
		}
		else {
			
			
			throw new InsufficientFundExp();
			
			
		}
		
		
		return balance;

	}

}