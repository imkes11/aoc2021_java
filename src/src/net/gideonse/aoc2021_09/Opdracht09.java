package net.gideonse.aoc2021_09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * a ging goed nadat ik niet alle coord met nul waardes skipte, ipv alleen maar de negatieve
 * <p>
 * begin = 2021-12-09T10:38:11.218909700
 * filenaam = C:\JavaProjects\aoc\adventOfCode2021\src\net\gideonse\aoc2021_09\data09.txt
 * resultaat = 550
 * en?
 * eind = 2021-12-09T10:38:11.395832300
 * totale duur = 0
 *
 * b
 * gelukt met recursie!!!
 * leek niet te werken, maar dat kwam doordat ik niet ver genoeg in de logging doorkeek
 * en alles eerst leeg bleef tot we echt ergens waren...
 *
 * deGrootsteDrie = [Coord{x=60, y=86}=109, Coord{x=68, y=27}=102, Coord{x=89, y=23}=99]
 * totaalBasinProduct = 1100682
 * en?
 * eind = 2021-12-09T19:59:04.999886
 * totale duur = 0
 */
public class Opdracht09 {
    public static void main(String... args) {
        System.out.println("Goedemorgen Imke");
        LocalDateTime begin = LocalDateTime.now();
        System.out.println("begin = " + begin);
        String filenaam = "C:\\JavaProjects\\aoc\\adventOfCode2021\\src\\net\\gideonse\\aoc2021_09\\data09.txt";
        filenaam = "C:\\JavaProjects\\aoc\\adventOfCode2021\\src\\net\\gideonse\\aoc2021_09\\data09_15.txt";
        if (args.length != 0) {
            filenaam = args[0];
        }
        System.out.println("filenaam = " + filenaam);

        try (Stream<String> regels = Files.lines(Paths.get(filenaam))) {
            final List<String> landschapStrings = regels
                    .collect(Collectors.toList());

            int risicoResultaat = bepaalRisico(landschapStrings);

            System.out.println("resultaatA = " + risicoResultaat);
            System.out.println();
            System.out.println();
            System.out.println();

            long basinProduct = bepaalBasinProduct(landschapStrings);

            System.out.println("en?");
        } catch (IOException e) {
            e.printStackTrace();
        }

        LocalDateTime eind = LocalDateTime.now();
        System.out.println("eind = " + eind);
        long duur = eind.toEpochSecond(ZoneOffset.UTC) - begin.toEpochSecond(ZoneOffset.UTC);
        System.out.println("totale duur = " + duur);

    }

    private static long bepaalBasinProduct(List<String> landschapStrings) {
        final HashMap<Coord, Integer> landschap = vulLandschap(landschapStrings);
        final HashMap<Coord, Integer> basinGrootteMap = new HashMap<>();
        landschap.entrySet().stream()
                .filter(waarde -> waarde.getKey().x >= 0)
                .filter(waarde -> waarde.getKey().y >= 0)
                .forEach(punt -> {
                    if (isLaagstePunt(punt, landschap)) {
                        int basinGrootte = bepaalGrootteBasin(punt, landschap);
                        basinGrootteMap.put(punt.getKey(), basinGrootte);
                    }
                });

        // Aanname: de drie de grootste basins zijn niet gedeeltelijk dezelfde
        final List<Map.Entry<Coord, Integer>> deGrootsteDrie = basinGrootteMap.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry<Coord, Integer>::getValue).reversed())
                .limit(3).toList();
        System.out.println("deGrootsteDrie = " + deGrootsteDrie);
        final Long totaalBasinProduct = deGrootsteDrie.stream()
                .map(Map.Entry::getValue)
                .map(Long::valueOf)
                .reduce(1L, (g1, g2) -> g1 * g2);
        System.out.println("totaalBasinProduct = " + totaalBasinProduct);

        return totaalBasinProduct;
    }

    private static int bepaalGrootteBasin(Map.Entry<Coord, Integer> punt, HashMap<Coord, Integer> landschap) {
        Coord puntCoord = punt.getKey();
        System.out.print("#### puntCoord = " + puntCoord);
        final List<Coord> beginPuntLijst = new ArrayList<>();
        beginPuntLijst.add(punt.getKey());

        final List<Coord> coordsVanBasin = bekijkVierBurenLijst(landschap, beginPuntLijst);
        System.out.println(" coordsVanBasin.size() = " + coordsVanBasin.size());
        return coordsVanBasin.size();
    }

    private static List<Coord> bekijkVierBurenLijst(HashMap<Coord, Integer> landschap, List<Coord> huizen) {
        final List<Coord>[] buren = new List[]{new ArrayList<>()};
        final List<Coord> nieuweBuren = huizen.stream()
                .flatMap(huis -> {
                    buren[0] = bekijkVierBuren(landschap, huis);
                    buren[0].addAll(bekijkVierBurenLijst(landschap, buren[0]));
                    return buren[0].stream();
                })
                .toList();

        return nieuweBuren;
    }

    private static List<Coord> bekijkVierBuren(HashMap<Coord, Integer> landschap, Coord buur) {
        HashMap<Coord, Integer> werkLandschap = landschap;
        int xCoord = buur.x;
        int yCoord = buur.y;
        List<Coord> gewensteBuren = new ArrayList<>();
        final Coord links = new Coord(xCoord - 1, yCoord);
        if (landschap.containsKey(links) && werkLandschap.get(links) < 9) {
            gewensteBuren.add(links);
            werkLandschap.replace(links, 100);
        }
        final Coord rechts = new Coord(xCoord + 1, yCoord);
        if (landschap.containsKey(rechts) && werkLandschap.get(rechts) < 9) {
            gewensteBuren.add(rechts);
            werkLandschap.replace(rechts, 100);
        }
        final Coord boven = new Coord(xCoord, yCoord - 1);
        if (landschap.containsKey(boven) && werkLandschap.get(boven) < 9) {
            gewensteBuren.add(boven);
            werkLandschap.replace(boven, 100);
        }
        final Coord onder = new Coord(xCoord, yCoord + 1);
        if (landschap.containsKey(onder) && werkLandschap.get(onder) < 9) {
            gewensteBuren.add(onder);
            werkLandschap.replace(onder, 100);
        }
        landschap = werkLandschap;
        return gewensteBuren;
    }

    private static int bepaalRisico(List<String> landschapStrings) {
        final HashMap<Coord, Integer> landschap = vulLandschap(landschapStrings);
        AtomicInteger totaalRisico = new AtomicInteger(0);
        landschap.entrySet().stream()
                .filter(waarde -> waarde.getKey().x >= 0)
                .filter(waarde -> waarde.getKey().y >= 0)
                .forEach(punt -> {
                    if (isLaagstePunt(punt, landschap)) {
                        totaalRisico.updateAndGet(v -> v + punt.getValue() + 1);
                    }
                });
        return totaalRisico.get();
    }

    private static boolean isLaagstePunt(Map.Entry<Coord, Integer> punt, HashMap<Coord, Integer> landschap) {
        int minX = 0;
        int minY = 0;
        int maxX = landschap.get(new Coord(-10, 0)) - 1;
        int maxY = landschap.get(new Coord(0, -10)) - 1;
        int xCoord = punt.getKey().x;
        int yCoord = punt.getKey().y;
        int hoogte = punt.getValue();
        boolean laagst = true;
        if (xCoord > minX) {
            laagst = hoogte < landschap.get(new Coord(xCoord - 1, yCoord));
        }
        if (laagst && xCoord < maxX) {
            laagst = hoogte < landschap.get(new Coord(xCoord + 1, yCoord));
        }
        if (laagst && yCoord > minY) {
            laagst = hoogte < landschap.get(new Coord(xCoord, yCoord - 1));
        }
        if (laagst && yCoord < maxY) {
            laagst = hoogte < landschap.get(new Coord(xCoord, yCoord + 1));
        }

        return laagst;
    }

    private static HashMap<Coord, Integer> vulLandschap(List<String> landschapStrings) {
        final HashMap<Coord, Integer> coordHoogteHashMap = new HashMap<>();
        AtomicInteger y = new AtomicInteger();
        landschapStrings.stream()
                .forEach(regel -> {
                    AtomicInteger x = new AtomicInteger();
                    Arrays.stream(regel.split("")).forEach(hoogte -> {
                        coordHoogteHashMap.put(new Coord(x.get(), y.get()), Integer.parseInt(hoogte));
                        x.getAndIncrement();
                    });
                    y.getAndIncrement();
                });

        coordHoogteHashMap.put(new Coord(-10, 0), landschapStrings.get(0).length());
        coordHoogteHashMap.put(new Coord(0, -10), landschapStrings.size());
        return coordHoogteHashMap;
    }

    private static class Coord {
        Integer x;
        Integer y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Coord(String iks, String ei) {
            this.x = Integer.parseInt(iks);
            this.y = Integer.parseInt(ei);
        }

        public static boolean isHorizontaal(Coord begin, Coord eind) {
            return begin.y.equals(eind.y);
        }

        public static boolean isVertikaal(Coord begin, Coord eind) {
            return begin.x.equals(eind.x);
        }

        @Override
        public String toString() {
            return "Coord{x=" + x + ", y=" + y + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Coord coord = (Coord) o;

            if (!Objects.equals(x, coord.x)) return false;
            return Objects.equals(y, coord.y);
        }

        @Override
        public int hashCode() {
            int result = x != null ? x.hashCode() : 0;
            result = 31 * result + (y != null ? y.hashCode() : 0);
            return result;
        }
    }

}
