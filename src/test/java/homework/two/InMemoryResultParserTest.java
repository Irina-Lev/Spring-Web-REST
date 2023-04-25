package homework.two;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InMemoryResultParserTest {

    @Test
    public void readRightAnswersTest() throws IOException {
//       InMemoryResultParser inMemoryResultParser = new InMemoryResultParser(new );
       var filePath = new ClassPathResource("right-answers.txt").getFile().toPath().toString();
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("-", 2);
           var question = Integer.parseInt(parts[0].trim());
            var answer = parts[1].replace(",", "").trim().charAt(0);
            System.out.println( answer);
            System.out.println( question);
        }

    }
}