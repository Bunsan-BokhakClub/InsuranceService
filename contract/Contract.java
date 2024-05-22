package contract;

import compensation.CompensationClaim;

public class Contract {

	private String address;
	private int age;
	private String birth;
	private int compensationAmount;
	private String concludeDate;
	private String contractDate;
	private int ContractID;
	private String customerID;
	private String customerName;
	private String customerStatus;
	private String cycleType;
	private String email;
	private String employeeID;
	private String employeeName;
	private String gender;
	private String insuranceID;
	private String insuranceName;
	private int paymentAmount;
	private int paymentCycle;
	private String phoneNumber;
	public CompensationClaim compensationClaim;

	public Contract(){

	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public String getBirth() {
		return birth;
	}

	public int getCompensationAmount() {
		return compensationAmount;
	}

	public String getConcludeDate() {
		return concludeDate;
	}

	public String getContractDate() {
		return contractDate;
	}

	public int getContractID() {
		return ContractID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerStatus() {
		return customerStatus;
	}

	public String getCycleType() {
		return cycleType;
	}

	public String getEmail() {
		return email;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getGender() {
		return gender;
	}

	public String getInsuranceID() {
		return insuranceID;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public int getPaymentAmount() {
		return paymentAmount;
	}

	public int getPaymentCycle() {
		return paymentCycle;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public CompensationClaim getCompensationClaim() {
		return compensationClaim;
	}
}