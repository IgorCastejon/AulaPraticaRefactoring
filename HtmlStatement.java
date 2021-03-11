public class HtmlStatement extends Statement {
	protected String getCustomerName(Customer aCustomer) {
		return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
	}

	protected String getRentalFigures(Rental aRental) {
		return aRental.getMovie().getTitle() + ": " + String.valueOf(aRental.getCharge()) + "<BR>\n";
	}

	protected String getCustomerTotalCharge(Customer aCustomer) {
		return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
	}

	protected String getCustomerPoints(Customer aCustomer) {
		return "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints())
				+ "</EM> frequent renter points<P>";
	}
}