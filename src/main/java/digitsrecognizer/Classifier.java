package digitsrecognizer;

public class Classifier{
    private Integer digit;
    private Integer distance;

    public Classifier(Integer digit, Integer distance) {
        this.digit = digit;
        this.distance = distance;
    }

    public Integer getDigit() {
        return digit;
    }

    public Integer getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Classifier{" + "digit=" + digit
                + ", distance=" + distance + '}';
    }

}
