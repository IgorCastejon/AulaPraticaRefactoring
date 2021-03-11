public class TextStatement extends Statement {
	protected String getCustomerName(Customer aCustomer) {
		return "Rental Record for " + aCustomer.getName() + "\n";
	}

	protected String getRentalFigures(Rental aRental) {
		return "\t" + aRental.getMovie().getTitle() + "\t" + String.valueOf(aRental.getCharge()) + "\n";
	}

	protected String getCustomerTotalCharge(Customer aCustomer) {
		return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
	}

	protected String getCustomerPoints(Customer aCustomer) {
		return "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
	}
}