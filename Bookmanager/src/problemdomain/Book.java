package problemdomain;

public class book {
	
	private String ISBN;
	private String callNumber;
	private int available;
	private int total;
	private String title;

	public book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public book(String iSBN, String callNumber, int available, int total, String title) {
		super();
		ISBN = iSBN;
		this.callNumber = callNumber;
		this.available = available;
		this.total = total;
		this.title = title;
	}
	
	
	
	

}
