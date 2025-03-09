package Interfaces;
import CLASSES.*;
import java.lang.*;
public interface IAccount{
	void setAccNum(int accnum);
	int getAccNum();
	void setBalance(double balance);
	double getBalance();
	double transferMoney(Account a,int amount);
	
}