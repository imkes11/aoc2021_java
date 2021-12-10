package net.gideonse.aoc2021_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
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
public class Opdracht10 {


    private static Map<String, String> beginNaarEindMap =
            Map.of("(", ")",
                    "[", "]",
                    "{", "}",
                    "<", ">");
    private static Map<String, Integer> tekenWaardeMap =
            Map.of(")", 3,
                    "]", 57,
                    "}", 1197,
                    ">", 25137);
    private static Map<String, Integer> eindtekenWaardeMap =
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
        System.out.println("filenaam = " + filenaam);

        try (Stream<String> regels = Files.lines(Paths.get(filenaam))) {
            final List<String> haakRegels = regels
                    .collect(Collectors.toList());

            int resultaatA = bepaalCorrupteErrorScore(haakRegels);
            System.out.println("resultaatA = " + resultaatA);
            System.out.println();
            System.out.println();
            System.out.println();

            long resultaatB = -1;
            resultaatB = bepaalAutocompletionScore(haakRegels);
            System.out.println("resultaatB = " + resultaatB);
            System.out.println("en?");
        } catch (IOException e) {
            e.printStackTrace();
        }

        LocalDateTime eind = LocalDateTime.now();
        System.out.println("eind = " + eind);
        long duur = eind.toEpochSecond(ZoneOffset.UTC) - begin.toEpochSecond(ZoneOffset.UTC);
        System.out.println("totale duur = " + duur);

    }

    private static long bepaalAutocompletionScore(List<String> haakRegels) {
        List<Long> totalen = haakRegels.stream()
                .map(Opdracht10::bepaalEenbareTekens)
                .filter(Objects::nonNull)
                .map(Opdracht10::bepaalEenScore)
                .sorted()
                .toList();
        System.out.println("totalen = " + totalen);
        final int teller = (totalen.size() - 1) / 2;
        Long completionScore = totalen.get(teller);
        System.out.println("completionScore = " + completionScore);
        return completionScore;
    }

    private static Long bepaalEenScore(String haakjes) {
        return reverseString(haakjes).stream()
                .map(haakje -> beginNaarEindMap.get(haakje))
                .map(haak -> Long.valueOf(eindtekenWaardeMap.get(haak)))
                .reduce(0L, (x1, x2) -> x1 * 5 + x2);
    }

    private static List<String> reverseString(String haakjes) {
        Stack<String> haakjesStack = new Stack<>();
        Arrays.stream(haakjes.split(""))
                .forEach(haakjesStack::push);
        final String andersom = IntStream.range(0, haakjesStack.size()).boxed()
                .map(x -> haakjesStack.pop())
                .collect(Collectors.joining());
        return Arrays.stream(andersom.split("")).toList();
    }

    private static int bepaalCorrupteErrorScore(List<String> haakRegels) {
        final Integer errorScore = haakRegels.stream()
                .map(Opdracht10::bepaalOptioneelCorruptTeken)
                .filter(Objects::nonNull)
                .map(Opdracht10::bepaalTekenWaarde)
                .reduce(0, Integer::sum);
        System.out.println("errorScore = " + errorScore);
        return errorScore;
    }


    private static String bepaalEenbareTekens(String heleRegel) {
        System.out.print("1 heleRegel = " + heleRegel);
        List<String> hakenLijst = Arrays.stream(heleRegel.split("")).toList();
        final List<String> test = hakenLijst.stream()
                .takeWhile(haak -> beginNaarEindMap.containsKey(haak))
                .toList();
        System.out.print(" test.size() = " + test.size());
        System.out.println(" test = " + test);
        if (test.size() == hakenLijst.size()) {
            System.out.println("==> heleRegel = " + heleRegel);
            return heleRegel;
        }
        if (beginNaarEindMap.get(hakenLijst.get(test.size() - 1)).equals(hakenLijst.get(test.size()))) {
            return bepaalEenbareTekens(heleRegel.substring(0, test.size() - 1) + heleRegel.substring(test.size() + 1));
        } else {
            return null;
        }
    }

    private static String bepaalOptioneelCorruptTeken(String heleRegel) {
        System.out.println("heleRegel = " + heleRegel);
        List<String> hakenLijst = Arrays.stream(heleRegel.split("")).toList();
        final List<String> test = hakenLijst.stream()
                .takeWhile(haak -> beginNaarEindMap.containsKey(haak))
                .toList();
        if (test.size() == hakenLijst.size()) {
            return null;
        }
        if (beginNaarEindMap.get(hakenLijst.get(test.size() - 1)).equals(hakenLijst.get(test.size()))) {
            return bepaalOptioneelCorruptTeken(heleRegel.substring(0, test.size() - 1) + heleRegel.substring(test.size() + 1));
        } else {
            return hakenLijst.get(test.size());
        }
    }

    private static String bepaalOptioneelCorruptTekenMetSout(String heleRegel) {
        System.out.println("heleRegel = " + heleRegel);
        List<String> hakenLijst = Arrays.stream(heleRegel.split("")).toList();
        final List<String> test = hakenLijst.stream()
                .takeWhile(haak -> beginNaarEindMap.containsKey(haak))
                .toList();
        System.out.println("test      = " + test.stream().collect(Collectors.joining("")));
        if (test.size() == hakenLijst.size()) {
            System.out.println("ze zijn gelijke lengte");
            return null;
        }
        if (beginNaarEindMap.get(hakenLijst.get(test.size() - 1)).equals(hakenLijst.get(test.size()))) {
            return bepaalOptioneelCorruptTeken(heleRegel.substring(0, test.size() - 1) + heleRegel.substring(test.size() + 1));
        } else {
            System.out.println("corrupte waarde in hakenLijst.get(test.size()) = " + hakenLijst.get(test.size()));
            return hakenLijst.get(test.size());
        }
    }

    private static int bepaalTekenWaarde(String corruptEindhaakje) {
        final Integer tekenwaarde = tekenWaardeMap.get(corruptEindhaakje);
        System.out.println("tekenwaarde = " + tekenwaarde);
        return tekenwaarde;
    }


}
