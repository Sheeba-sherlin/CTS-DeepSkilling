public class EmployeeSystem {

    Employee[] employees = new Employee[100];
    int count = 0;

    void add(Employee e) {
        employees[count++] = e;
    }

    void display() {

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].name);
        }
    }

    public static void main(String[] args) {

        EmployeeSystem system = new EmployeeSystem();

        system.add(new Employee(1, "John", "Developer", 50000));
        system.add(new Employee(2, "David", "Tester", 40000));

        system.display();
    }
}