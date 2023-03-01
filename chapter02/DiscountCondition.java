package chapter02;

public interface DiscountCondition { // 할인 조건 인터페이스
    boolean isSatisfiedBy(Screening screening);
}
