package gideonse.aoc2021_16;

import java.util.List;

public class VermenigvuldigingPakket extends AbstractOperatorPakket{
    public VermenigvuldigingPakket(Integer versie, List<? extends Pakket> kinderen) {
        super(versie, kinderen);
        System.out.println("Maak het keer pakket aan");
    }

    @Override
    public Integer doeBerekening(List<? extends Pakket> kinderen) {
        final Integer vermenigvuldiging = kinderen.stream()
                .map(kind -> kind.doeBerekening(kind.getKinderen()))
                .reduce(1, (x1, x2) -> (null == x1 ? -1 : x1) * x2);
        System.out.print("VermenigvuldigingPakket.doeBerekening");
        System.out.println("                                                            vermenigvuldiging = " + vermenigvuldiging);
        return vermenigvuldiging;
    }

    @Override
    public String toString() {
        return "VermenigvuldigingPakket{}";
    }
}
