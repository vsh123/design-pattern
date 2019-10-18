package decorator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DecoratorPatternTest {

    @Test
    void 샷_추가_아메리카노() {
        Beverage beverage = new Americano("아메리카노", 1500);
        //아메리카노 + Shot을 한 값을 beverage에 넣는다
        beverage = new Shot(beverage, "샷 추가", 500);

        assertThat(beverage.cost()).isEqualTo(2000);
    }
}