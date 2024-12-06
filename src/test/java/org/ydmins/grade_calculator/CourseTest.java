package org.ydmins.grade_calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CourseTest {

    @DisplayName("과목(코스)를 생성한다.")
    @Test
    void createTest(){
        assertThatCode(()-> new Course("OOP", 3, "A+"))
                .doesNotThrowAnyException();
    }
}
