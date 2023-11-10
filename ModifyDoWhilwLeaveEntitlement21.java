import java.util.Scanner;
/**
 * ModifyDoWhilwLeaveEntitlement21
 */
public class ModifyDoWhilwLeaveEntitlement21 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        String confirmation;
        int totalLeaveEntitlement = 15;
        int remainingLeavesEntitlement = totalLeaveEntitlement;
        int requestLeavesDays = 0;
        int leaveEntitlement,totalnumberofdays;

        System.out.print("Number of Leave Entitlement : ");
        leaveEntitlement = input21.nextInt();

        do {
            System.out.print("do you want to take a Leave (y/t)?");
            confirmation = input21.next();
            if (confirmation.equalsIgnoreCase("yes")) {
                System.out.println("total leaves entitlement : "+ totalLeaveEntitlement);

                if (totalLeaveEntitlement <= leaveEntitlement ) {
                   totalLeaveEntitlement -= leaveEntitlement  ;
                    System.out.println("The remaining leave Entitlement : "+totalLeaveEntitlement + " is not insufficient!");
                    System.out.println("You have taken " + leaveEntitlement +" days off");
                   System.out.println("Input the number of days of leave you want: ");
                      requestLeavesDays = input21.nextInt();
                        break;


                }
            }
    }while (requestLeavesDays > remainingLeavesEntitlement);
        System.out.println("remaining Leaves Entitlement : " + leaveEntitlement + " hari");
         System.out.println("You have taken "+requestLeavesDays+ " leave day " );
        requestLeavesDays -= leaveEntitlement;
        System.out.println("Your remaining leave entitlement is now: " +requestLeavesDays + " days");

}
}