public class Matrix {
  private int[][] matrix;
  private int size;

  public Matrix(int size) {
    this.size = size;
    matrix = new int[size][size];

    System.out.printf("Created %dx%d matrix.\n", size, size);
  }

  private void swap(int x1, int y1, int x2, int y2) {
    if (x1 + y1 == size - 1 || x2 + y2 == size - 1) { //Finds the index elements of the diagonal
      return; // do not swap elements on the diagonal
    }
    int temp = matrix[x1][y1]; //Swaps the elements
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temp;
  }

  public void printMatrix() {
    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        if (row + col == size - 1) {
          System.out.print("\u001B[33m"); // set background color to yellow using ANSI escape code
        }
        System.out.printf("%-4d", matrix[row][col]);
        System.out.print("\u001B[0m"); // reset background color
      }
    System.out.println();
    }
  }

  public void populateMatrix() {
    int counter = 1;
    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
          matrix[row][col] = counter++;
      }
    }
  }

  public void flipMatrix() {
    for (int row = 0; row < size; row++) {
      for (int col = 0; col < size - row - 1; col++) {
        swap(row, col, size - col - 1, size - row - 1);
      }
    }
  }
}
