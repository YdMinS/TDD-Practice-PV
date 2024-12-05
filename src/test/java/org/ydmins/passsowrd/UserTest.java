package org.ydmins.passsowrd;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ydmins.password.User;

class UserTest {

    @DisplayName("패스워드 초기화한다.")
    @Test
    void passwordTest() {
        // given
        User user = new User();
        //when
//        user.initPassword(new CorrectFixedPasswordGenerator());
        user.initPassword(() -> "abcdefghi");
        // then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화 되지 않는다.")
    @Test
    public void passwordTest2() {
        // given
        User user = new User();
        //when
//        user.initPassword(new WrongFixedPasswordGenerator());
        user.initPassword(() -> "ab");
        // then
        assertThat(user.getPassword()).isNull();
    }
}