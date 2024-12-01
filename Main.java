public class Main {
    public static void main(String[] args) {
        Ticket economyTicket = new EconomyTicket("Alice", "FL123", 500.0);
        Ticket businessTicket = new BusinessTicket("Bob", "FL124", 800.0);
        Ticket firstClassTicket = new FirstClassTicket("Charlie", "FL125", 1200.0);

        System.out.println(economyTicket.getTicketDetails());
        System.out.println(businessTicket.getTicketDetails());
        System.out.println(firstClassTicket.getTicketDetails());
    }
}
