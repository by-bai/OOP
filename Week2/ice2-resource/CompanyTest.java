import java.util.Scanner;

public class CompanyTest {

    public static void main(String[] args) {
        // A. 
        Company comp = new Company("UMS"); 

        // B.
        Employee emp = new Employee("John", 5, 2500.0, 'M', new Spouse("Kate", 37)); 
        
        comp.addEmployee(emp); 

        // C. 

        System.out.printf("Total Salary(before) $%.1f \n", comp.getAllEmployeesSalary()); 
        System.out.println(); 

        // D.

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter ID:");
        int id = sc.nextInt();
        

        System.out.print("Enter name:");
        sc.nextLine(); 
        String name = sc.nextLine(); 

        System.out.print("Enter salary:");
        double salary = sc.nextDouble(); 

        System.out.print("Enter gender:");
        char gender = sc.next().charAt(0);  

        comp.addEmployee(new Employee(name, id, salary, gender)); 

        // E.

        System.out.printf("Total Salary (after addition) $%.1f \n", comp.getAllEmployeesSalary()); 
        System.out.println(); 

        // F. 
        checkEmployee(comp, 4); 
        System.out.println(); 
        
        // G.
        checkEmployee(comp, 5); 

    }

        // H.

    public static void checkEmployee(Company comp, int id){
        Employee emp = comp.getEmployee(id); 
        System.out.printf("Name: %s, Salary $%.1f, Status: %s \n", 
                            emp.getName(), emp.getSalary(),  
                            emp.getSpouse() != null ? "Married" : "Single");

        if (emp.getSpouse() != null) {
            System.out.printf("Spouse's name: %s \n", emp.getSpouse().getName());
        
        }
        
        







    }
}
