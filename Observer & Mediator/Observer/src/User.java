import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        System.out.println("Press 1 to set the server operational");
        System.out.println("Press 2 to set the server partially down");
        System.out.println("Press 3 to set the server fully down");
        Subject subject = new Subject();
        PremiumObserver premiumObserver = new PremiumObserver(subject);
        subject.setState("Operational");
        subject.setServer("ABC");
        System.out.println("Demo for Premium User");
        Scanner scanner = new Scanner(System.in);
        int st = scanner.nextInt();
        if(st == 2){
            // operational to partially down
            subject.setState("Partially Down");
            premiumObserver.updatefrom1to2();
            int st2 = scanner.nextInt();
            if(st2 == 1){
                //partially down to operational
                subject.setState("Operational");
                premiumObserver.updatefrom2to1();
            }
            else if(st2 == 3){
                //partially down to fully down
                subject.setState("Fully Down");
                premiumObserver.updatefrom2to3();
            }
        }
        else if(st == 3){
            //operational to fully down
            subject.setState("Fully Down");
            premiumObserver.updatefrom1to3();
            int st3 = scanner.nextInt();
            if(st3 == 1){
                //fully down to operational
                subject.setState("Operational");
                premiumObserver.updatefrom3to1();
            }
            else if( st3 == 2){
                //fully down to partially down
                subject.setState("Partially Down");
                premiumObserver.updatefrom3to2();
            }
        }

        RegularObserver regularObserver =  new RegularObserver(subject);
        subject.setState("Operational");
        subject.setServer("ABC");
        System.out.println("Demo for Regular User");
        int stR = scanner.nextInt();
        if(stR == 2){
            // operational to partially down
            subject.setState("Partially Down");
            regularObserver.updatefrom1to2();
            int stR2 = scanner.nextInt();
            if(stR2 == 1){
                //partially down to operational
                subject.setState("Operational");
                if(subject.getServer().equals("DEF")){
                    regularObserver.updatefrom2to1();
                }
            }
            else if(stR2 == 3){
                //partially down to fully down
                subject.setState("Fully Down");
                regularObserver.updatefrom2to3();
            }
        }
        else if(stR == 3){
            //operational to fully down
            subject.setState("Fully Down");
            regularObserver.updatefrom1to3();
            int stR3 = scanner.nextInt();
            if(stR3 == 1){
                //fully down to operational
                subject.setState("Operational");
                if(subject.getServer().equals("DEF")){
                    regularObserver.updatefrom3to1();
                }
            }
            else if(stR3 == 2){
                //fully down to partially down
                subject.setState("Partially Down");
                regularObserver.updatefrom3to2();
            }
        }






    }
}
