package digitsrecognizer;

import java.io.IOException;
import java.util.List;

public class RunnerApp {

    public static void main(String[] args) throws IOException {
        List<Record> trainingRecordList = DigitRecoUtils.createRecordList("trainingsample.csv");
        List<Record> validationRecordList = DigitRecoUtils.createRecordList("validationsample.csv");

        DigitRecoUtils.printPerformancePercentage(validationRecordList,trainingRecordList);
    }
}
