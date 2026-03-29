// Ticket Booking Class
class TicketBooking {
    int totalTickets = 10;

    // synchronized method
    synchronized void bookTicket(int num) {
        if (num <= totalTickets) {
            System.out.println(Thread.currentThread().getName() + " booked " + num + " tickets");
            totalTickets -= num;
            System.out.println("Remaining tickets: " + totalTickets);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Not enough tickets!");
        }
    }
}

// Customer Thread Class
class Customer extends Thread {
    TicketBooking tb;
    int tickets;

    Customer(TicketBooking tb, int tickets) {
        this.tb = tb;
        this.tickets = tickets;
    }

    public void run() {
        tb.bookTicket(tickets);
    }
}

// Main Class
class TicketDemo {
    public static void main(String[] args) {

        TicketBooking tb = new TicketBooking();

        Customer c1 = new Customer(tb, 6);
        Customer c2 = new Customer(tb, 5);

        c1.setName("Customer 1");
        c2.setName("Customer 2");

        c1.start();
        c2.start();
    }
}