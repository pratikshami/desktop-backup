package com.emp;

import com.emp.account.Account;

public class Employee 
{
	private String name;

	private Account account;
	//private SalaryAccount account;
	//private DematAccount account;
	

	public Employee(String name)
	{
		this.name = name;
		//following line introduces the strong coupling between
		//Employee and one of the Account class i.e. SalaryAccount
        //account = new SalaryAccount();
	}

	public void withDrawFromAccount(int amt) // throws LowBalanceException 
	{
		account.withDraw(amt);
	}

	public String getName()
	{
		return this.name;
	}

	public void setAccount(Account account)
	{
		System.out.println("am inside setAccount(), the dependency is getting injected...");
		//here the dependent object Account has been injected into
		//this Employee class. Depending on XML configuration, any
		//subclass of Account can be injected into this Employee.
		this.account = account;


	}
}