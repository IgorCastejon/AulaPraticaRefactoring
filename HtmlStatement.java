import java.util.Enumeration;

public class HtmlStatement extends Statement {
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
		return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
	}

	private String getRentalFigures(Rental aRental) {
		return aRental.getMovie().getTitle() + ": " + String.valueOf(aRental.getCharge()) + "<BR>\n";
	}

	private String getCustomerTotalCharge(Customer aCustomer) {
		return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
	}

	private String getCustomerPoints(Customer aCustomer) {
		return "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints())
				+ "</EM> frequent renter points<P>";
	}
}