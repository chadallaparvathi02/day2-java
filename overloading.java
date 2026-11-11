class user{
    void name(int a){
        System.out.println("Function 1");
    }
    void name(){
         System.out.println("Function 2");
    }
    void name(int a,int b){
         System.out.println("Function 3");
    }
    void name(double a){
         System.out.println("Function 4");
    }
}
class Main{
    public static void main(String[] args){
       user us=new user();
       us.name();
       us.name(10);
       us.name(10,20);
       us.name(2.45);
    }
}   
