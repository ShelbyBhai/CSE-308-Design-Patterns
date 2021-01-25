import java.util.Scanner;

public class RegularObserver extends Observer {
    public RegularObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void commonupdate() {
        System.out.println("The System is now " +subject.getState());
    }

    @Override
    public void updatefrom1to2() {
        System.out.println("1.Press a to continue limited service from ABC server");
        System.out.println("2.Press d to continue full service from DEF server($20/hour will be applied)");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("a")){
            System.out.println("You are enjoying limited service");
        }
        else if(choice.equalsIgnoreCase("d")){
            System.out.println("Your Information is backed up is DEF server");
            subject.setServer("DEF");
        }
    }

    @Override
    public void updatefrom1to3() {
        System.out.println("1.Press y to continue full service from DEF server($20/hour will be applied)");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("y")){
            System.out.println("Your Information is backed up in DEF server");
            subject.setServer("DEF");
        }
    }

    @Override
    public void updatefrom2to1() {
        System.out.println("Your bill for using DEF server is $20*x");
        subject.setServer("ABC");
    }

    @Override
    public void updatefrom2to3() {

    }

    @Override
    public void updatefrom3to1() {
        System.out.println("Your bill for using DEF server is $20*x");
        subject.setServer("ABC");
    }

    @Override
    public void updatefrom3to2() {

    }
}
