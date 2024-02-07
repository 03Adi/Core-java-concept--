import java.util.*;
public class checkTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st side value: ");
        double a=sc.nextDouble();

        System.out.println("Enter 2nd side value: ");
        double b=sc.nextDouble();

        System.out.println("Enter 3rd side value: ");
        double c=sc.nextDouble();

        if((a+b)>c && (b+c)>a && (c+a)>b){
            System.out.println("Valid triangle");
        }
        else
        System.out.println("Invalid Triangle");
    }
}
