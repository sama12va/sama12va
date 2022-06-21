import java.util.Scanner;

public class Java01 {
    public static void main(String[] args) {
        int V1;
        System.out.println("Enter a value1");
        int V2;

        Scanner sc = new Scanner(System.in);
        V1 = sc.nextInt();
        System.out.println("Enter a value2");
        V2 = sc.nextInt();
        System.out.println("Entered Values : " + "Value1: " + V1 +","+ "Value2: " +V2);
        System.out.println("Enter the Function -->> 'Add'/'Sub'/'Mul'/'Div'/'Mod'/'Inc'/Dec'");
        String Str = sc.next();
        System.out.println("Entered Function : " + Str);


        switch (Str) {
            case "Add":
            case "add":
            case "ADD":
                System.out.println("Addition of : " + (V1 + V2));
                break;

            case "Sub":
            case "sub":
            case "SUB":
                System.out.println("Substraction of :" + (V1 - V2));
                break;

            case "Mul":
            case "mul":
            case "MUL":
                System.out.println("Multiplication of :" + (V1 * V2));
                break;

            case "Div":
            case "div":
            case "DIV":
                System.out.println("Division of " + (V2 / V1));
                break;

            case "Mod":
            case "mod":
            case "MOD":
                System.out.println("Module of :" + (V1 % V2));
                break;

            case "Inc":
            case "inc":
            case "INC":
                System.out.println("Increment of value :" + ++V1 + ":" + ++V2);
                break;

            case "Dec":
            case "dec":
            case "DEC":
                System.out.println("Decrement of value :" + --V1 + ":" + --V2);
                break;

            default:
                System.out.println("Invalid Function");
                break;
        }

    }
}
