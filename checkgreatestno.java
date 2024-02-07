import java.util.*;
public class checkgreatestno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a=sc.nextInt();

        System.out.println("Enter value of b: ");
        int b=sc.nextInt();

        System.out.println("Enter value of c: ");
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("Greatest no is "+a);
        }
        if(b>a && b>c){
            System.out.println("Greatest on is "+b);
        }
        if(c>a && c>b){
            System.out.println("Greatest on is "+c);
        }
    }
}