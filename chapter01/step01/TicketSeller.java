package chapter01.step01;

public class TicketSeller {
    private TicketOffice ticketOffice; // 자신이 일하는 매표소

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience); // 기존에 없던 새로운 의존성이 추가되었다.
    }
}
