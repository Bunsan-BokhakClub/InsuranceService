package employee;

import contract.Contract;
import employee.sellingRecord.SellingRecord;
import payment.Payment;

import java.util.ArrayList;

public class Employee {

	private String employeeID;
	private String employeeName;
	private String employeePhoneNumber;
	private String incidentDate;
	private String position;
	public ArrayList<SellingRecord> sellingRecordList;
	public Contract contract;
	public Payment payment;

	public Employee(){

	}

	public String getEmployeeID() {
		return employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeePhoneNumber() {
		return employeePhoneNumber;
	}

	public String getIncidentDate() {
		return incidentDate;
	}

	public String getPosition() {
		return position;
	}

	public ArrayList<SellingRecord> getSellingRecordList() {
		return sellingRecordList;
	}

	public Contract getContract() {
		return contract;
	}

	public Payment getPayment() {
		return payment;
	}
}