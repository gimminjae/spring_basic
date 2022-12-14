package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountpolicyTest {
    RateDiscountpolicy rateDiscountpolicy = new RateDiscountpolicy();

    @Test
    @DisplayName("VIP회원은 10%할인을 받는다.")
    void vip1() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        int discount = rateDiscountpolicy.discount(member, 10000);

        //then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("BASIC 회원은 할인을 적용받지 않는다.")
    void vip2() {
        //given
        Member member = new Member(1L, "memberA", Grade.BASIC);

        //when
        int discount = rateDiscountpolicy.discount(member, 10000);

        //then
        assertThat(discount).isEqualTo(0);
    }
}