import java.util.*;

public class Utility2 {
    public static List<Course> retrieveLowEnrolmentCourses(List<Course> courses) {
        List<Course> result = new ArrayList<>();
        for (Course course : courses) {
            List<Section> sections = new ArrayList<>();
            
            Iterator<Section> iter = course.iterator(); 
            int sumSections = 0;
            int qualifiedSections = 0; 
            while (iter.hasNext()) {
                sumSections += 1;
                Section section = iter.next();
                if (section.getEnrolmentNumber() * 2.0 < section.getCapacity()) {
                    qualifiedSections += 1; 
                }
                
            }
            if (qualifiedSections * 3 >= sumSections) {
                result.add(course); 
            }

        } return result; 
    }
    

    public static void main(String[] args) {
        Course c1 = new Course("Fishing");
        c1.addSection(new Section("G1", 20,25));
        c1.addSection(new Section("G2", 23,25));

        Course c2 = new Course("Gardening");
        c2.addSection(new Section("G1", 11,25));
        c2.addSection(new Section("G2", 13,25));

        Course c3 = new Course("Sewing");
        c3.addSection(new Section("G1", 30,35));
        c3.addSection(new Section("G2",45,45));
        c3.addSection(new Section("G3",40,45));
        c3.addSection(new Section("G4",41,45));

        Course c4 = new Course("Fluff");
        c4.addSection(new Section("G1", 8,17));
        c4.addSection(new Section("G2",45,45));
        c4.addSection(new Section("G3",40,45));


        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);

        List<Course> result = retrieveLowEnrolmentCourses(courses);
        System.out.println("Test");
        System.out.println("Expected:[Gardening[G1, G2], Fluff[G1, G2, G3]]");
        System.out.println("Actual  :" + result);

    }

}
