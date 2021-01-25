import java.util.*;
public class ShakeDriver {
    public static void main(String[] args) {
        System.out.println("Press O to place your order!");
        Scanner sc = new Scanner(System.in);
        String start = sc.nextLine();
        while (!start.equalsIgnoreCase("e")) {
            if (start.equalsIgnoreCase("o")) {
                ShakeShack order = new ShakeShack();
                String str = sc.nextLine();
                if (str.equalsIgnoreCase("chocolate shake")) {
                    ShakeCommon shk = order.produceShake("chocolate shake");
                    shk.OrderDetails();
                }
                if (str.equalsIgnoreCase("coffee shake")) {
                    ShakeCommon shk = order.produceShake("coffee shake");
                    shk.OrderDetails();
                }
                if (str.equalsIgnoreCase("strawberry shake")) {
                    ShakeCommon shk = order.produceShake("strawberry shake");
                    shk.OrderDetails();
                }
                if (str.equalsIgnoreCase("vanilla shake")) {
                    ShakeCommon shk = order.produceShake("vanilla shake");
                    shk.OrderDetails();
                }
                if (str.equalsIgnoreCase("zero shake")) {
                    ShakeCommon shk = order.produceShake("zero shake");
                    shk.OrderDetails();
                }
                if(str.equalsIgnoreCase("e")){
                    break;
                }
            }
        }
    }
}

