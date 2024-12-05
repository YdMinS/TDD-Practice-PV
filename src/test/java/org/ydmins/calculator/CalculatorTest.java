package org.ydmins.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {

    @DisplayName("덧센 연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")
    void additionTest(int operand1, String operator, int operand2, int result){
        int calculatedResult = Calculator.calculate(operand1, operator, operand2);
        Assertions.assertThat(calculatedResult).isEqualTo(result);
    }

    private static Stream<Arguments> formulaAndResult(){
        return Stream.of(
                Arguments.arguments(1, "+", 2, 3),
                Arguments.arguments(1, "-", 2, -1),
                Arguments.arguments(4, "*", 2, 8),
                Arguments.arguments(4, "/", 2, 2)
        );
    }
}
