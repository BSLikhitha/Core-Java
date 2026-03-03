class Bill
{
	int billId;
	double billAmount;
	boolean isFinalBill;
	boolean isLatestBill;
	String billIssueDate;
	String billDueDate ;
	boolean isBillOverDue;
	String billInvoiceNo;
	
	Bill(){
		System.out.println("constructor is invoked");
	}
}