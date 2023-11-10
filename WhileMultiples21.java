import java.util.Scanner;
/**
 * WhileMultiples21
 */
public class WhileMultiples21 {

    public static void main(String[] args) {
        Scanner input21 = new Scanner (System.in);
        int multiple;
        int sum = 0;
        int counter = 0;

        System.out.println("Input the multiple: ");
        multiple = input21.nextInt();

        int i = 1;
        while (i <= 50) {
            if (1%multiple == 0) {
               
                System.out.print(i+ "-");
                }
                else{
                    sum = sum + i;
                    counter++;
                 System.out.printf("there are %d numbers that are multiple of %d in range 1 to 50.\n", multiple, sum);
                System.out.printf("the sum from all multiples of %d in range 1 s.d. 50 is %d.\n", multiple, sum);
            }
            i++;
        }
           
            
        }
            }
        
    
