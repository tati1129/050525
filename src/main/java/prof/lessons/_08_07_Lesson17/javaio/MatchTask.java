package prof.lessons._08_07_Lesson17.javaio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static prof.lessons._08_07_Lesson17.javaio.MatchUtil.getMatchesInfo;

public class MatchTask {
    public static void main(String[] args) throws IOException {
        List<Match> matches = getMatchesInfo("src/main/java/prof/lessons/_08_07_Lesson17/resourse");
        for (Match match : matches){
            System.out.println(match);
        }
    }


}
