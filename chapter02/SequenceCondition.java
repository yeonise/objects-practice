package chapter02;

public class SequenceCondition implements DiscountCondition { // 상영 순번 조건에 따라 할인
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
