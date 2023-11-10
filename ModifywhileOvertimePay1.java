
import java.util.Scanner;
/**
 * ModifywhileOvertimePay1
 */
public class ModifywhileOvertimePay1 {
   public static void main(String[] args) {
      Scanner input21 = new Scanner(System.in);
        int numEmployee, overtimeHours;
        String position;
        int overtimePay = 0;
        double totalOvertimePay = 0.0; 

        System.out.print("Employee number :");
        numEmployee = input21.nextInt();

        int i=0;
        while (i<numEmployee){
           System.out.print("Position of employee "+(i+1)+" (director, manager,staff, progammer) = ");
           position = input21.next();
           System.out.print(" Employee "+(i+1)+" overtime hours = ");
           overtimeHours = input21.nextInt();
           i++;
           if (position.equalsIgnoreCase("director")) {
            continue;
           } else if (position.equalsIgnoreCase("manager")) {
            overtimePay = overtimeHours*100000;
           } else if (position.equalsIgnoreCase("staff")) {
            overtimePay = overtimeHours*75000;
           } else if (position.equalsIgnoreCase("progammer")) {
            System.out.println("invalid position!");
           }
        }
           totalOvertimePay += overtimePay;
           System.out.println("Total of overtime Pay = "+totalOvertimePay);
           
        }
    
   }


   