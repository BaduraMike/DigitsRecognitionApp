package digitsrecognizer;

public class DigitRecoUtils {
    public static Integer[] stringArrayToIntegerArray(String[] stringArray) {
        Integer[] integerArray = new Integer[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            integerArray[i] = Integer.parseInt(stringArray[i]);
        }
        return integerArray;
    }

    public static int distance(Integer[] a, Integer[] b){
        return (int)Math.sqrt((a[0]-b[0])*(a[0]-b[0])+(a[1]-b[1])*(a[1]-b[1]));
    }
}