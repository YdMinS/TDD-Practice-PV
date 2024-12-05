package org.ydmins.calculator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.ydmins.calculator.calculate.PositiveNumber;

public class PositiveNumberTest {

    @DisplayName("0또는 음수를 전달할지 않습니다.")
    @ParameterizedTest()
    @ValueSource(ints = {0, -1})
    void createTest(int value){
        assertThatCode(()-> new PositiveNumber(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0또는 음수를 전달할 수 없습니다.");
    }
}
