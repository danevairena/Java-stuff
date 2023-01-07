import java.util.Objects;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Prompt user for command
        System.out.println("Enter command: \n sum, subtract, multiply or divide");
        //User input
        String command = scan.nextLine();

        //check command
        switch (command) {
            //sum numbers until user has not entered end
            case "sum" -> {
                System.out.println("Numbers to sum: ");

                //first input (assume it always will be number)
                int a = Integer.parseInt(scan.nextLine());
                
                //update result value
                int result = a;

                //set end boolean value - if user input does not equal "end"
                boolean end = !Objects.equals(Objects.toString(a), "end");

                //loop while end value is true
                while (end)
                {
                    //user input
                    String number = scan.nextLine();

                    //check user input
                    if (number.equals("end")) {

                        //print result if user has entered end end
                        System.out.println(result);

                    } else {
                        //parse string (user input) to integer
                        a = Integer.parseInt(number);

                        //update result - use sum function
                        result = Math.addExact(result, a);

                        //update boolean value for end of while loop
                        end = !Objects.equals(Objects.toString(a), "end");
                    }
                }
            }
            case "subtract" -> {
                //prompt user for 2 numbers to be subtracted
                System.out.println("Enter number 1");
                int a = Integer.parseInt(scan.nextLine());
                System.out.println("Enter number 2");
                int b = Integer.parseInt(scan.nextLine());

                //update result - use subtract function
                int result = Math.subtractExact(a, b);
                //print result
                System.out.println(result);
            }

            //sum numbers until user has not entered end
            case "multiply" -> {
                System.out.println("Numbers to be multiplied: ");
                //first input (assume it always will be number)
                int a = Integer.parseInt(scan.nextLine());

                //update result value
                int result = a;

                //set end boolean value - if user input does not equal "end"
                boolean end = !Objects.equals(Objects.toString(a), "end");

                //loop while end value is true
                while (end)
                {
                    //user input
                    String number = scan.nextLine();

                    //check user input
                    if (number.equals("end")) {

                        //print result if user has entered end end
                        System.out.println(result);
                    } else {
                        //parse string (user input) to integer
                        a = Integer.parseInt(number);

                        //update result - use multiply function
                        result = Math.multiplyExact(result, a);

                        //update boolean value for end of while loop
                        end = !Objects.equals(Objects.toString(a), "end");
                    }
                }
            }
            case "divide" -> {
                //prompt user for 2 numbers to be divided
                System.out.println("Enter number 1");
                int a = Integer.parseInt(scan.nextLine());
                System.out.println("Enter number 2");
                int b = Integer.parseInt(scan.nextLine());

                //update result - use subtract function
                int result = Math.divideExact(a, b);

                //print result
                System.out.println(result);
            }

            //default case if user entered wrong command - print error message
            default -> System.out.println("Wrong command");
        }
    }
}
