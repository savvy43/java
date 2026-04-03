import java.util.Scanner;

class SafeCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("enter number1: ");
            String a = input.nextLine();

            System.out.print("enter number2: ");
            String b = input.nextLine();

            if (a.equalsIgnoreCase("exit") || b.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int x = Integer.parseInt(a);
                int y = Integer.parseInt(b);
                System.out.println("division: " + (x / y));
            }
            catch (ArithmeticException e) {
                System.out.println("can't divide by 0");
            }
            catch (NumberFormatException e) {
                System.out.println("invalid number");
            }
        }

        System.out.println("ended");
    }
}