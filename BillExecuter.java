class BillExecuter
{
	public static void main(String[] args)
	{
		Bill firstBill = new Bill();
		firstBill.billId = 1;
		firstBill.billAmount = 599.99;
		firstBill.isFinalBill = true;
		firstBill.isLatestBill = true;
		firstBill.billIssueDate = "02-03-2026";
		firstBill.billDueDate  = "03-03-2026";
		firstBill.isBillOverDue = false;
		firstBill.billInvoiceNo = "A123";
		System.out.println("the bill id is" + firstBill.billId);// gives the address
	}
}
