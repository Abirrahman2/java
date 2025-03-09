package CLASSES;
import Interfaces.*;
public class Account implements IAccount{
private int accnum;
private double balance;
public void setAccNum(int accnum)
{
	this.accnum=accnum;
}
public int getAccNum()
{
	return accnum;
}
public void  setBalance(double balance)
{
	this.balance=balance;
}
public double getBalance()
{
	return balance;
}
public double transferMoney(Account a,int amount)
{
	if(balance>=amount){
	a.balance=a.balance+amount;
	this.balance=balance-amount;

	}
	else
	{
		System.out.println("NO SUFFICIENT BALANCE");
	}
	return balance;
}

}
