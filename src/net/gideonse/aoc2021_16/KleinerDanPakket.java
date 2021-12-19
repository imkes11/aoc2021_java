package gideonse.aoc2021_16;

import java.util.List;

public class KleinerDanPakket extends AbstractOperatorPakket {
    public KleinerDanPakket(Integer versie, List<? extends Pakket> kinderen) {
        super(versie, kinderen);
    }

    @Override
    public Long doeBerekening(List<? extends Pakket> kinderen) {
        final List<Long> kleinkinderen = kinderen.stream()
                .map(kind -> kind.doeBerekening(kind.getKinderen())).toList();
        assert kleinkinderen.size() == 2;

        System.out.print("KleinerDanPakket.doeBerekening");
        System.out.println(" kleinkinderen = " + kleinkinderen);

        return kleinkinderen.get(0) < kleinkinderen.get(1) ? 1L : 0L;
    }

    @Override
    public String toString() {
        return "KleinerDanPakket{}";
    }
}
