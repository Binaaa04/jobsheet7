import java.util.Scanner;
/**
 * ModifyDoWhilELeaveEntitlement21Exp3
 */
public class ModifyDoWhilELeaveEntitlement21Exp3 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner (System.in);
        String confirmation;
        int leaveEntitlement,numLeave,totalnumberofdays;

        System.out.print(" Number of Leave Entitlement : ");
        leaveEntitlement = input21.nextInt();
        do {
            System.out.print("do you want to take a Leave (y/t)?");
            confirmation = input21.next();
            if (confirmation.equals("t")) {
                break;
            }
            if (confirmation.equalsIgnoreCase("yes")) {
                System.out.print("total number of days : ");
                totalnumberofdays = input21.nextInt();

                if (totalnumberofdays <= leaveEntitlement ) {
                   leaveEntitlement -= totalnumberofdays;
                    System.out.println("The remaining leave Entitlement : "+leaveEntitlement);
                } else {
                    System.out.println("The remaining leave Entitlement is not insufficient!");
                    break;
                }
            }
        } while (leaveEntitlement > 0);
    }
}