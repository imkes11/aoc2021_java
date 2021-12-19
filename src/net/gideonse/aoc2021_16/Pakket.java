package gideonse.aoc2021_16;

import java.util.List;

public abstract class Pakket {
    Integer versie;
    List<? extends Pakket> kinderen;

    public Pakket(Integer versie, List<? extends Pakket> kinderen) {
        this.versie = versie;
        this.kinderen = kinderen;
    }

    public Integer doeBerekening(List<? extends Pakket> kinderen) {
        return -2;
    }

    public Integer getVersie() {
        return versie;
    }

    public List<? extends Pakket> getKinderen() {
        return kinderen;
    }

    @Override
    public String toString() {
        return "Pakket{" +
                "versie=" + versie +
                ", kinderen=" + kinderen +
                '}';
    }
}
