package digitsrecognizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DigitRecoUtils {

    public static List<Record> createRecordList(String fileName) throws IOException {
        Path path = Paths.get("C:\\Users\\badur\\Desktop\\SDA\\Programowanie II\\DigitsRecognitionApp",
                fileName);

        List<String> readAllLines;

        try {
            readAllLines = Files.readAllLines(path);
        } catch (IOException ex) {
            throw new IOException("File not found");
        }

        List<Record> listOfRecordObjects = readAllLines
                .subList(1, readAllLines.size())
                .stream()
                .map(x -> x.split(","))
                .map(DigitRecoUtils::stringArrayToIntegerArray)
                .map(Record::new)
                .collect(Collectors.toList());

        return listOfRecordObjects;
    }

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
        return (int) Math.sqrt(sum);
    }

    public static Integer predict(Integer[] pixels, List<Record> sampleRecords) {

        List<Classifier> sortedClassifiers = sampleRecords
                .stream()
                .parallel()
                .map(x -> new Classifier(x.getNumber(), distance(pixels, x.getPixels())))
                .sorted(Comparator
                        .comparingInt(Classifier::getDistance))
                .collect(Collectors.toList());

        return sortedClassifiers.get(0).getDigit();
    }

    public static void printPerformancePercentage(List<Record> recognizeWhat, List<Record> recognizeUsing){
        int successNumb = 0;
        int numberOfTests = recognizeWhat.size();

        for (int i = 0; i < recognizeWhat.size(); i++) {
            int testIndex = i;
            Integer testNumber = recognizeWhat.get(testIndex).getNumber();
            Integer[] testPixels = recognizeWhat.get(testIndex).getPixels();

            if (testNumber.equals(DigitRecoUtils.predict(testPixels, recognizeUsing))) {
                successNumb++;
            }
        }
        double percentage = ((double) successNumb / numberOfTests) * 100;

        System.out.println("Number of successfully recognized digits: " + successNumb);
        System.out.println("Number of tests: " + numberOfTests);
        System.out.print("Percentage of successes: ");
        System.out.format( "%.1f%n", percentage);
    }
}