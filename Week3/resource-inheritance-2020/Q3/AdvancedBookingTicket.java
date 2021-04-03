public class AdvancedBookingTicket extends Ticket {
    private int numDaysInAdvance;

    public AdvancedBookingTicket(String title, int numDaysInAdvance) {
        super(title); 
        this.numDaysInAdvance = numDaysInAdvance; 
    }

    @Override
    public double calculatePrice() {
        double originalPrice = super.calculatePrice(); 
        return Math.max(originalPrice - 0.50 * numDaysInAdvance, 0.50 * originalPrice); 
    }
}
