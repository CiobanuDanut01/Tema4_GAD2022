package src.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class AthleteReader {
    public List<Athlete> readAthletes(Reader reader) throws IOException {
        ArrayList<Athlete> athletes = new ArrayList<Athlete>();
        BufferedReader bufReader = new BufferedReader(reader);
        String line = bufReader.readLine();
        while(line != null){
            String[] tokens = line.split(",");
            Athlete athlete = new Athlete(Integer.parseInt(tokens[0]),tokens[1],
                    tokens[2], tokens[3],tokens[4],
                    tokens[5],tokens[6]);
            athletes.add(athlete);
            line = bufReader.readLine();
        }
        return athletes;
    }
}
