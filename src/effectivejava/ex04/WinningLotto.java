package effectivejava.ex04;

import java.util.List;

public class WinningLotto extends Lotto{
    public WinningLotto(List<Integer> lottoNumbers) {
        super(lottoNumbers);
    }
    public long compare(Lotto lotto){
        return lottoNumbers.stream()
                .filter(lotto::contains)
                .count();
    }
}
