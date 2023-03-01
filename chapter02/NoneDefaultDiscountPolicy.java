package chapter02;

public class NoneDefaultDiscountPolicy extends DefaultDiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening Screening) {
        return Money.ZERO;
    }
}
// NoneDiscountPolicy 클래스를 추가함으로써 할인 정책이 없는 경우를 예외 케이스로 취급하지 않으면서 할인 요금을 계산할 책임을 그대로 DiscountPolicy 계층에 유지시킨다.
