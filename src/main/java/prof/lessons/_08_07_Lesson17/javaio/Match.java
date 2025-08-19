package prof.lessons._08_07_Lesson17.javaio;

public class Match {
private String year;
private String month;
private String day;
private String team1;
private String result;
private String team2;
private int watchers;
private String stadion;

    public Match(String year, String month, String day, String team1, String result, String team2, int watchers, String stadion) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.team1 = team1;
        this.result = result;
        this.team2 = team2;
        this.watchers = watchers;
        this.stadion = stadion;
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getTeam1() {
        return team1;
    }

    public String getResult() {
        return result;
    }
    public int getResultTeam1(){
        String[] results = result.split(":");
        return Integer.parseInt(results[0]);
    };
    public int getResultTeam2(){
        String[] results = result.split(":");
        return Integer.parseInt(results[1]);
    };

    public String getTeam2() {
        return team2;
    }

    public int getWatchers() {
        return watchers;
    }

    public String getStadion() {
        return stadion;
    }

}
