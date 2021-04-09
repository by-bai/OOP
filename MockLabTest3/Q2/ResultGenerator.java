import java.io.*;
import java.util.*; 

public class ResultGenerator {

    public static void output(List<Student> studentList, String filename) throws FileNotFoundException {

        Collections.sort(studentList, Collections.reverseOrder());
        String delimiter = ":"; 
        
        try(FileWriter out = new FileWriter(filename)) {
            for (Student student : studentList) {
                System.out.println(student);
                String name = student.getName(); 
                String studentType;
                if (student instanceof SISStudent) {
                    studentType = "SISStudent";
                } else {
                    studentType = "Student"; 
                }
                String gpa = String.valueOf(student.calculateGPA()); 

                out.write(name + delimiter + studentType + delimiter + gpa + "\n");

                

            }
        
        } catch (FileNotFoundException e) {
    
        } catch (IOException e) {

        }
    }
  
}
