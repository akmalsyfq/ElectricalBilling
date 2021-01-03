package javaapplication20;

public class UserMethod {
	private int bilDate;
	private int accNumber;
	private double tax;
	private String userName;
	private String userAddress;
	private double arrears;
	private double noMeter;
	private double firstReading;
	private double lastReading;
	private double totalUsage;
	private double charge;
	private double totalBil;
	
	
	public UserMethod() {}
	
	public UserMethod(int bilDate, int accNumber, double tax, String userName, String userAddress, double arrears,
			double noMeter, double firstReading, double lastReading, double totalUsage, double charge,
			double totalBil) {
		this.bilDate = bilDate;
		this.accNumber = accNumber;
		this.tax = tax;
		this.userName = userName;
		this.userAddress = userAddress;
		this.arrears = arrears;
		this.noMeter = noMeter;
		this.firstReading = firstReading;
		this.lastReading = lastReading;
		this.totalUsage = totalUsage;
		this.charge = charge;
		this.totalBil = totalBil;
	}

	public int getBilDate() {
		return bilDate;
	}

	public void setBilDate(int bilDate) {
		this.bilDate = bilDate;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public double getArrears() {
		return arrears;
	}

	public double getNoMeter() {
		return noMeter;
	}
	
	public double getFirstReading() {
		return firstReading;
	}

	public double getLastReading() {
		return lastReading;
	}

	public double getTotalUsage() {
		this.totalUsage = this.lastReading - this.firstReading;
		return totalUsage;
	}
	
	public double getCharge() {
		return charge;
	}


	public void setCharge(double charge) {
		this.charge = charge;
	}


	public double getTotalBil() {
		return totalBil;
	}

	public void setTotalBil(double totalBil) {
		this.totalBil = totalBil;
	}

}//end class

