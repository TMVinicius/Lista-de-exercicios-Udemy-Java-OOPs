package entities;

public class Account {

	private int number;
	public String holder;
	private double balance;
	
	public Account() {
		
	}
	
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Account (int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public double depositValue(double amount) {
		return balance = balance + amount;
	}
	
	public double withdrawValue(double amount) {
		return balance = balance - amount;
	}
	
	
	public String toString() {
		return "\n" + "Updated account data: " + "\n" + "Account " + getNumber() + ", Holder: " + getHolder() + ", Balance: $ " +  String.format("%.2f", getBalance());
	}
}
