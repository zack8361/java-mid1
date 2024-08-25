package effectivejava.ex04;

import java.util.ArrayList;
import java.util.List;

public class Lotto {
    protected List<Integer> lottoNumbers;

    public Lotto(List<Integer> lottoNumbers) {
        this.lottoNumbers = new ArrayList<>(lottoNumbers);
    }
    public boolean contains(Integer lottoNumber){
        return lottoNumbers.contains(lottoNumber);
    }
}
