class employee {
    void salary(double a){
        System.out.println("salary 1");
    }
    void salary(int a,int b){
        System.out.println("salary 2");
    }
} 


class Main {
    public static void main(String[] args) {
        employee emp=new employee();

        emp.salary(2000.0);
        emp.salary(2000,4300);
    }
}       
    