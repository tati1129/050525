package prof.lessons._08_07_Lesson17.javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MatchUtil {
     static List<Match> getMatchesInfo(String file) throws IOException {
        List<Match> matches = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line;

        while ((line = reader.readLine()) != null){
            matches.add(createRecord(line));
        }
        reader.close();

        return matches;
    }

    private static Match createRecord(String line) {
        String[] data = line.split(",");

        String year = data[0].trim();
        String month = data[1].trim();
        String day = data[2].trim();
        String team1 = data[3].trim();
        String result = data[4].trim();
        String team2 = data[5].trim();

        int watchers = 0;

        if (!data[6].trim().equals("NULL")){
            watchers = Integer.parseInt(data[6].trim());
        };

        String stadion = "";

        if (!data[7].trim().equals("NULL")){
            stadion = data[7].trim();
        }

        return new Match(year,month,day,team1,result,team2,watchers,stadion);
    }
}
