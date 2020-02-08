import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int choice;
        Scanner io=new Scanner(System.in);
        System.out.println("Getting chocolates....");
      
        Chocolate chocolate2=new Barone("Barone",30,20);
        System.out.println("Getting Sweets....");
        Sweets sweets1=new Gulabjamun("Gulabjamun",300,200);
        Sweets sweets2=new Kheer("Kheer",300,100);
        
        Gift gift=new Gift();
        gift.addChocolates(chocolate1,chocolate2);
        gift.addSweets(sweets1,sweets2);
        System.out.println("Sorting items in gift according to price");
        gift.sort();
        System.out.println("Total Weight of Gifts : "+gift.findTotalWeight());
        do
        {
        	System.out.println("<==============Happy New Year Gifts=============> ");
            System.out.println("Enter '1' to view all candies : ");
            System.out.println("Enter '2' to view all sweets : ");
            System.out.println("Enter '3' to know most expensive chocolate and sweets : ");
            choice=io.nextInt();
            switch(choice)
            {
                case 1:
                ArrayList<Chocolate> arrayList=gift.getChocolates();
                for (Chocolate c:arrayList) {
                    System.out.println(c.toString());
                }
                break;
                case 2:
                ArrayList<Sweets> arrayList1=gift.getSweets();
                for (Sweets s:arrayList1){
                    System.out.println(s.toString());
                }
                break;
                case 3:
                System.out.println("The Expensive Chocolate : "+mostExpensive(gift.getChocolates()));
                System.out.println("The Expensive Sweet : "+mostExpensive(gift.getSweets()));
                default:
                System.out.println("Please enter a valid option!!");
                break;
            }
        }
        while(choice < 4);
        io.close();
    }
    private static <T> String mostExpensive(ArrayList<T> arrayList){
        return arrayList.get(0).toString();
    }
}