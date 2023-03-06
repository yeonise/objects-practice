package chapter01.step01;

public class Audience {
    private Bag bag; // 관객은 소지품을 보관하기 위해 가방을 소지할 수 있다.

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
