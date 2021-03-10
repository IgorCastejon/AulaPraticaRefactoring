import java.util.Enumeration;

public class TextStatement extends Statement {
	public String value(Customer aCustomer) {
		Enumeration rentals = aCustomer.getRentals();
		String result = getCustomerName(aCustomer);
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			// show figures for this rental
			result += getRentalFigures(each);
		}
		// add footer lines
		result += getCustomerTotalCharge(aCustomer);
		result += getCustomerPoints(aCustomer);
		return result;
	}

	private String getCustomerName(Customer aCustomer) {
		return "Rental Record for " + aCustomer.getName() + "\n";
	}

	private String getRentalFigures(Rental aRental) {
		return "\t" + aRental.getMovie().getTitle() + "\t" + String.valueOf(aRental.getCharge()) + "\n";
	}

	private String getCustomerTotalCharge(Customer aCustomer) {
		return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
	}

	private String getCustomerPoints(Customer aCustomer) {
		return "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
	}
}