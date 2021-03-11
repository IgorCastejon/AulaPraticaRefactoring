import java.util.Enumeration;

public abstract class Statement {
	public String value(Customer aCustomer) {
		Enumeration rentals = aCustomer.getRentals();
		String result = this.getCustomerName(aCustomer);
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			// show figures for this rental
			result += this.getRentalFigures(each);
		}
		// add footer lines
		result += this.getCustomerTotalCharge(aCustomer);
		result += this.getCustomerPoints(aCustomer);
		return result;
	}

	protected abstract String getCustomerName(Customer aCustomer);
	protected abstract String getRentalFigures(Rental aRental);
	protected abstract String getCustomerTotalCharge(Customer aCustomer);
	protected abstract String getCustomerPoints(Customer aCustomer);
}