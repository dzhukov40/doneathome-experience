package doneathome.restFerst.model;

/**
 * Created by dzhukov on 09.05.17.
 */
public class TwoStrings {

    private String ferst;
    private String second;

    public TwoStrings(String ferst, String second) {

        this.ferst = ferst;
        this.second = second;
    }

    public String getFerst() {
        return ferst;
    }

    public void setFerst(String ferst) {
        this.ferst = ferst;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "TwoStrings{" +
                "ferst='" + ferst + '\'' +
                ", second='" + second + '\'' +
                '}';
    }

}
