package example.codeclan.com.oasisreleases;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class Releases {


    private ArrayList<Cd> list;

    public Releases() {
        list = new ArrayList<Cd>();
        list.add(new Cd(1, "Definitely Maybe", 1994));
        list.add(new Cd(2, "(What's the Story) Morning Glory?", 1995));
        list.add(new Cd(3, "Be Here Now", 1997));
        list.add(new Cd(4, "The Masterplan", 1998));
        list.add(new Cd(5, "Standing on the Shoulder of Giants", 2000));
        list.add(new Cd(6, "Familiar to Millions", 2000));
        list.add(new Cd(7, "Heathen Chemistry", 2002));
        list.add(new Cd(8, "Don't Believe The Truth", 2005));
        list.add(new Cd(9, "Stop the Clocks", 2006));
        list.add(new Cd(10, "Dig Out Your Soul", 2008));

    }

    public ArrayList<Cd> getList() {
        return new ArrayList<Cd>(list);
    }


}
