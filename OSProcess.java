import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OSProcess {
    public static void main(String[] args) {
        // simple process
        try {
            System.out.println("Enter software you use to open");
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            ProcessBuilder pb = new ProcessBuilder(userInput);
            Process process = pb.start();

            InputStream inputStream = process.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Software does not exist");
        }

    }
}
