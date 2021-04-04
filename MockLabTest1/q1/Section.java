import java.util.Arrays;
import java.util.Objects;

public class Section {
    private String number;
    private Course course;
    private Staff[] staff;


    public Section(String number, Course course, Staff[] staff) {
        this.number = number;
        this.course = course;
        this.staff = staff;
    }

    public String getNumber() {
        return number;
    }

    public Course getCourse() {
        return course;
    }

    public Staff[] getStaff() {
        return staff;
    }

    public boolean equals(Object o) {
        if (o instanceof Section) {
            Section another = (Section) o;

            // every staff of A is a staff of B
            Staff [] staffList = getStaff();
            Staff [] anotherStaffList = another.getStaff();

            return staffList.equals(anotherStaffList) 
            && getCourse() == another.getCourse();
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(number); 
    }

}
