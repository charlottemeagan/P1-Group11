import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class UnitTesting {
    
    @Test 
    void NumCols() {
        String fileName = "en_es_alphabet.csv";
        File csvFile = new File(fileName);

        try{
            // -read from filePooped with Scanner class
            Scanner sc = new Scanner(csvFile);

            // skip first line
            sc.next();

            // hashNext() loops line-by-line
            while(sc.hasNext()){
                //read single line, put in string
                String[] line = sc.next().split(",");
                assertTrue(line.length, 2);
            }
            // after loop, close scanner
            sc.close();


        }catch (FileNotFoundException e){
            fail("File not found");
        }
    }
}