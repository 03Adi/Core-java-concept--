import java.util.*;
public class ifelsecasecalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();

        char calc=sc.next().charAt(0);

        int b=sc.nextInt();

        if(calc=='+')
        System.out.println(a+b);

        if(calc=='-')
        System.out.println(a-b);

        if(calc=='*')
        System.out.println(a*b);

        if(calc=='/')
        System.out.println(a/b);
        
        // else
        // System.out.println("**Enter valid condition**");
    }
}
