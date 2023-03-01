package chapter02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy { // 금액 할인 정책과 비율 할인 정책 사이의 중복 코드를 제거하기 위해 공통 코드를 보관
    private List<DiscountCondition> conditions = new ArrayList<>(); // 하나의 할인 정책은 여러 개의 할인 조건을 포함할 수 있다.

    public DefaultDiscountPolicy(DiscountCondition ... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        for(DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening Screening);
}

// 부모 클래스에 기본적인 알고리즘의 흐름을 구현하고 중간에 필요한 처리를 자식 클래스에게 위임하는 디자인 패턴을 template method 패턴이라고 부른다.
