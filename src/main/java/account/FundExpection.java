package account;



public class FundExpection extends Exception{

	private double funds;
	
	public double getFunds() {
		return funds;
	}
	public void setFunds(double funds) {
		this.funds = funds;
	}
	
}
