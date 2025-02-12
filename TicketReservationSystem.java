class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private Ticket last;
    private int totalTickets;

    public TicketReservationSystem() {
        this.last = null;
        this.totalTickets = 0;
    }

    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (last == null) {
            last = newTicket;
            last.next = last;
        } else {
            newTicket.next = last.next;
            last.next = newTicket;
            last = newTicket;
        }
        totalTickets++;
    }

    public void removeTicket(int ticketId) {
        if (last == null) {
            System.out.println("No tickets to remove.");
            return;
        }
        Ticket current = last.next;
        Ticket previous = last;
        do {
            if (current.ticketId == ticketId) {
                if (current == last && current.next == last) {
                    last = null;
                } else {
                    previous.next = current.next;
                    if (current == last) {
                        last = previous;
                    }
                }
                totalTickets--;
                System.out.println("Ticket " + ticketId + " removed successfully.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != last.next);
        System.out.println("Ticket ID not found.");
    }

    public void displayTickets() {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Ticket current = last.next;
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer: " + current.customerName + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
            current = current.next;
        } while (current != last.next);
    }

    public void searchTicket(String keyword) {
        if (last == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Ticket current = last.next;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(keyword) || current.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Ticket Found - ID: " + current.ticketId + ", Customer: " + current.customerName + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != last.next);
        if (!found) {
            System.out.println("No matching ticket found.");
        }
    }

    public int getTotalTickets() {
        return totalTickets;
    }

    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        system.addTicket(101, "Alice", "Inception", "A1", "10:00 AM");
        system.addTicket(102, "Bob", "Interstellar", "B2", "12:00 PM");
        system.addTicket(103, "Charlie", "Inception", "A3", "10:00 AM");
        
        System.out.println("All Booked Tickets:");
        system.displayTickets();
        
        System.out.println("\nSearching for tickets for 'Inception':");
        system.searchTicket("Inception");
        
        System.out.println("\nRemoving Ticket ID 102");
        system.removeTicket(102);
        
        System.out.println("\nAll Booked Tickets after removal:");
        system.displayTickets();
        
        System.out.println("\nTotal Tickets: " + system.getTotalTickets());
    }
}
