import java.io.*; 
import java.util.*; 

public class StudentDAO extends Utility {

    public static List<Student> read(String filename) throws FileNotFoundException {
        List<Student> students = new ArrayList<>();
         

        try(Scanner fileSc = new Scanner(new FileInputStream(filename))) {
            

            fileSc.useDelimiter(",|\r\n|\n");
            
            while (fileSc.hasNext()) { // 1 line
                char gender;
                List<String> languages = new ArrayList<>(); 

                String[] strings = fileSc.nextLine().split(","); 
                gender = strings[2].charAt(0); 

                List<Course> courseList = getCourse(strings); 

                // Student
                if (strings[0].equals("Student")) {
                    
                    
                    
                    Student student = new Student(strings[1], gender, courseList); 
                    students.add(student);
                } else if (strings[0].equals("SISStudent")){
                    for (int i = 3; i < strings.length; i++) {
                        languages.add(strings[i]); 
                    }
                    SISStudent sisStudent = new SISStudent(strings[1], gender, courseList, languages);
                    students.add(sisStudent);  

                }
                // SISStudent
                
                
            }
        }catch (FileNotFoundException e){
            System.out.println("File does not exist!");
        }
    
    return students;
    }

    private static List<Course> getCourse(String[] strings){
        List<Course> courseList = new ArrayList<>();
        try(Scanner courseSc = new Scanner(new FileInputStream(strings[1] + ".txt"))){
            courseSc.useDelimiter(",|\r\n|\n");
            while(courseSc.hasNext()) {
                String[] courseString = courseSc.nextLine().split(":");
                String courseName = courseString[0];
                if(isNumeric(courseString[1])){
                    int score = Integer.parseInt(courseString[1]);
                    double gradePoint = getGradePoint(score); 
                    System.out.println(score);
                    System.out.println(gradePoint);
                    Course course = new Course(courseName, gradePoint);
                    courseList.add(course); 
                    System.out.println(courseList);
                }
                
            }
        }catch(FileNotFoundException e){
            
        }

        return courseList;
    }
   
    public static boolean isNumeric(String string) {
        int intValue;
            
        System.out.println(String.format("Parsing string: \"%s\"", string));
            
        if(string == null || string.equals("")) {
            System.out.println("String cannot be parsed, it is null or empty.");
            return false;
        }
        
        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }
}
