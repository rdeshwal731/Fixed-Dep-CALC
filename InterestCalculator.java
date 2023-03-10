import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SELECT THE OPTIONS " + "\n1." + " Interest Calculator-SB" + " \n2." + " Interest Calculator-FD"
                + "\n3." + " InterestCalculator-RD" + "\n4 " + " Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                SBaccount sb = new SBaccount();
                    System.out.println("Enter the Average SB amount ");
                    double amount = sc.nextDouble();
                    System.out.println("Interest gained is : $ " + sb.calculateInterest(amount));
                break;

            case 2:
                
                    FDaccount fd = new FDaccount();
                    System.out.println("Enter the FD Amount");
                    double fAmount = sc.nextDouble();
                    System.out.println("Interest gained is: $ " + fd.calculateInterest(fAmount));
                 
                break;
            case 3:
                    RDaccount rd = new RDaccount();
                    System.out.println("Enter the RD amount");
                    double Ramount = sc.nextDouble();
                    System.out.println("Interest gained is: $ " + rd.calculateInterest(Ramount));

                break;

            case 4:
                System.out.println("DO YOU WANT TO CALCULATE AGAIN ????" + " "
                        + "RUN THE PROGRAM AGAIN");
            default:
                System.out.println("Wrong choice");
        }
    }

}
