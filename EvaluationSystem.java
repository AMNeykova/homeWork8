import java.util.Scanner;

public class EvaluationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade;
        System.out.println("Enter a grade:");
        grade = scanner.nextInt();

        if (grade < 25) {
            System.out.println("F");
        } else if(grade >25 && grade <45) {
            System.out.println("E");
        } else if(grade >45 && grade <50) {
            System.out.println("D");
        } else if(grade >50 && grade <60) {
            System.out.println("C");
        } else if(grade >60 && grade <80) {
            System.out.println("B");
        } else if (grade >80) {
            System.out.println("A");
        }

    }
}
