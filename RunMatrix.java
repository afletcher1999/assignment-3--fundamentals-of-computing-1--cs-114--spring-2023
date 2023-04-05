import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter matrix size: ");
    int size = scanner.nextInt();

     // Step 2: Create a matrix of 0's and print it
    Matrix matrix = new Matrix(size);
    System.out.println("Matrix of 0's:");
    matrix.printMatrix();


    matrix.populateMatrix();

    System.out.println("Populated matrix:");
    matrix.printMatrix();

    System.out.println("\nFlipped matrix:");
    matrix.flipMatrix();
    matrix.printMatrix();

    scanner.close();
  }
}
