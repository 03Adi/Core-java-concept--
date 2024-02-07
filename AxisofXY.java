import java.util.*;
public class AxisofXY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // x-axis--
        System.out.println("Enter x-axis: ");
        int x=sc.nextInt();

        // Y-axis---
        System.out.println("Enter y-axis: ");
        int y=sc.nextInt();

        // we know that axis table is roteted as clock wise--
        // (+,-) (-,-) (-.+) (+,+)

        if(x>=0 && y<0){
            System.out.println("4th quadrant");
        }
        if(x<0 && y<0){
            System.out.println("3rd quadrant");
        }
        if(x<0 && y>=0){
            System.out.println("2nd quadrant");
        }
        else
        System.out.println("1st quadrant");
        
    }
}