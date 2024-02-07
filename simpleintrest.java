import java.util.*;
public class simpleintrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of principle: ");
        double p=sc.nextDouble();

        System.out.println("Enter value of rate: ");
        double r=sc.nextDouble();

        System.out.println("Enter value of time: ");
        double t=sc.nextDouble();

        Double si=p*r*t/100;

        System.out.println("Simple Intrest is: "+si);
    }
    
}
