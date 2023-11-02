import java.io.*;
public class ReadFile {
    public String[] FileReader()
    {
        int i=0;
        String[] fixtures = new String[15];
        try {
            BufferedReader br = new BufferedReader(new FileReader(
                    "C:\\Users\\aliki\\OneDrive\\Masaüstü\\Java\\project\\src\\fixtures.txt"
            ));
            
            while((fixtures[i] = br.readLine()) != null) {
                // System.out.println(fixtures);
                i++;
            }
            br.close();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return fixtures;
    }
}
