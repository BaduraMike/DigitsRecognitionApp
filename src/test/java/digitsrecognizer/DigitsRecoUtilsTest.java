package digitsrecognizer;

import org.junit.Assert;
import org.junit.Test;

public class DigitsRecoUtilsTest {
    @Test
    public void shouldReturnZeroDistanceForSame2dPoints() {
        int x1 = 1;
        int y1 = 2;
        Integer[] array2DA = {x1,y1};
        int result = 0;
        Assert.assertEquals(result, DigitRecoUtils.distance(array2DA, array2DA));
    }
}