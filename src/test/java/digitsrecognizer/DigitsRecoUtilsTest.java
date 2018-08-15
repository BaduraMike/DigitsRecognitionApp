package digitsrecognizer;

import org.junit.Assert;
import org.junit.Test;

public class DigitsRecoUtilsTest {

    @Test
    public void shouldReturnZeroDistanceForSame2dPoints() {
        int x1 = 1;
        int y1 = 2;
        Integer[] array2DA = {x1, y1};
        int result = 0;
        Assert.assertEquals(result, DigitRecoUtils.distance(array2DA, array2DA));
    }

    @Test
    public void shouldNotReturnZeroDistanceForDifferent2dPoints() {
        int x1 = 1;
        int y1 = 1;
        Integer[] array2DA = {x1, y1};
        int x2 = 2;
        int y2 = 2;
        Integer[] array2DB = {x2, y2};

        int result = 1;
        Assert.assertEquals(result, DigitRecoUtils.distance(array2DA, array2DB));
    }

    @Test
    public void shouldNotReturnZeroDistanceForDifferent3dPoints() {
        int x1 = 1;
        int y1 = 1;
        int z1 = 1;
        Integer[] array3DA = {x1, y1, z1};
        int x2 = 2;
        int y2 = 2;
        int z2 = 2;
        Integer[] array3DB = {x2, y2, z2};

        int result = 1;
        Assert.assertEquals(result, DigitRecoUtils.distance(array3DA, array3DB));
    }
}