import java.util.Scanner;
class Employee {
    private String name;
    private int id;
    private double salary;
    void getter() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
    void setter(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }
}
class Employe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        System.out.print("Enter name: ");
        String a = sc.nextLine();
        System.out.print("Enter id: ");
        int b = sc.nextInt();
        System.out.print("Enter salary: ");
        double c = sc.nextDouble();
        e.setter(a, b, c);
        e.getter();
        sc.close();
    }
}
