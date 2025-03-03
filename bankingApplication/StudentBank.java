/* This is a basic banking application that shows the balance, withdraws and deposit cash
 *Author: Aravind Santha
 *Collge:Algonquin college,Ottawa
 *Date : Jan 21, 2024
 *Description: A simple banking application that shows the balance, withdraws and deposit cash
 *
 */

public class StudentBank {
	//variables
	private double balance;
	private String name;

	/*default constructor, the this.balance =0.0 was set
	 *  to intial blance to zero to prevent errors*/
	public StudentBank() {
		this.balance =0.0;
	}

	//constructor
	public void Studentbank(double balance, String name) {
		this.balance = balance;
		this.name = name;
	}
	//getters and setters
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;

	}
//this method ensures that the amount added is updated with valid positive amounts
	public void addMoney(double amount) {
		if (amount >0) {
			balance += amount;
			System.out.println("we have added $"+ amount + " to your account. ");
		}
	}
	//this method ensures that the amount withdrawn is updated and shown the reamining amount.

	public void withdrawMoney(double amount) {
		if (amount> 0 && amount <= balance) {
			balance -= amount;
			System.out.println("You have withdrawed $" + amount + " from your account: " + name );
		} else {
			System.out.println("Sorry you have insufficient funds");
		}
	}
	//this method ensures the balance shown
	public void checkbalance() {
		System.out.println("Dear " + name + "Your current balance is $" + balance + name );
	}
}
