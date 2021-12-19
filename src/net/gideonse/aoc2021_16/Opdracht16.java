package gideonse.aoc2021_16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * a
 * zowaar nu doet ie het!!!
 * classes
 * siblings
 * nullen of lege vulling afhandeling hielp
 * <p>
 * OperatorPakket{versie=1, kinderen=[OperatorPakket{versie=1, kinderen=[LetterlijkPakket{letterlijkeWaarde='15', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='1113139631', versie=7, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='1153', versie=7, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='1114', versie=5, kinderen=[]}, OperatorPakket{versie=6, kinderen=[LetterlijkPakket{letterlijkeWaarde='150', versie=2, kinderen=[]}, OperatorPakket{versie=4, kinderen=[LetterlijkPakket{letterlijkeWaarde='1352', versie=7, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='129', versie=1, kinderen=[]}]}, OperatorPakket{versie=7, kinderen=[LetterlijkPakket{letterlijkeWaarde='7', versie=1, kinderen=[]}]}, OperatorPakket{versie=5, kinderen=[LetterlijkPakket{letterlijkeWaarde='1210410', versie=4, kinderen=[]}, OperatorPakket{versie=4, kinderen=[OperatorPakket{versie=2, kinderen=[LetterlijkPakket{letterlijkeWaarde='15', versie=5, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='11', versie=3, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='14', versie=6, kinderen=[]}, OperatorPakket{versie=6, kinderen=[LetterlijkPakket{letterlijkeWaarde='6', versie=0, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='11', versie=3, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='5', versie=0, kinderen=[]}]}]}]}]}, LetterlijkPakket{letterlijkeWaarde='9131', versie=5, kinderen=[]}, OperatorPakket{versie=7, kinderen=[LetterlijkPakket{letterlijkeWaarde='614158', versie=2, kinderen=[]}, OperatorPakket{versie=6, kinderen=[LetterlijkPakket{letterlijkeWaarde='12131013', versie=5, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='12131013', versie=7, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='21415', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='1441083', versie=5, kinderen=[]}, OperatorPakket{versie=2, kinderen=[LetterlijkPakket{letterlijkeWaarde='54', versie=5, kinderen=[]}, OperatorPakket{versie=0, kinderen=[LetterlijkPakket{letterlijkeWaarde='14101511103', versie=2, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='148513114', versie=0, kinderen=[]}]}, OperatorPakket{versie=3, kinderen=[LetterlijkPakket{letterlijkeWaarde='41461311', versie=6, kinderen=[]}, OperatorPakket{versie=7, kinderen=[LetterlijkPakket{letterlijkeWaarde='134', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='277', versie=7, kinderen=[]}]}, OperatorPakket{versie=4, kinderen=[OperatorPakket{versie=3, kinderen=[LetterlijkPakket{letterlijkeWaarde='130', versie=1, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='130', versie=6, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='13570', versie=2, kinderen=[]}]}]}, OperatorPakket{versie=4, kinderen=[LetterlijkPakket{letterlijkeWaarde='29', versie=0, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='109', versie=1, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='135', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='156', versie=7, kinderen=[]}, OperatorPakket{versie=2, kinderen=[OperatorPakket{versie=7, kinderen=[LetterlijkPakket{letterlijkeWaarde='22', versie=1, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='22', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='711410', versie=2, kinderen=[]}]}]}, OperatorPakket{versie=2, kinderen=[LetterlijkPakket{letterlijkeWaarde='601454139', versie=5, kinderen=[]}]}, OperatorPakket{versie=2, kinderen=[LetterlijkPakket{letterlijkeWaarde='354', versie=6, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='261221311113', versie=0, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='1', versie=3, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='9150139', versie=1, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='46', versie=3, kinderen=[]}, OperatorPakket{versie=6, kinderen=[LetterlijkPakket{letterlijkeWaarde='631519', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='31544414', versie=2, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='412101', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='139', versie=7, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='213', versie=3, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='12111314152', versie=4, kinderen=[]}, OperatorPakket{versie=0, kinderen=[LetterlijkPakket{letterlijkeWaarde='76', versie=1, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='610', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='1011', versie=0, kinderen=[]}]}, LetterlijkPakket{letterlijkeWaarde='1014111115', versie=3, kinderen=[]}, OperatorPakket{versie=4, kinderen=[OperatorPakket{versie=0, kinderen=[LetterlijkPakket{letterlijkeWaarde='21', versie=6, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='14511865110', versie=5, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='257111313', versie=2, kinderen=[]}, OperatorPakket{versie=4, kinderen=[LetterlijkPakket{letterlijkeWaarde='37', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='1051212', versie=3, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='6', versie=7, kinderen=[]}, OperatorPakket{versie=0, kinderen=[OperatorPakket{versie=3, kinderen=[OperatorPakket{versie=5, kinderen=[LetterlijkPakket{letterlijkeWaarde='15', versie=7, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='3', versie=6, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='6', versie=4, kinderen=[]}]}, OperatorPakket{versie=4, kinderen=[LetterlijkPakket{letterlijkeWaarde='5', versie=7, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='12', versie=6, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='5', versie=3, kinderen=[]}]}, LetterlijkPakket{letterlijkeWaarde='590286', versie=3, kinderen=[]}, OperatorPakket{versie=3, kinderen=[OperatorPakket{versie=7, kinderen=[LetterlijkPakket{letterlijkeWaarde='10109', versie=3, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='149811115', versie=2, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='60653123', versie=0, kinderen=[]}]}]}, OperatorPakket{versie=5, kinderen=[LetterlijkPakket{letterlijkeWaarde='93131513119', versie=2, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='13', versie=3, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='81031212141009', versie=0, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='5', versie=6, kinderen=[]}]}, OperatorPakket{versie=6, kinderen=[LetterlijkPakket{letterlijkeWaarde='9913890', versie=7, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='641112', versie=2, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='763', versie=3, kinderen=[]}]}, OperatorPakket{versie=5, kinderen=[LetterlijkPakket{letterlijkeWaarde='810', versie=5, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='797157', versie=6, kinderen=[]}, OperatorPakket{versie=7, kinderen=[LetterlijkPakket{letterlijkeWaarde='3', versie=6, kinderen=[]}]}, LetterlijkPakket{letterlijkeWaarde='10412', versie=4, kinderen=[]}, OperatorPakket{versie=1, kinderen=[LetterlijkPakket{letterlijkeWaarde='491110', versie=3, kinderen=[]}, OperatorPakket{versie=3, kinderen=[OperatorPakket{versie=3, kinderen=[LetterlijkPakket{letterlijkeWaarde='12', versie=7, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='5', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='12', versie=0, kinderen=[]}]}, OperatorPakket{versie=7, kinderen=[LetterlijkPakket{letterlijkeWaarde='8', versie=2, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='6', versie=7, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='11', versie=6, kinderen=[]}]}, LetterlijkPakket{letterlijkeWaarde='9', versie=3, kinderen=[]}, OperatorPakket{versie=7, kinderen=[OperatorPakket{versie=5, kinderen=[LetterlijkPakket{letterlijkeWaarde='2181112811', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='85', versie=5, kinderen=[]}]}, LetterlijkPakket{letterlijkeWaarde='1400', versie=1, kinderen=[]}, OperatorPakket{versie=1, kinderen=[LetterlijkPakket{letterlijkeWaarde='1463', versie=7, kinderen=[]}, OperatorPakket{versie=1, kinderen=[LetterlijkPakket{letterlijkeWaarde='1412842512', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='1412842512', versie=3, kinderen=[]}]}]}, OperatorPakket{versie=6, kinderen=[OperatorPakket{versie=4, kinderen=[LetterlijkPakket{letterlijkeWaarde='15', versie=6, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='4', versie=2, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='11', versie=0, kinderen=[]}, OperatorPakket{versie=4, kinderen=[LetterlijkPakket{letterlijkeWaarde='11', versie=3, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='12', versie=1, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='14', versie=6, kinderen=[]}, OperatorPakket{versie=6, kinderen=[LetterlijkPakket{letterlijkeWaarde='10', versie=6, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='10', versie=6, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='8', versie=2, kinderen=[]}]}]}]}]}, OperatorPakket{versie=1, kinderen=[OperatorPakket{versie=7, kinderen=[LetterlijkPakket{letterlijkeWaarde='4121', versie=2, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='97', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='8151283', versie=2, kinderen=[]}]}]}, LetterlijkPakket{letterlijkeWaarde='4', versie=7, kinderen=[]}, OperatorPakket{versie=3, kinderen=[LetterlijkPakket{letterlijkeWaarde='30', versie=5, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='111100', versie=7, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='51014082', versie=5, kinderen=[]}, OperatorPakket{versie=4, kinderen=[OperatorPakket{versie=6, kinderen=[LetterlijkPakket{letterlijkeWaarde='7', versie=2, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='12', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='5', versie=3, kinderen=[]}, OperatorPakket{versie=4, kinderen=[LetterlijkPakket{letterlijkeWaarde='13', versie=6, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='5', versie=5, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='15', versie=1, kinderen=[]}, OperatorPakket{versie=0, kinderen=[LetterlijkPakket{letterlijkeWaarde='7', versie=1, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='13', versie=5, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='9', versie=7, kinderen=[]}]}]}]}]}, OperatorPakket{versie=2, kinderen=[LetterlijkPakket{letterlijkeWaarde='104', versie=0, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='105', versie=2, kinderen=[]}]}, OperatorPakket{versie=6, kinderen=[LetterlijkPakket{letterlijkeWaarde='149111', versie=6, kinderen=[]}, OperatorPakket{versie=3, kinderen=[LetterlijkPakket{letterlijkeWaarde='14812', versie=2, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='149958', versie=1, kinderen=[]}]}, OperatorPakket{versie=7, kinderen=[OperatorPakket{versie=4, kinderen=[OperatorPakket{versie=0, kinderen=[OperatorPakket{versie=6, kinderen=[OperatorPakket{versie=1, kinderen=[OperatorPakket{versie=1, kinderen=[OperatorPakket{versie=3, kinderen=[OperatorPakket{versie=6, kinderen=[OperatorPakket{versie=6, kinderen=[OperatorPakket{versie=0, kinderen=[OperatorPakket{versie=2, kinderen=[OperatorPakket{versie=2, kinderen=[OperatorPakket{versie=7, kinderen=[OperatorPakket{versie=5, kinderen=[OperatorPakket{versie=4, kinderen=[OperatorPakket{versie=6, kinderen=[OperatorPakket{versie=4, kinderen=[OperatorPakket{versie=4, kinderen=[OperatorPakket{versie=1, kinderen=[OperatorPakket{versie=4, kinderen=[LetterlijkPakket{letterlijkeWaarde='131311', versie=7, kinderen=[]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}, OperatorPakket{versie=0, kinderen=[LetterlijkPakket{letterlijkeWaarde='2', versie=6, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='18111514', versie=3, kinderen=[]}, OperatorPakket{versie=3, kinderen=[LetterlijkPakket{letterlijkeWaarde='10144', versie=3, kinderen=[]}, OperatorPakket{versie=6, kinderen=[OperatorPakket{versie=2, kinderen=[LetterlijkPakket{letterlijkeWaarde='6', versie=7, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='9', versie=2, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='9', versie=1, kinderen=[]}]}, OperatorPakket{versie=0, kinderen=[LetterlijkPakket{letterlijkeWaarde='13', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='2', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='15', versie=1, kinderen=[]}]}]}]}, OperatorPakket{versie=4, kinderen=[LetterlijkPakket{letterlijkeWaarde='1465', versie=0, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='113914', versie=1, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='51', versie=2, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='1011514', versie=6, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='68121310', versie=5, kinderen=[]}, OperatorPakket{versie=0, kinderen=[OperatorPakket{versie=3, kinderen=[OperatorPakket{versie=3, kinderen=[LetterlijkPakket{letterlijkeWaarde='11', versie=1, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='9', versie=7, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='10', versie=1, kinderen=[]}, OperatorPakket{versie=5, kinderen=[LetterlijkPakket{letterlijkeWaarde='12', versie=1, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='5', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='14', versie=5, kinderen=[]}]}]}]}, LetterlijkPakket{letterlijkeWaarde='42', versie=4, kinderen=[]}, OperatorPakket{versie=1, kinderen=[LetterlijkPakket{letterlijkeWaarde='914', versie=3, kinderen=[]}, OperatorPakket{versie=5, kinderen=[LetterlijkPakket{letterlijkeWaarde='755124512', versie=2, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='135', versie=3, kinderen=[]}, OperatorPakket{versie=1, kinderen=[LetterlijkPakket{letterlijkeWaarde='1512141210132', versie=1, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='10', versie=0, kinderen=[]}]}, LetterlijkPakket{letterlijkeWaarde='114709105', versie=7, kinderen=[]}, OperatorPakket{versie=4, kinderen=[LetterlijkPakket{letterlijkeWaarde='1213', versie=4, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='613', versie=2, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='1111', versie=5, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='512', versie=7, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='915', versie=6, kinderen=[]}]}, OperatorPakket{versie=0, kinderen=[LetterlijkPakket{letterlijkeWaarde='7279', versie=7, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='893', versie=3, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='51448874', versie=3, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='391215972813', versie=0, kinderen=[]}]}, OperatorPakket{versie=3, kinderen=[OperatorPakket{versie=5, kinderen=[LetterlijkPakket{letterlijkeWaarde='771511', versie=6, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='771511', versie=1, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='1115131', versie=7, kinderen=[]}, OperatorPakket{versie=6, kinderen=[OperatorPakket{versie=4, kinderen=[LetterlijkPakket{letterlijkeWaarde='1470', versie=5, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='4131341203', versie=2, kinderen=[]}]}, LetterlijkPakket{letterlijkeWaarde='121045', versie=5, kinderen=[]}, OperatorPakket{versie=5, kinderen=[LetterlijkPakket{letterlijkeWaarde='11', versie=0, kinderen=[]}, LetterlijkPakket{letterlijkeWaarde='131015507', versie=0, kinderen=[]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}]}
 * resultaatA = 977
 * en?
 * eind = 2021-12-17T23:24:30.435290700
 * totale duur = 0
 */
public class Opdracht16 {
    public static void main(String... args) {
        System.out.println("Goedemorgen Imke");
        LocalDateTime begin = LocalDateTime.now();
        System.out.println("begin = " + begin);

        String filenaam = "C:\\JavaProjects\\aoc\\adventOfCode2021\\src\\net\\gideonse\\aoc2021_16\\data16.txt";
//        filenaam = "C:\\JavaProjects\\aoc\\adventOfCode2021\\src\\net\\gideonse\\aoc2021_16\\data16_12.txt";
//        filenaam = "C:\\JavaProjects\\aoc\\adventOfCode2021\\src\\net\\gideonse\\aoc2021_16\\data16_16.txt";
//        filenaam = "C:\\JavaProjects\\aoc\\adventOfCode2021\\src\\net\\gideonse\\aoc2021_16\\data16_23.txt";
//        filenaam = "C:\\JavaProjects\\aoc\\adventOfCode2021\\src\\net\\gideonse\\aoc2021_16\\data16_31.txt";
//        filenaam = "C:\\JavaProjects\\aoc\\adventOfCode2021\\src\\net\\gideonse\\aoc2021_16\\data16_2021.txt";
        if (args.length != 0) {
            filenaam = args[0];
        }
        System.out.println("filenaam = " + filenaam);


        try (Stream<String> regels = Files.lines(Paths.get(filenaam))) {
            System.out.println();
            System.out.println();
            System.out.println();
            String regel = regels.collect(Collectors.joining());


//            regel = "C200B40A82"; // finds the sum of 1 and 2, resulting in the value 3.
//            regel = "04005AC33890"; // finds the product of 6 and 9, resulting in the value 54.
//            regel = "880086C3E88112"; // finds the minimum of 7, 8, and 9, resulting in the value 7.
//            regel = "CE00C43D881120"; // finds the maximum of 7, 8, and 9, resulting in the value 9.
//            regel = "D8005AC2A8F0"; // produces 1, because 5 is less than 15.
//            regel = "F600BC2D8F"; // produces 0, because 5 is not greater than 15.
//            regel = "9C005AC2F8F0"; // produces 0, because 5 is not equal to 15.
//            regel = "9C0141080250320F1802104A08"; // produces 1, because 1 + 3 = 2 * 2.


            System.out.println("regel = " + regel);
            System.out.println("regel.length() = " + regel.length());
            final String binaireRegel = hexaOmzettenNaarBin(regel);
            System.out.println("binaireRegel = " + binaireRegel);
            System.out.println("binaireRegel.length() = " + binaireRegel.length());

            int resultaatA = -1;
            resultaatA = bepaalTotaalVersieNummers(binaireRegel);
            System.out.println("resultaatA = " + resultaatA + "\n\n\n");

            int resultaatB = bepaalBerekening(binaireRegel);
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

    private static int bepaalBerekening(String binaireRegel) {
        LinkedList<String> binaireLink = new LinkedList<>(Arrays.stream(binaireRegel.split("")).toList());

        List<Pakket> pakketten = bepaalPakketten(binaireLink, new ArrayList<>());
        System.out.println("/////////////en dat levert de pakketten");
        pakketten.forEach(System.out::println);
        System.out.println("met de bijbehorende classes");
        pakketten.forEach(pak -> System.out.println(pak.getClass()));

//        trek de boel weer recht in een andere recursie methode
//        pak alle pakketten van het hoofdpakket
//        neem hier de kinderen van als
//        if (pakketjes.stream().anyMatch(pakket -> pakket instanceof LetterlijkPakket)
//                && pakketjes.stream().anyMatch(pakket -> pakket instanceof AbstractOperatorPakket){
//          zet de AbstractOperatorPakket op een of andere manier een niveau hoger...
//        } else {
//          ga naar de kinderen van de kinderen
//        GA voor de zekerheid nog een keer door het hele pakket



        pakketten.stream()
                .map(pakket -> pakket.doeBerekening(pakket.getKinderen()))
                .forEach(System.out::println);
        return 0;
    }

    private static List<Pakket> bepaalPakketten(LinkedList<String> binaireLink, List<Pakket> pakketten) {
        if (binaireLink.isEmpty() || !binaireLink.stream().toList().contains("1")) {
            System.out.println("XXXXXXXXXXXXXXX " + binaireLink);
            return new ArrayList<>();
//            return pakketten;
        }
        final int versie = bepaalVersie(binaireLink); //110 100 101111111000101000
        System.out.println("versie = " + versie);
        final int type = bepaalType(binaireLink);
        System.out.println("type = " + type);
        Pakket nieuwPakket = null;

        switch (type) {
            case 0 -> nieuwPakket = new SomPakket(versie, aanmakenOperatorPakketKinderen(binaireLink, new ArrayList<>()));
            case 1 -> nieuwPakket = new VermenigvuldigingPakket(versie, aanmakenOperatorPakketKinderen(binaireLink, new ArrayList<>()));
            case 2 -> nieuwPakket = new MinimumPakket(versie, aanmakenOperatorPakketKinderen(binaireLink, new ArrayList<>()));
            case 3 -> nieuwPakket = new MaximumPakket(versie, aanmakenOperatorPakketKinderen(binaireLink, new ArrayList<>()));
            case 4 -> nieuwPakket = new LetterlijkPakket(bepaalCijferRecursie(binaireLink), versie, new ArrayList<>());
            case 5 -> nieuwPakket = new GroterDanPakket(versie, aanmakenOperatorPakketKinderen(binaireLink, new ArrayList<>()));
            case 6 -> nieuwPakket = new KleinerDanPakket(versie, aanmakenOperatorPakketKinderen(binaireLink, new ArrayList<>()));
            case 7 -> nieuwPakket = new GelijkAanPakket(versie, aanmakenOperatorPakketKinderen(binaireLink, new ArrayList<>()));
            default -> System.exit(-3);
        }
        pakketten.add(nieuwPakket);

        System.out.println("nieuwPakket = " + nieuwPakket);
        System.out.println("nieuwPakket.getKinderen() = " + nieuwPakket.getKinderen());

        if (binaireLink.stream().toList().contains("1")) {
            pakketten.addAll(bepaalPakketten(binaireLink, new ArrayList<>()));
        } else {
            System.out.print("b = " + binaireLink.size());
            System.out.println(" binaireLink = " + binaireLink);
//            pakketten = new ArrayList<>(); // <==
        }
        System.out.println("einde Opdracht16.bepaalPakketten met ");
        System.out.println("pakketten = " + pakketten);
        return pakketten;
    }

    private static List<? extends Pakket> aanmakenOperatorPakketKinderen(LinkedList<String> binaireLink, List<Pakket> pakketten) {
        final String lengteOfAantal = neemEerste(1, binaireLink);
        System.out.println("lengteOfAantal = " + lengteOfAantal);
        if ("0".equals(lengteOfAantal)) {
            System.out.print("--VASTE LENGTE ");
//                neem de 15 tekens en zet om naar lengte
            //                neem de lengte aan tekens en recursie daarbinnen
            final int aantal = Integer.parseInt(neemEerste(15, binaireLink), 2);
            System.out.println("aantal = " + aantal);
            LinkedList<String> subdeel = new LinkedList<>(Arrays.stream(neemEerste(aantal, binaireLink).split("")).toList());
            pakketten.addAll(bepaalPakketten(subdeel, new ArrayList<>()));
//            pakketten.add(new OperatorPakket(versie, bepaalPakketten(subdeel, new ArrayList<>())));
            if (subdeel.stream().toList().contains("1")) {
                System.out.println("__DE REST");
                pakketten.addAll(bepaalPakketten(subdeel, new ArrayList<>()));
            } else {
                System.out.print("subdeel.size() = " + subdeel.size());
                System.out.println(" subdeel = " + subdeel);
            }
        } else {
            System.out.println("==AANTAL SEQUENCES");
//                neem de 11 tekens en zet om naar aantal groepen
            final int verwachteAantalSubs = Integer.parseInt(neemEerste(11, binaireLink), 2);
            System.out.println("verwachteAantalSubs = " + verwachteAantalSubs);
//                begin de eerste groep te verwerken en herhaal tot totaal aantal groepen
            final List<Pakket> pakketjes = IntStream.range(0, verwachteAantalSubs).boxed()
                    .map(keer -> {
                        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%% keer = " + keer);
                        return bepaalPakketten(binaireLink, new ArrayList<>());
                    })
                    .flatMap(List::stream)
//                    .limit(verwachteAantalSubs)
                    .toList();
            System.out.print("het verwachteAantalSubs = " + verwachteAantalSubs);
            System.out.println(" pakketjes = " + pakketjes);

//            final List<Pakket> pakken;
//            if (verwachteAantalSubs != pakketjes.size()) {
//                pakken = pakketjes.stream()
//                        .limit(verwachteAantalSubs)
//                        .toList();
//            } else {
//                System.out.println("                 oooooooooooooooooooooooooooo  verwachteAantalSubs = " + verwachteAantalSubs);
//                pakken = new ArrayList<>(pakketjes);
//            }
//            pakketten.addAll(pakken);
            pakketten.addAll(pakketjes);
////            pakketten = pakketjes;
        }
        return pakketten;
    }


    private static List<? extends Pakket> verzamelPakketten(List<? extends Pakket> pakketten) {
        return pakketten.stream()
                .flatMap(pakket -> {
                    final List<Pakket> werkPakketten = new ArrayList<>();
                    werkPakketten.add(pakket);
                    werkPakketten.addAll(verzamelPakketten(pakket.kinderen));
                    return werkPakketten.stream();
                })
                .toList();
    }

    private static String bepaalCijferRecursie(LinkedList<String> binaireLink) {
        final String isLaatsteCijferBlok = neemEerste(1, binaireLink);
        if ("0".equals(isLaatsteCijferBlok)) {
//          neem de laatste vier tekens en stop ermee
            final String laatsteCijfer = String.valueOf(Integer.parseInt(neemEerste(4, binaireLink)));
//            return String.valueOf(Integer.parseInt(laatsteCijfer, 2));
            return laatsteCijfer;
        }
//      neem de volgende vier en check de beginbit
//        return Integer.parseInt(neemEerste(4, binaireLink), 2) + bepaalCijferRecursie(binaireLink);
        return neemEerste(4, binaireLink) + bepaalCijferRecursie(binaireLink);
    }

    private static Integer bepaalType(LinkedList<String> binaireLink) {
        String type = neemEerste(3, binaireLink);
        Integer typeInt = Integer.parseInt(type, 2);
        return typeInt;
    }

    private static int bepaalVersie(LinkedList<String> binaireLink) {
        String begin = neemEerste(3, binaireLink);
        final int versie = Integer.parseInt(begin, 2);
        return versie;
    }

    private static String neemEerste(int aantal, LinkedList<String> binaireLink) {
        StringBuilder test = new StringBuilder();
        for (int j = 0; j < aantal; j++) {
            test.append(binaireLink.pop());
        }
        return test.toString();
    }

    private static String hexaOmzettenNaarBin(String hexa) {
        final String bin = Arrays.stream(hexa.split(""))
                .map(letter -> Integer.toBinaryString(Integer.parseInt(letter, 16)))
                .map(reeks -> "000".substring(0, 4 - reeks.length()) + reeks)
                .collect(Collectors.joining(""));
        return bin;
    }

    private static int bepaalTotaalVersieNummers(String binaireRegel) {
        LinkedList<String> binaireLink = new LinkedList<>(Arrays.stream(binaireRegel.split("")).toList());

        List<Pakket> pakketten = bepaalVersieNummers(binaireLink, new ArrayList<>());
        System.out.println("en dat levert de pakketten");
        pakketten.forEach(System.out::println);

        final List<? extends Pakket> pakketLijst = verzamelPakketten(pakketten);
        final Integer totaal = pakketLijst.stream()
                .map(Pakket::getVersie)
                .reduce(0, Integer::sum);
        return totaal;
    }

    private static List<Pakket> bepaalVersieNummers(LinkedList<String> binaireLink, List<Pakket> pakketten) {
        if (binaireLink.isEmpty() || !binaireLink.stream().toList().contains("1")) {
            return new ArrayList<>();
        }
        final int versie = bepaalVersie(binaireLink); //110 100 101111111000101000
        if (4 == bepaalType(binaireLink)) {
            pakketten.add(new LetterlijkPakket(bepaalCijferRecursie(binaireLink), versie));
        } else {
            final String lengteOfAantal = neemEerste(1, binaireLink);
            if ("0".equals(lengteOfAantal)) {
//                neem de 15 tekens en zet om naar lengte
                //                neem de lengte aan tekens en recursie daarbinnen
                LinkedList<String> subdeel = new LinkedList<>(Arrays.stream(neemEerste(Integer.parseInt(neemEerste(15, binaireLink), 2), binaireLink).split("")).toList());
                pakketten.add(new OperatorPakket(versie, bepaalVersieNummers(subdeel, new ArrayList<>())));
                if (subdeel.stream().toList().contains("1")) {
                    pakketten.addAll(bepaalVersieNummers(subdeel, new ArrayList<>()));
                } else {
                    System.out.print("subdeel.size() = " + subdeel.size());
                    System.out.println(" subdeel = " + subdeel);
                }
            } else {
//                neem de 11 tekens en zet om naar aantal groepen
                final int verwachteAantalSubs = Integer.parseInt(neemEerste(11, binaireLink), 2);
//                begin de eerste groep te verwerken en herhaal tot totaal aantal groepen
                pakketten.add(new OperatorPakket(versie, IntStream.range(0, verwachteAantalSubs).boxed()
                        .map(keer -> bepaalVersieNummers(binaireLink, new ArrayList<>()))
                        .flatMap(List::stream)
                        .toList()));
            }
        }
        if (binaireLink.stream().toList().contains("1")) {
            pakketten.addAll(bepaalVersieNummers(binaireLink, new ArrayList<>()));
        } else {
            System.out.print("b = " + binaireLink.size());
            System.out.println(" binaireLink = " + binaireLink);
        }
        return pakketten;
    }

    private static void omschrijvingVoorbeeldA() {
        System.out.println("=========================================");
        System.out.println("vba = 8A004A801A8002F478 => 1000.1010.0000.0000.0100.1010.1000.0000.0001.1010.1000.0000.0000.0010.1111.0100.0111.1000");
        System.out.println("V 100");
        System.out.println("T 010");
        System.out.println("l/a 1");
        System.out.println("a 00000000001");
        System.out.println("V 001");
        System.out.println("T 010");
        System.out.println("l/a 1");
        System.out.println("a 00000000001");
        System.out.println("V 101");
        System.out.println("T 010");
        System.out.println("l/a 0");
        System.out.println("l 000000000001011");
        System.out.println("V 110");
        System.out.println("T 100");
        System.out.println("b? 0");
        System.out.println("1111 000");
        System.out.println("=========================================");
    }

    private static void omschrijvingVoorbeeldB() {
        System.out.println("=========================================");

        System.out.println(" vbb = 620080001611562C8802118E34 => 01100010000000001000000000000000000101100001000101010110001011001000100000000010000100011000111000110100");
        System.out.println("V 011");
        System.out.println("T 000");
        System.out.println("l/a 1");
        System.out.println("a 00000000010");
        System.out.println(" ");
        System.out.println("V 000");
        System.out.println("T 000");
        System.out.println("l/a 0");
        System.out.println("l 000000000010110");
        System.out.println("V 000 100 0 1010");
        System.out.println("V 101 100 0 1011");
        System.out.println(" ");
        System.out.println("V 001");
        System.out.println("T 000");
        System.out.println("l/a 1");
        System.out.println("a 00000000010");
        System.out.println(" ");
        System.out.println("V 000 100 0 1100");
        System.out.println("V 011 100 0 1101");
        System.out.println(" ");
        System.out.println(" 00");
        System.out.println("=========================================");

    }
}
