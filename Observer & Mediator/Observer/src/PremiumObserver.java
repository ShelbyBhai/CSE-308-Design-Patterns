import java.util.Scanner;

public class PremiumObserver extends Observer {
    public PremiumObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void commonupdate() {
        System.out.println("The System is now " +subject.getState());
    }

    @Override
    public void updatefrom1to2() {
        System.out.println("1.Press a to continue service from both ABC & DEF server");
        System.out.println("2.Press d to continue service from only DEF server");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("a")){
            System.out.println("You are enjoying full service with the help of both of the servers");
        }
        else if(choice.equalsIgnoreCase("d")){
            System.out.println("Your Information is backed up is DEF server");
            subject.setServer("DEF");
        }
    }

    @Override
    public void updatefrom1to3() {
        System.out.println("The Service is now being provided by DEF server");
        subject.setServer("DEF");
    }

    @Override
    public void updatefrom2to1() {
        subject.setServer("ABC");
    }

    @Override
    public void updatefrom2to3() {
        System.out.println("All the services are now shifted to DEF server");
        subject.setServer("DEF");
    }

    @Override
    public void updatefrom3to1() {
        subject.setServer("ABC");
    }

    @Override
    public void updatefrom3to2() {

    }
}
