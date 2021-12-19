package gideonse.aoc2021_16;

import java.util.List;
import java.util.Objects;

public class GelijkAanPakket extends AbstractOperatorPakket {
    public GelijkAanPakket(Integer versie, List<? extends Pakket> kinderen) {
        super(versie, kinderen);
        System.out.println("Maak het gelijk aan pakket aan");
    }

    @Override
    public Long doeBerekening(List<? extends Pakket> kinderen) {
        final List<Long> kleinkinderen = kinderen.stream()
                .map(kind -> kind.doeBerekening(kind.getKinderen())).toList();
        if(kleinkinderen.size() != 2){
            throw new RuntimeException("Het aantal kleinkinderen is " + kleinkinderen.size());
        }

        System.out.print("GelijkAanPakket.doeBerekening " + kleinkinderen.size());
        System.out.println(" kleinkinderen = " + kleinkinderen);
        System.out.println("                                                     gelijk aan = " + (Objects.equals(kleinkinderen.get(0), kleinkinderen.get(1)) ? 1 : 0));
        return Objects.equals(kleinkinderen.get(0), kleinkinderen.get(1)) ? 1L : 0L;
    }

    @Override
    public String toString() {
        return "\nGelijkAanPakket{" +
                "versie=" + versie +
                ", kinderen=" + kinderen +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "GelijkAanPakket{}";
//    }
}
