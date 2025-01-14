package racingcar.domain.car;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class PositionTest {
    @Test
    void 위치를_이동한다() {
        // given
        final int value = 0;
        final Position position = new Position(value);

        // when
        position.forward();

        // then
        assertThat(position.getValue()).isEqualTo(value + 1);
    }

    @Test
    void 위치를_비교한다() {
        // given
        final Position position1 = new Position(1);
        final Position position2 = new Position(2);

        // when & then
        assertThat(position1.compareTo(position2)).isEqualTo(-1);
        assertThat(position2.compareTo(position1)).isEqualTo(1);
        assertThat(position1.compareTo(position1)).isEqualTo(0);
    }

}
