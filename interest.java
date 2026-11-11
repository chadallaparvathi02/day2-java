
import java.util.Scanner;

class Loan {

    void calculateInterest(double principal) {
        System.out.println("Interest: " + (principal * 0.05));
    }

    void calculateInterest(double principal, int years) {
        System.out.println("Interest: " + (principal * 0.05 * years));
    }

    void calculateInterest(double principal, int years, double rate) {
        System.out.println("Interest: " + (principal * years * rate / 100));
    }
}

class main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Loan l = new Loan();

        System.out.print("Enter principal, years, rate: ");

        double p = sc.nextDouble();
        int y = sc.nextInt();
        double r = sc.nextDouble();

        l.calculateInterest(p);
        l.calculateInterest(p, y);
        l.calculateInterest(p, y, r);

        sc.close();
    }
}
