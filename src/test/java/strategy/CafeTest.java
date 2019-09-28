package strategy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CafeTest {

    @Test
    void 평일의_아메리카노_가격을_확인한다() {
        int americanoPrice = 0;
        //Todo 이곳에 price를 구하는 로직을 구현해 주세요~

        //2000원의 20%할인된 가격이면 1600원이 나와야겠쬬?
        assertThat(americanoPrice).isEqualTo(1600);
    }

    @Test
    void 주말의_아메리카노_가격을_확인한다() {
        int americanoPrice = 0;
        //Todo 이곳에 price를 구하는 로직을 구현해 주세요~

        //2000원의 10%할인된 가격이면 1800원이 나와야겠쬬?
        assertThat(americanoPrice).isEqualTo(1800);
    }

    @Test
    void 평일의_아이스티_가격을_확인한다() {
        int iceTeaPrice = 0;
        //Todo 이곳에 price를 구하는 로직을 구현해 주세요~

        //1500원의 20%할인된 가격이면 1200원이 나와야겠쬬?
        assertThat(iceTeaPrice).isEqualTo(1200);
    }

    @Test
    void 주말의_아이스티_가격을_확인한다() {
        int iceTeaPrice = 0;
        //Todo 이곳에 price를 구하는 로직을 구현해 주세요~

        //1500원의 10%할인된 가격이면 1350원이 나와야겠쬬?
        assertThat(iceTeaPrice).isEqualTo(1350);
    }
}