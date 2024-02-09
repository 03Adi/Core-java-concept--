//  for 4 rows and 5 column

// public class Starpattern {
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){ // for rows where rows no of lines
//             for(int j=1;j<=5;j++){ // for column where * in each lines
//                 System.out.println("*");
//             }
//         }
//     }
    
// }

// for N no of rows and N no of column
import java.util.*;
public class Starpattern{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of *: ");
        int n=sc.nextInt();

        // for rows---
        for(int i=1;i<=n;i++){
            // for column
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}