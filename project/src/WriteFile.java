import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeFile(String[] data, String fileName) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\aliki\\OneDrive\\Masaüstü\\Java\\project\\src\\" + fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String sport : data) {
                bufferedWriter.write(sport);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Data has been written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
