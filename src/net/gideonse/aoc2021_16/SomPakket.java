package gideonse.aoc2021_16;

import java.util.List;

public class SomPakket extends AbstractOperatorPakket{
    public SomPakket(Integer versie, List<? extends Pakket> kinderen) {
        super(versie, kinderen);
        System.out.println("Maak het som pakket aan");
    }

    @Override
    public Integer doeBerekening(List<? extends Pakket> kinderen) {
        final Integer som = kinderen.stream()
                .map(kind -> kind.doeBerekening(kind.getKinderen()))
                .reduce(0, Integer::sum);
        System.out.print("SomPakket.doeBerekening");
        System.out.print("                                                          som = " + som);
        System.out.println(" kinderen.size() = " + kinderen.size());
        System.out.println("kinderen = " + kinderen);
        return som;
    }

    @Override
    public String toString() {
        return "SomPakket{}";
    }
}
