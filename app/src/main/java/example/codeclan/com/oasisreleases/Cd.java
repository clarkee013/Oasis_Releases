package example.codeclan.com.oasisreleases;

/**
 * Created by user on 05/07/2017.
 */

public class Cd {

    private int ranking;
    private String title;
    private int year;

    public Cd(Integer ranking, String title, Integer year){
        this.ranking = ranking;
        this.title = title;
        this.year = year;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }


    public Integer getYear() {
        return year;
    }

}



