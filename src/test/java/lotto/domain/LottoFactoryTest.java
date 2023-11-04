package lotto.domain;

import java.util.List;
import java.util.stream.IntStream;
import lotto.controller.LotteryStore;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LottoFactoryTest {



    LottoFactory lottoFactory = new LottoFactory();

    @DisplayName("주어진 갯수만큼 로또를 구매하는지 확인")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void 주어진_갯수만큼_로또를_구매하는지_확인(int count) {
        List<Lotto> lottos = lottoFactory.createRandomLottoUpto(count);

        Assertions.assertThat(lottos.size()).isEqualTo(count);
    }



}
