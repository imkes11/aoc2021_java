package gideonse.aoc2021_16;

import java.util.List;

public class MaximumPakket extends AbstractOperatorPakket{
    public MaximumPakket(Integer versie, List<? extends Pakket> kinderen) {
        super(versie, kinderen);
    }

    @Override
    public Integer doeBerekening(List<? extends Pakket> kinderen) {
        final Integer max = kinderen.stream()
                .map(kind -> kind.doeBerekening(kind.getKinderen()))
                .reduce(0, Integer::max);
        System.out.print("MaximumPakket.doeBerekening");
        System.out.println(" max = " + max);
        return max;
    }

    @Override
    public String toString() {
        return "MaximumPakket{}";
    }
}
