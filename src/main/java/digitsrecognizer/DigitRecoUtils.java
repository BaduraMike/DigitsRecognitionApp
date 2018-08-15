package digitsrecognizer;

public class DigitRecoUtils {
    public static Integer[] stringArrayToIntegerArray(String[] stringArray) {
        Integer[] integerArray = new Integer[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            integerArray[i] = Integer.parseInt(stringArray[i]);
        }
        return integerArray;
    }

    public static int distance(Integer[] a, Integer[] b) {
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += ((double) a[i] - (double) b[i])
                    * ((double) a[i] - (double) b[i]);
        }
        return (int)Math.sqrt(sum);
    }
}