import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of four Subject out of 100  :");
        int English = sc.nextInt();
        int Maths = sc.nextInt();
        int Physics = sc.nextInt();
        int Chemistry = sc.nextInt();
        int total = English + Maths + Physics + Chemistry;
        float percentage = total / 4;
        System.out.println("Total :" + total);
        System.out.println(" Percentage :" + percentage);
        if (percentage >= 90) {
            System.out.println(" Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >=40) {
            System.out.println("Grade E");
         } else {
            System.out.println("Fail");
        }

    }

}
