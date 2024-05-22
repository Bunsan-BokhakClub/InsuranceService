package insurance;

import contract.Contract;

public class Insurance {

	private int compensationAmount;
	private String cycleType;
	private String insuranceName;
	private String insuranceID;
	private int paymentAmount;
	private String paymentCycle;
	private String insurancePeriod;
	public Contract contract;

	public Insurance(){

	}

	public int getCompensationAmount() {
		return compensationAmount;
	}

	public String getCycleType() {
		return cycleType;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public String getInsuranceID() {
		return insuranceID;
	}

	public int getPaymentAmount() {
		return paymentAmount;
	}

	public String getPaymentCycle() {
		return paymentCycle;
	}

	public Contract getContract() {
		return contract;
	}

	public String getInsurancePeriod() {
		return insurancePeriod;
	}
}