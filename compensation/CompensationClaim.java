package compensation;

public class CompensationClaim {

	private int compensationClaimAmount;
	private String customerID;
	private String customerName;
	private String documentFile;
	private String insuranceID;
	private String insuranceName;
	private int contractID;
	public Survey survey;

	public CompensationClaim(){

	}

	public int getCompensationClaimAmount() {
		return compensationClaimAmount;
	}

	public String getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getDocumentFile() {
		return documentFile;
	}

	public String getInsuranceID() {
		return insuranceID;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public int getContractID() {
		return contractID;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}
}