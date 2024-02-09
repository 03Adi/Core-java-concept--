import java.util.*; 
public class Ternaryoperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value: ");
        int n=sc.nextInt();

        System.out.println((n%2==0)? "even":"odd");
        sc.close();// -----------using for closing the user input prompt--------
    }
}
