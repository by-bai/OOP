import java.util.*; 

public class Utility1 {

    public static Map<String, List<Section>> getSMUXSections(List<Course> courses) {
        Map<String, List<Section>> map = new HashMap<>();
        

        if (courses == null) {
            return null; 
        }
        for (Course course : courses) {
            List<Section> sections = new ArrayList<>(); 
            Iterator<Section> iter = course.iterator(); 
            while (iter.hasNext()) {
                Section section = iter.next();
                // must check whether section is a SMUXSection!!
                if (section instanceof SMUXSection) {
                    sections.add(section);
                }
                
            }
            if (sections.size() != 0) {
                map.put(course.getName(), sections);
            }
            
        }
        return map;
    }
    
    // public static Map<String,List<Section>> getSMUXSections(List<Course> courses) {
    //     if (courses == null) {
    //         return null;
    //     }
    //     Map<String, List<Section>> result = new HashMap<>();
    //     for (Course course : courses) {
    //         List<Section> sectionsLi = new ArrayList<>();
    //         Iterator<Section> sectionsItr = course.iterator();
    //         while (sectionsItr.hasNext()) {
    //             Section sxn = sectionsItr.next();
    //             if (sxn instanceof SMUXSection) sectionsLi.add(sxn);
    //         }
    //         if (sectionsLi.size() != 0) result.put(course.getName(), sectionsLi);
    //     }
    //     return result;
    // }

    public static void main(String[] args) {
        {
            Course c1 = new Course("Fishing");
            c1.addSection(new Section("G1"));
            c1.addSection(new Section("G2"));

            Course c2 = new Course("Gardening");
            c2.addSection(new Section("G1"));
            c2.addSection(new SMUXSection("G2", new Sponsor("Ah Seng")));

            Course c3 = new Course("Sewing");
            c3.addSection(new Section("G1"));
            c3.addSection(new Section("G2"));
            c3.addSection(new Section("G3"));
            c3.addSection(new Section("G4"));
            c3.addSection(new SMUXSection("G5", new Sponsor("Ah Lian")));
            c3.addSection(new SMUXSection("G6", new Sponsor("Ah Tiong")));

            List<Course> courses = new ArrayList<>();
            courses.add(c1);
            courses.add(c2);
            courses.add(c3);

            Map<String, List<Section>> result = getSMUXSections(courses);
            System.out.println("Test 1");
            System.out.println("Expected:{Sewing=[G5, G6], Gardening=[G2]}");
            System.out.println("Actual  :" + result);
            System.out.println();
        }

        {
            Course c1 = new Course("Fishing");
            c1.addSection(new Section("G1"));
            c1.addSection(new Section("G2"));

            Course c2 = new Course("Gardening");
            c2.addSection(new Section("G1"));
            c2.addSection(new Section("G2"));


            Course c3 = new Course("Sewing");
            c3.addSection(new Section("G1"));
            c3.addSection(new Section("G2"));
            c3.addSection(new Section("G3"));
            c3.addSection(new Section("G4"));


            List<Course> courses = new ArrayList<>();
            courses.add(c1);
            courses.add(c2);
            courses.add(c3);

            Map<String, List<Section>> result = getSMUXSections(courses);
            System.out.println("Test 2");
            System.out.println("Expected:{}");
            System.out.println("Actual  :" + result);
            System.out.println();
        }
    }
}
