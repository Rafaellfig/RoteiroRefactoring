
import java.util.Enumeration;
import java.util.Vector;

public class Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = "Rental Record for " + aCustomer.getName() +
        "\n";
        while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();
           result += "\t" + each.getMovie().getTitle()+ "\t" +
           String.valueOf(each.getCharge()) + "\n";
        }
        result += "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
        return result;
     }
}
