package au.com.infomedia;

/**
 * Created by lthompson on 25/11/2015.
 */
public class SonnetData {
    private Integer number;
    private String[] lines;

    public SonnetData(Integer number, String[] lines) {
        this.number = number;
        this.lines = lines;
    }

    public SonnetData() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String[] getLines() {
        return lines;
    }

    public void setLines(String[] lines) {
        this.lines = lines;
    }
}
