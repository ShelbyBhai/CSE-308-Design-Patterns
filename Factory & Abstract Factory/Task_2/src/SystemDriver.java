import java.util.Scanner;
public class SystemDriver {
    public static void main(String[] args) {
        System.out.println("Enter The Computer to operate : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("Computer A")){
            ComputerFactory computerFactory = new ComputerFactory();
            ComputerCommon computerCommon = computerFactory.getComputer("Computer A");
            computerCommon.Display();
        }
        if(input.equalsIgnoreCase("Computer B")){
            ComputerFactory computerFactory = new ComputerFactory();
            ComputerCommon computerCommon = computerFactory.getComputer("Computer B");
            computerCommon.Display();
        }
        if(input.equalsIgnoreCase("Computer C")){
            ComputerFactory computerFactory = new ComputerFactory();
            ComputerCommon computerCommon = computerFactory.getComputer("Computer C");
            computerCommon.Display();
        }
    }
}
