package account;
import java.util.Date;

public class Account {
	double funds;
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	private double balance;
	private double rate;
	private Date date;

	public Account(int id, int balance, int rate) {
		super();
		this.id = id;
		this.balance = balance;
		this.rate = rate;
		this.date = new Date();	
	}
	public Account(){
		this(0,0,0);
	}
	public void Deposit(double funds){
		balance = balance + funds;
	}
	public void Withdraw(double funds) throws FundException{
		if(funds<=balance){
			balance= balance -funds;
		}
		else{
			double amount = funds - balance;
			throw new FundException(amount);
		}
	
	}
}
	
