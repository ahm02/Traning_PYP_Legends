import java.util.Scanner;

public class if_else2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        double num1 , num2 , result;
        System.out.println("Select form the list to calc :");
        System.out.println("1- add");
        System.out.println("2- sub");
        System.out.println("3- multi");
        System.out.println("4- div");
        int calc = read.nextInt();

        if (calc == 1) {
            System.out.println("enter the first number");
            num1 = read.nextDouble();
            System.out.println("enter the second number");
            num2 = read.nextDouble();
            result = num1 + num2;
            System.out.println("the result is : " + result);
        }
        else if (calc == 2) {
            System.out.println("enter the first number");
            num1 = read.nextDouble();
            System.out.println("enter the second number");
            num2 = read.nextDouble();
            result = num1 - num2;
            System.out.println("the result is : " + result);
        }
        else if (calc == 3) {
            System.out.println("enter the first number");
            num1 = read.nextDouble();
            System.out.println("enter the second number");
            num2 = read.nextDouble();
            result = num1 * num2;
            System.out.println("the result is : " + result);
        }
        else if (calc == 4) {
            System.out.println("enter the first number");
            num1 = read.nextDouble();
            System.out.println("enter the second number");
            num2 = read.nextDouble();
            result = num1 / num2;
            System.out.println("the result is : " + result);
        }
        else {
            System.out.println("try again");
        }
    }
}
