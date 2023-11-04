package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class LottoFactory {

    private static final int LOTTO_SIZE = 6;
    private static final int MIN_LOTTO_NUMBER = 1;
    private static final int MAX_LOTTO_NUMBER = 45;

    public static List<LottoNumber> allLottoNumbers = new ArrayList<>();


    public Lotto createRandomLotto() {
        List<Integer> randomNumbers = Randoms.pickUniqueNumbersInRange(MIN_LOTTO_NUMBER, MAX_LOTTO_NUMBER, LOTTO_SIZE);
        Collections.sort(randomNumbers);
        return new Lotto(randomNumbers);
    }

    public List<Lotto> createRandomLottoUpto(int count) {
        IntStream.range(0, count)
                 .mapToObj(loopIndex -> createRandomLotto())
                 .toList();
    }




}
