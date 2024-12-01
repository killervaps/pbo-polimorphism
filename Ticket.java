public abstract class Ticket {
    protected String passengerName;
    protected String flightNumber;
    protected double baseFare;

    public Ticket(String passengerName, String flightNumber, double baseFare) {
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.baseFare = baseFare;
    }

    public abstract double calculateFare();

    public String getTicketDetails() {
        return "Passenger: " + passengerName + ", Flight: " + flightNumber + ", Fare: " + calculateFare();
    }
}
