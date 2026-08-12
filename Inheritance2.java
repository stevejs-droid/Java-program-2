package module2;

class Person1 {
    String name, email;
    int age;

    void displayinfo() {
        System.out.println("Name:" + name + "\nAge:" + age + "\nEmail: " + email);
    }
}

class employee1 extends Person1 {
    String department;
    double salary;

    @Override
    void displayinfo() {
        super.displayinfo();
        System.out.println("Department:" + department);
        System.out.println("Salary:" + salary);
    }
}

public class Main {
    public static void main(String args[]) {
        Person1 pp = new Person1();
        pp.name = "xyz";
        pp.age = 21;
        pp.email = "abc@xyz.com";

        employee1 ee = new employee1();
        ee.name = "John";
        ee.age = 30;
        ee.email = "john@company.com";
        ee.department = "HR";
        ee.salary = 25000;

        System.out.println("--- Person Details ---");
        pp.displayinfo();

        System.out.println("\n--- Employee Details ---");
        ee.displayinfo();
    }
}
