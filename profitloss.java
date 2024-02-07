import java.util.*;
class profitloss{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost price: ");
        double cp=sc.nextDouble();

        System.out.println("Enter selling price: ");
        double sp=sc.nextDouble();

        if(cp<sp){
            System.out.println("Profit.........");
            System.out.println(sp-cp);
        }
        if(cp>sp){
            System.out.println("Loss...........");
            System.out.println(cp-sp);
        }
        if(cp==sp){
            System.out.println("no profit no loss");
        }
        
    }
}