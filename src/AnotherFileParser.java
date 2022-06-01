import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnotherFileParser {

    public static void main(String args[]) {
        try {
            File file = new File("src/resourses/morgun-devops-1265.csv");                    // creates a new file instance
            FileReader fr = new FileReader(file);                           // reads the file
            BufferedReader br = new BufferedReader(fr);                     // creates a buffering character input stream
            StringBuffer sb = new StringBuffer();                           // creates a string buffer for handling all appended strings
            Pattern lineReg = Pattern.compile("((com\\.creatoriq\\.tests\\.\\w+?\\.C+(([0-9])+?)+([A-Za-z0-9]+)))"); // creates regex pattern for matching
            String line;
            int count = 0;
            while (((line = br.readLine()) != null)) {                      // while the line is not null
                Matcher regExMatch = lineReg.matcher(line);                 // the loop creates matcher for our pattern
                if (line.contains("broken") || line.contains("failed")) {   // if parsed line contains failed tests then
                    if (regExMatch.find()) {                                // we check if there is match for our regex then
                        String theGroup = regExMatch.group(1);              // creating a string with our matched part of the line
                        sb.append(theGroup + ';');                          // and adding it to our string buffer with ; symbol in the end
                        count++;                                            // also counting every added string for more accurate analysis

                    }
                }
            }
            System.out.println("Total amount of tests to rerun: " + count); // as there is nothing to read, the loop is over and we are printing total number of failed tests for comparing it with allure
            System.out.print("--includeClasses=" + sb);                     // and also printing the final parameter for rerun
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

