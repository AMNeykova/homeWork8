import java.util.Scanner;

public class figureRecognition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();


        if (sideA == sideB) {
            System.out.println("The figure is a square.");
            int figureSquareS = (sideA*sideB);
            System.out.println("Square S =" + figureSquareS);
            int figureSquareP = (4*sideA);
            System.out.println("Square P = "+figureSquareP);

        }else if (sideA!=sideB){
            System.out.println("The figure is a rectangle.");
            int figureRectangleS = (sideA*sideB);
            System.out.println("Rectangle S =" + figureRectangleS);
            int figureRectangleP = 2*(sideB+sideA);
            System.out.println("Rectangle P =" +figureRectangleP);
        }

    }
}
