package gideonse.aoc2021_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * a
 * resultaatA = 319329
 *
 * b
 * resultaatB = 3515583998
 */
public class Opdracht10Compact {

    private static final Map<String, String> beginNaarEindMap =
            Map.of("(", ")",
                    "[", "]",
                    "{", "}",
                    "<", ">");
    private static final Map<String, Integer> tekenWaardeMap =
            Map.of(")", 3,
                    "]", 57,
                    "}", 1197,
                    ">", 25137);
    private static final Map<String, Integer> eindtekenWaardeMap =
            Map.of(")", 1,
                    "]", 2,
                    "}", 3,
                    ">", 4);

    public static void main(String... args) {
        System.out.println("Goedemorgen Imke");
        LocalDateTime begin = LocalDateTime.now();
        System.out.println("begin = " + begin);
        String filenaam = "C:\\JavaProjects\\aoc\\adventOfCode2021\\src\\net\\gideonse\\aoc2021_10\\data10.txt";
//        filenaam = "C:\\JavaProjects\\aoc\\adventOfCode2021\\src\\net\\gideonse\\aoc2021_10\\data10_26397.txt";
//        filenaam = "C:\\JavaProjects\\aoc\\adventOfCode2021\\src\\net\\gideonse\\aoc2021_10\\data10_1197.txt";
        if (args.length != 0) {
            filenaam = args[0];
        }
        System.out.println("filenaam = " + filenaam + "\n");

        try (Stream<String> regels = Files.lines(Paths.get(filenaam))) {
            final List<String> haakRegels = regels
                    .collect(Collectors.toList());

            int resultaatA = bepaalCorrupteErrorScore(haakRegels);
            System.out.println("resultaatA = " + resultaatA);

            long resultaatB = bepaalAutocompletionScore(haakRegels);
            System.out.println("resultaatB = " + resultaatB + "\n");

            System.out.println("en?");
        } catch (IOException e) {
            e.printStackTrace();
        }

        LocalDateTime eind = LocalDateTime.now();
        System.out.println("eind = " + eind);
        long duur = eind.toEpochSecond(ZoneOffset.UTC) - begin.toEpochSecond(ZoneOffset.UTC);
        System.out.println("totale duur = " + duur);

    }


    //
    //  A
    //

    private static int bepaalCorrupteErrorScore(List<String> haakRegels) {
        return haakRegels.stream()
                .map(Opdracht10Compact::bepaalCorruptTekenOfBeginString)
                .filter(resultaat -> resultaat.length() == 1)
                .map(Opdracht10Compact::bepaalTekenWaarde)
                .reduce(0, Integer::sum);
    }

    private static String bepaalCorruptTekenOfBeginString(String heleRegel) {
        List<String> hakenLijst = Arrays.stream(heleRegel.split("")).toList();
        final int aantalBeginHaken = hakenLijst.stream()
                .takeWhile(beginNaarEindMap::containsKey)
                .toList()
                .size();

        if (aantalBeginHaken == hakenLijst.size()) {
            return heleRegel;
        }
        if (beginNaarEindMap.get(hakenLijst.get(aantalBeginHaken - 1)).equals(hakenLijst.get(aantalBeginHaken))) {
            return bepaalCorruptTekenOfBeginString(heleRegel.substring(0, aantalBeginHaken - 1) + heleRegel.substring(aantalBeginHaken + 1));
        } else {
            return hakenLijst.get(aantalBeginHaken);
        }
    }

    private static int bepaalTekenWaarde(String corruptEindhaakje) {
        return tekenWaardeMap.get(corruptEindhaakje);
    }

    //
    //  B
    //
    private static long bepaalAutocompletionScore(List<String> haakRegels) {
        List<Long> totalen = haakRegels.stream()
                .map(Opdracht10Compact::bepaalCorruptTekenOfBeginString)
                .filter(resultaat -> resultaat.length() > 1)
                .map(Opdracht10Compact::bepaalRegelScore)
                .sorted()
                .toList();
        return totalen.get((totalen.size() - 1) / 2);
    }

    private static Long bepaalRegelScore(String haakjes) {
        return reverseString(haakjes).stream()
                .map(beginNaarEindMap::get)
                .map(haak -> Long.valueOf(eindtekenWaardeMap.get(haak)))
                .reduce(0L, (x1, x2) -> x1 * 5 + x2);
    }

    private static List<String> reverseString(String haakjes) {
        Stack<String> haakjesStack = new Stack<>();
        Arrays.stream(haakjes.split(""))
                .forEach(haakjesStack::push);
        return IntStream.range(0, haakjesStack.size()).boxed()
                .map(x -> haakjesStack.pop())
                .toList();
    }

}
