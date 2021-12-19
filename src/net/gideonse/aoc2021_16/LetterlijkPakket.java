package gideonse.aoc2021_16;

import java.math.BigInteger;
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
//        System.out.println("uiteindelijke letterlijkeWaarde = " + letterlijkeWaarde);
        final BigInteger bigInteger = new BigInteger(letterlijkeWaarde, 2);
        if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            System.exit(-24);
        }

        this.letterlijkeWaarde = String.valueOf(Long.parseLong(letterlijkeWaarde,2));
    }

    @Override
    public Long doeBerekening(List<? extends Pakket> kinderen) {
        System.out.println("letterlijkeWaarde = " + letterlijkeWaarde);
        return Long.valueOf(letterlijkeWaarde);
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
//                ", kinderen=" + kinderen +
                '}';
    }
}
