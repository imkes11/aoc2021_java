package gideonse.aoc2021_16;

import java.util.List;

public class AbstractOperatorPakket extends Pakket{
    public AbstractOperatorPakket(Integer versie, List<? extends Pakket> kinderen) {
        super(versie, kinderen);
    }
}
