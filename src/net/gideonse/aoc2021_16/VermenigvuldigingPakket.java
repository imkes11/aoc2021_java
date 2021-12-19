package gideonse.aoc2021_16;

import java.util.List;

public class VermenigvuldigingPakket extends AbstractOperatorPakket{
    public VermenigvuldigingPakket(Integer versie, List<? extends Pakket> kinderen) {
        super(versie, kinderen);
        System.out.println("Maak het keer pakket aan");
    }

    @Override
    public Long doeBerekening(List<? extends Pakket> kinderen) {
        final Long vermenigvuldiging = kinderen.stream()
                .map(kind -> kind.doeBerekening(kind.getKinderen()))
                .reduce(1L, (x1, x2) -> (null == x1 ? -1 : x1) * x2);
        System.out.print("VermenigvuldigingPakket.doeBerekening");
        System.out.println("                                                            vermenigvuldiging = " + vermenigvuldiging);
        return vermenigvuldiging;
    }

    @Override
    public String toString() {
        return "\nVermenigvuldigingPakket{" +
                "versie=" + versie +
                ", kinderen=" + kinderen +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "VermenigvuldigingPakket{}";
//    }
}
