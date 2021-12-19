package gideonse.aoc2021_16;

import java.util.List;

public class OperatorPakket extends Pakket {

    public OperatorPakket(Integer versie, List<? extends Pakket> kinderen) {
        super(versie, kinderen);
    }

    @Override
    public Long doeBerekening(List<? extends Pakket> kinderen) {
        return -1L;
    }

    @Override
    public String toString() {
        return "OperatorPakket{" +
                "versie=" + versie +
                ", kinderen=" + kinderen +
                '}';
    }
}
