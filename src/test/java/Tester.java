package src.main;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.Assert;

public class Tester {
    @Test
    public void parserAthletes() throws IOException{
        String content = "11,Umar Jorgson,SK,30:27,xxxox,xxxxx,xxoxo\n"+
                "1,Jimmy Smiles,UK,29:15,xxoox,xooxo,xxxxo";
        InputStream is = new ByteArrayInputStream(content.getBytes("UTF-8"));
        AthletesParser parser = new AthletesParser();

        List<Athlete> athletes = parser.parseAthletes(is);

        ArrayList<Athlete> expectedAthletes = new ArrayList<Athlete>();
        expectedAthletes.add(new Athlete(11,"Umar Jorgson", "SK", "30:27", "xxxox", "xxxxx", "xxoxo"));
        expectedAthletes.add(new Athlete(1,"Jimmy Smiles", "UK", "29:15", "xxoox", "xooxo", "xxxxo"));

        Assert.assertEquals(expectedAthletes, athletes);
    }
}
