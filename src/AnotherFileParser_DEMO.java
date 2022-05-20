import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnotherFileParser_DEMO {

    public static void main(String args[]) {


        try {
            File file = new File("suites.csv");    //creates a new file instance
            FileReader fr = new FileReader(file);   //reads the file
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
            StringBuffer sb = new StringBuffer();
            Pattern lineReg = Pattern.compile("((com\\.creatoriq\\.tests\\.\\w+?\\.C+(([0-9])+?)+([A-Za-z]+)))");
            String line;
            int count = 0;
//            String postfx = ";";
//            String prefix = "";
            while (((line = br.readLine()) != null)) {
                Matcher regExMatch = lineReg.matcher(line);
                if (line.contains("broken") || line.contains("failed")) {
                    if (regExMatch.find()) {
                        // we're only looking for one group, so get it
                        String theGroup = regExMatch.group(1);

                        // print the group out for verification
                        sb.append(theGroup + ';');
                        count++;

                    }
                }
            }
            System.out.println("Total amount of tests to rerun: " + count);
            System.out.print("--includeClasses=" + sb);
            //returns a string that textually represents the object
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

