class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Company {
    private Employee employee;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void showEmployee() {
        System.out.println("Employee: " + employee.getName() + "\n");
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Company company = new Company();
        Employee employee = new Employee("Joko Kopling");
        company.setEmployee(employee);

        company.showEmployee();
    }
}
