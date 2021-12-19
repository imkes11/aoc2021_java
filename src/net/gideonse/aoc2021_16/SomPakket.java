package gideonse.aoc2021_16;

import java.math.BigInteger;
import java.util.List;

public class SomPakket extends AbstractOperatorPakket{
    public SomPakket(Integer versie, List<? extends Pakket> kinderen) {
        super(versie, kinderen);
        System.out.println("Maak het som pakket aan");
    }

    @Override
    public Long doeBerekening(List<? extends Pakket> kinderen) {
        final BigInteger bigInteger = kinderen.stream()
                .map(kind -> kind.doeBerekening((kind.getKinderen())))
                .map(BigInteger::valueOf)
                .reduce(BigInteger.ZERO, BigInteger::add);
        if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            System.exit(-22);
        }
        final Long som = kinderen.stream()
                .map(kind -> kind.doeBerekening(kind.getKinderen()))
                .reduce(0L, Long::sum);
        System.out.print("SomPakket.doeBerekening");
        System.out.print("                                                          som = " + som);
        System.out.println(" kinderen.size() = " + kinderen.size());
        System.out.println("kinderen = " + kinderen);
        return som;
    }

//    @Override
//    public String toString() {
//        return "SomPakket{}";
//    }


    @Override
    public String toString() {
        return "\nSomPakket{" +
                "versie=" + versie +
                ", kinderen=" + kinderen +
                '}';
    }
}
