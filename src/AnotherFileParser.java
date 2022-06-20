import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnotherFileParser {

    public static void main(String args[]) {
        String fileName = "diakov_coreinf476";
        try {
            File file = new File("C:/org/git/devM/" + fileName + ".csv");
            StringBuffer sb = new StringBuffer();
            AtomicInteger count = new AtomicInteger(0);
            List<String> lines = Files.readAllLines(file.toPath());
            lines.remove(0);
            lines.forEach(line -> {
                String[] splittedLines = line.split(",");
                String status = splittedLines[0];
                String testClass = splittedLines[7].replace("\"", "");
                if(status.contains("broken") || status.contains("failed")){
                    sb.append(testClass).append(';');
                    count.incrementAndGet();
                }
            });

            System.out.println("Total amount of tests to rerun: " + count); // as there is nothing to read, the loop is over and we are printing total number of failed tests for comparing it with allure
            System.out.print("--includeClasses=" + sb);                     // and also printing the final parameter for rerun
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

