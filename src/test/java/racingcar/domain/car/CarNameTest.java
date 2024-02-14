package racingcar.domain.car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.exception.InvalidInputException;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarNameTest {
    @ParameterizedTest
    @ValueSource(strings = {"일", "이이", "삼삼삼", "사사사사", "오오오오오"})
    void 자동차_이름이_정상_생성(String name) {
        //when
        CarName carName = new CarName(name);

        //then
        assertThat(carName.getName()).isEqualTo(name);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "   ", "육육육육육육"})
    void 자동차_이름의_길이가_유효하지_않으면_실패(String name) {
        // when
        assertThatThrownBy(() -> new CarName(name))
                .isInstanceOf(InvalidInputException.class);
    }
}