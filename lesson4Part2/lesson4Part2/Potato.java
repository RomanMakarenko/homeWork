package lesson4Part2;

/**
 * Created by RomanM on 27.04.2014.
 */
public class Potato extends Goods {
    private int volume;
    private String countryOfExport;
    private String grade;

    public Potato(int idOfItem, long price, int volume, String countryOfExport, String grade) {
        super(idOfItem, price);
        this.volume = volume;
        this.countryOfExport = countryOfExport;
        this.grade = grade;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getCountryOfExport() {
        return countryOfExport;
    }

    public void setCountryOfExport(String countryOfExport) {
        this.countryOfExport = countryOfExport;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
