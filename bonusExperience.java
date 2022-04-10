import java.util.Scanner;

public class bonusExperience {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double experience = scanner.nextDouble();
        double salary = scanner.nextDouble();
        double bonus = 0;


        if (experience > 5 && experience <= 7) {
            bonus = salary * 0.05;
        } else if (experience >= 7 && experience <= 15) {
            bonus = salary * 0.07;
        } else if (experience >= 15) {
            bonus = salary * 0.1;
        }
        System.out.println(bonus);
    }
}
