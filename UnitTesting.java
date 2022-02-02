import static org.junit.Assert.*;
import java.io.File;
import java.util.Scanner;



public class UnitTesting {
    
    @Test 
    void NumCols() {
        // Get csv file
        String fileName = "en_es_alphabet.csv";
        File csvFile = new File(fileName);
        Scanner sc = new Scanner(csvFile);

        // skip first line
        sc.next();

        // verify each line splits into 2 parts (ie. 2 col inputs for each row)
        while(sc.hasNext()){
            //read single line, put in string
            String[] line = sc.next().split(",");
            Assert.assertTrue(line.length, 2);
        }
        // after loop, close scanner
        sc.close();
    }
}