class Employee {
    int empId;
    String name;
    double salary;

    // Constructor
    Employee(int id, String n, double s) {
        empId = id;
        name = n;
        salary = s;
    }

    // Display employee details
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Rahul", 25000);
        Employee e2 = new Employee(102, "Teja", 30000);
        Employee e3 = new Employee(103, "Arun", 35000);

        e1.display();
        e2.display();
        e3.display();
    }
}