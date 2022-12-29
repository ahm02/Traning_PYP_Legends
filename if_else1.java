import java.util.Scanner;

public class if_else1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("enter the number of the subject ");
        System.out.println("1- MATH");
        System.out.println("2- PHYSICS");
        System.out.println("3- JAVA");

        int subject = read.nextInt();
        System.out.println("enter your mark ");

        double grade = read.nextDouble();

        if (grade >= 95) {
            System.out.println("A+");
        }
        else if (grade >= 90) {
            System.out.println("A");
        }
        else if (grade >= 85) {
            System.out.println("B+");
        }
        else if (grade >= 80) {
            System.out.println("B");
        }
        else if (grade >= 75) {
            System.out.println("C+");
        }
        else if (grade >= 70) {
            System.out.println("C");
        }
        else if (grade >= 65) {
            System.out.println("D+");
        }
        else if (grade >= 59.01) {
            System.out.println("D");
        }
        else if (grade <=59) {
            System.out.println("F");
        }

    }
}
