package complaint;

public class Complaint {

	private String content;
	private String customerID;

	public Complaint(String customerID, String content){
		this.customerID = customerID;
		this.content = content;
	}
}