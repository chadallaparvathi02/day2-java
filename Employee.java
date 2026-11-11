class Employee {
    String name = "Ramesh";
    int id = 101;
    double salary =30000;

    void work(){
        System.out.println("Writting code...");

    }
    void getBonus(){
        System.out.println("Bonus got 5000");
    }
}
class Main{
    public static void main(String[] args){

        Employee e1 =new Employee();
        System.out.println(e1.name);
        System.out.println(e1.id);
        System.out.println(e1.salary);
        e1.work();
        e1.getBonus();
        
    }
}