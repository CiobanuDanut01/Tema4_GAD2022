package src.main;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "athletes.csv";
        InputStream is = null;
        try {
            is = new FileInputStream(fileName);
            AthleteReader reader = new AthleteReader();
            List<Athlete> athletes = reader.readAthletes(new FileReader(fileName));
//            AthletesParser parser = new AthletesParser();
//            List<Athlete> athletes = parser.parseAthletes(is);
            //int size = athletes.size();
            System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
            athletes.forEach(System.out::println);
            Collections.sort(athletes, new ComparatorResults());
            System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
            athletes.forEach(System.out::println);
            System.out.println("\nSo the order is:");
            System.out.println("WINNER: " + athletes.get(0).getAthleteName() + " cu un timp total(in secunde) de: " + athletes.get(0).getResult() );
            System.out.println("RUNNER-UP: " + athletes.get(1).getAthleteName() + " cu un timp total(in secunde) de: " + athletes.get(1).getResult() );
            System.out.println("THIRD PLACE: " + athletes.get(2).getAthleteName() + " cu un timp total(in secunde) de: " + athletes.get(2).getResult() );


        } finally {
            if (is != null) {
                is.close();
            }
        }
    }
}