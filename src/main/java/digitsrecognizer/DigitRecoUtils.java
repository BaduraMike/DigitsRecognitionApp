package digitsrecognizer;

public class DigitRecoUtils {
    public static Integer[] stringArrayToIntegerArray(String[] stringArray){
        Integer[] integerArray = new Integer[stringArray.length];

        for(int i = 0; i < stringArray.length; i++ ){
            integerArray[i] = Integer.parseInt(stringArray[i]);
        }
        return integerArray;
    }

}
