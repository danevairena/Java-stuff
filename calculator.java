import java.util.Objects;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter command: \n sum, subtract, multiply or divide");
        String command = scan.nextLine();

        switch (command) {
            case "sum" -> {
                System.out.println("Numbers to sum: ");
                int a = Integer.parseInt(scan.nextLine());
                int result = a;
                boolean end = !Objects.equals(Objects.toString(a), "end");
                while (end)
                {
                    String number = scan.nextLine();
                    if (number.equals("end")) {
                        System.out.println(result);
                    } else {
                        a = Integer.parseInt(number);
                        result = sum(result, a);
                        end = !Objects.equals(Objects.toString(a), "end");
                    }
                }
            }
            case "subtract" -> {
                System.out.println("Enter number 1");
                int a = Integer.parseInt(scan.nextLine());
                System.out.println("Enter number 2");
                int b = Integer.parseInt(scan.nextLine());
                int result = subtract(a, b);
                System.out.println(result);
            }
            case "multiply" -> {
                System.out.println("Numbers to be multiplied: ");
                int a = Integer.parseInt(scan.nextLine());
                int result = a;
                boolean end = !Objects.equals(Objects.toString(a), "end");
                while (end)
                {
                    String number = scan.nextLine();
                    if (number.equals("end")) {
                        System.out.println(result);
                    } else {
                        a = Integer.parseInt(number);
                        result = sum(result, a);
                        end = !Objects.equals(Objects.toString(a), "end");
                    }
                }
            }
            case "divide" -> {
                System.out.println("Enter number 1");
                int a = Integer.parseInt(scan.nextLine());
                System.out.println("Enter number 2");
                int b = Integer.parseInt(scan.nextLine());
                int result = divide(a, b);
                System.out.println(result);

            }
            default -> System.out.println("Wrong command");
        }
    }
    static int sum(int a, int b)
    {
        return a + b;
    }

    static int subtract(int a, int b)
    {
        return a - b;
    }

    static int multiply(int a, int b)
    {
        return a * b;
    }

    static int divide(int a, int b)
    {
        return a / b;
    }
}
