package day11;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return getFirstName() + " " + getLastName();
    }
    public int getAnnualSalary() {
        return 12 * getSalary();
    }
    public int getRaiseSalary() {
        int raise = (int)((getAnnualSalary() * 0.10)+getAnnualSalary());
        return raise;
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {
        Employee obj = new Employee(10, "Santhosh", "K", 30000);
        System.out.println("Id:"+obj.getId());
        System.out.println("FirstName:"+obj.getFirstName());    
        System.out.println("LastName:"+obj.getLastName());    
        System.out.println("Name:"+obj.getName());
        System.out.println("Salary:"+obj.getSalary());
        System.out.println("Annualsalary:"+obj.getAnnualSalary());
        System.out.println("Raisesalary:"+obj.getRaiseSalary());
        System.out.println(obj.toString());    
        }
}