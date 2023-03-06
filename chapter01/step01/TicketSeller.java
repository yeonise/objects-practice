package chapter01.step01;

public class TicketSeller {
    private TicketOffice ticketOffice; // 자신이 일하는 매표소

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
