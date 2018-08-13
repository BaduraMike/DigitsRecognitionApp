package digitsrecognizer;

import java.util.Arrays;

public class Record {
    private Integer number;
    private Integer[] pixels;

    public Record(Integer[] pixels) {
        this.number = pixels[0];
        this.pixels = new Integer[pixels.length - 1];

        for (int i = 0; i < this.pixels.length; i++) {
                this.pixels[i] = pixels[i + 1];
        }
    }

    @Override
    public String toString() {
        return "Record{" +
                "number=" + number +
                ", pixels=" + Arrays.toString(pixels) +
                '}';
    }
}
