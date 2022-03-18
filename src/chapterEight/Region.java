package chapterEight;

import static chapterEight.People.WORM;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public enum Region {
    NE("Ajegunle", "Ikeja", "Abuja"),
    SE("VI", "BI"),
    SW("Mushin", "Ketu", "Okoko","Ipaja"),
    NC("Ibadan", "Ekiti", "Ijebu"),
    SS("Sabo", "Bariga", "Somolu"),
    NW("Challenge", "Molete", "Mowe");

    private String[] states;
    Region(String... states){
        this.states= states;
        People people = WORM;
        double result = PI * sqrt(1.42);
    }
}
