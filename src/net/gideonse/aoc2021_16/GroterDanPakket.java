package gideonse.aoc2021_16;

import java.util.List;

public class GroterDanPakket extends AbstractOperatorPakket {
    public GroterDanPakket(Integer versie, List<? extends Pakket> kinderen) {
        super(versie, kinderen);
    }

    @Override
    public Integer doeBerekening(List<? extends Pakket> kinderen) {
        final List<Integer> kleinkinderen = kinderen.stream()
                .map(kind -> kind.doeBerekening(kind.getKinderen())).toList();
        assert kleinkinderen.size() == 2;

        System.out.print("GroterDanPakket.doeBerekening");
        System.out.println(" kleinkinderen = " + kleinkinderen);

        return kleinkinderen.get(0) > kleinkinderen.get(1) ? 1 : 0;
    }

    @Override
    public String toString() {
        return "GroterDanPakket{}";
    }
}
