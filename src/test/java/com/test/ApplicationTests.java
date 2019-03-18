package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Test
    public void enumTest() throws Exception{
//        CalculatorType code = CalculatorType.CALC_A;
//        long originValue = 10000L;
//        long result = code.caculate(originValue);
//
//        assertThat(result).isEqualTo(30000L);

//        CalculatorTypeJava7 code = CalculatorTypeJava7.CALC_A;
//        long originValue = 10000L;
//        long result = code.calculate(originValue);
//        assertThat(result).isEqualTo(10000L);

        PayType payType = PayType.ACCOUNT_TRANSFER;
        PayGroup payGroup = PayGroup.findByPayCode(payType);
        assertThat(payGroup.getTitle()).isEqualTo("카드");
    }
}
