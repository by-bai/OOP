import java.util.*;
import java.io.*; 
import org.apache.commons.CSVFormat;

public class Q7 {
    public static void main(String[] args) {
        
        String name = "";

        Set<String> deanListers = new HashSet<>(); 
        try (Scanner sc = new Scanner(new File("result.csv"))) {
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
            for (CSVRecord record : records) {  
                name = record.get("name");
                String gpa = record.get("GPA");
                if (Double.parseDouble(gpa) >= 3.7) {
                    deanListers.add(name); 
                }
            }

            System.out.println(deanListers);

        }
        catch (FileNotFoundException e) {
            System.out.println("file cannot be found");
        }
        catch (NumberFormatException e) {
            System.out.println("error processing data at : " + name); // line 226 in excel
            System.out.println("Dean Listers so far: ");
            if (deanListers.size() == 0) {
                System.out.println(0);
            } else {
                System.out.println(deanListers);
            }
        }
    }
}
