package chapter01.step01;

public class TicketSeller {
    private TicketOffice ticketOffice; // 자신이 일하는 매표소

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        if (audience.getBag().hasInvitation()) { // 소극장은 먼저 관람객의 가방에 초대장이 들어 있는지 확인한다.
            Ticket ticket = ticketOffice.getTicket(); // 초대장이 들어 있다면 판매원에게서 받은 티켓을
            audience.getBag().setTicket(ticket); // 관람객의 가방 안에 넣어준다.
        } else { // 초대장이 없다면
            Ticket ticket = ticketOffice.getTicket(); // 판매원에게서 티켓을 받아온다.
            audience.getBag().minusAmount(ticket.getFee()); // 관람객의 가방에서 티켓 금액만큼을 차감한 후에
            ticketOffice.plusAmount(ticket.getFee()); // 매표소에 금액을 증가시킨다.
            audience.getBag().setTicket(ticket); // 마지막으로 소극장은 관람객의 가방 안에 티켓을 넣어줌으로써 관람객의 입장 절차를 끝낸다.
        }
    }
}
