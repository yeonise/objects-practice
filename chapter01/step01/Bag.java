package chapter01.step01;

public class Bag { // 관람객이 소지품을 보관할 가방
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) { // 초대장 없이 현금만 보관
        this(null, amount);
    }

    public Bag(Invitation invitation, Long amount) { // 현금과 초대장을 함께 보관
        this.invitation = invitation;
        this.amount = amount;
    }

    private boolean hasInvitation() { // 초대장의 보유 여부 판단
        return invitation != null;
    }

    public boolean hasTicket() { // 티켓의 보유 여부 판단
        return ticket != null;
    }

    private void setTicket(Ticket ticket) { // 초대장을 티켓으로 교환
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) { // 현금 감소
        this.amount -= amount;
    }

    public void plusAmount(Long amount) { // 현금 증가
        this.amount += amount;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
