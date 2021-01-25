import java.util.Scanner;
public class ZeroShake implements ShakeCommon {
    @Override
    public void OrderDetails() {
        String orderDescription = "Milk," + "Sweetener," + "VanillaFlavour," + "Sugar Free Jello";
        int orderValue = 240;
        System.out.println("Do you want to make your shake lactose free?(Y/N)");
        Scanner sc = new Scanner(System.in);
        String choice1 = sc.nextLine();
        if(choice1.equalsIgnoreCase("y")) {
            orderDescription = orderDescription.replace("Milk,","Almond Milk,");
            orderValue = orderValue + 60;
            System.out.println("Tk 60 added for the almond milk");
        }
        else {
            System.out.println("No Almond Milk added!");
        }
        System.out.println("Do you want candy on your shake?(Y/N)");
        String choice2 = sc.nextLine();
        if(choice2.equalsIgnoreCase("y")){
            orderDescription = orderDescription + ",Candy";
            orderValue = orderValue + 50;
            System.out.println("Tk 50 added for the candy");
        }
        else{
            System.out.println("No Candy added!");
        }
        System.out.println("Do you want cookies on your shake?(Y/N)");
        String choice3 = sc.nextLine();
        if(choice3.equalsIgnoreCase("y")){
            orderDescription = orderDescription + ",Cookies";
            orderValue = orderValue + 40;
            System.out.println("Tk 40 added for the cookies");
        }
        else{
            System.out.println("No Cookies added!");
        }
        System.out.println("Your Order Details : ");
        System.out.println("ZeroShake " + "ingredients : " + orderDescription);
        System.out.println("Total amount to be paid: " + orderValue);
    }
}
