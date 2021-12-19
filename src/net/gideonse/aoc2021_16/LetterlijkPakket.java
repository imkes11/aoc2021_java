package gideonse.aoc2021_16;

import java.util.ArrayList;
import java.util.List;

public class LetterlijkPakket extends Pakket {
    String letterlijkeWaarde;


    /**
     * andere constructor voor de A opgave waar de letterlijkeWaarde nog niet uitmaakt
     */
    public LetterlijkPakket(String letterlijkeWaarde, Integer versie) {
        super(versie, new ArrayList<>());
        this.letterlijkeWaarde = letterlijkeWaarde;
    }

    public LetterlijkPakket(String letterlijkeWaarde, Integer versie, List<Pakket> kinderen) {
        super(versie, kinderen);
        this.letterlijkeWaarde = String.valueOf(Integer.parseInt(letterlijkeWaarde,2));
    }

    @Override
    public Integer doeBerekening(List<? extends Pakket> kinderen) {
        System.out.println("letterlijkeWaarde = " + letterlijkeWaarde);
        return Integer.valueOf(letterlijkeWaarde);
    }

    public String getLetterlijkeWaarde() {
        return letterlijkeWaarde;
    }

    public void setLetterlijkeWaarde(String letterlijkeWaarde) {
        this.letterlijkeWaarde = letterlijkeWaarde;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LetterlijkPakket that = (LetterlijkPakket) o;

        return letterlijkeWaarde.equals(that.letterlijkeWaarde);
    }

    @Override
    public int hashCode() {
        return letterlijkeWaarde.hashCode();
    }

    @Override
    public String toString() {
        return "LetterlijkPakket{" +
                "letterlijkeWaarde='" + letterlijkeWaarde + '\'' +
                ", versie=" + versie +
                ", kinderen=" + kinderen +
                '}';
    }
}
