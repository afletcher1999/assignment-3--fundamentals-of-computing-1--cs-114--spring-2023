import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter a positive matrix size: ");
    int size = scanner.nextInt();

    Matrix matrix = new Matrix(size);
    System.out.println("Matrix of 0's:");
    matrix.printMatrix();


    matrix.populateMatrix();
    System.out.println("\nPopulated matrix:");
    matrix.printMatrix();

    System.out.println("\nFlipped matrix:");
    matrix.flipMatrix();
    matrix.printMatrix();

    scanner.close();
  }
}
