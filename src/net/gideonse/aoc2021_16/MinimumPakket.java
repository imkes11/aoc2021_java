package gideonse.aoc2021_16;

import java.util.List;

public class MinimumPakket extends AbstractOperatorPakket{
    public MinimumPakket(Integer versie, List<? extends Pakket> kinderen) {
        super(versie, kinderen);
    }

    @Override
    public Integer doeBerekening(List<? extends Pakket> kinderen) {
        final Integer min = kinderen.stream()
                .map(kind -> kind.doeBerekening(kind.getKinderen()))
                .reduce(Integer.MAX_VALUE, Integer::min);
        System.out.print("MinimumPakket.doeBerekening");
        System.out.println(" min = " + min);
        return min;
    }

    @Override
    public String toString() {
        return "MinimumPakket{}";
    }
}
