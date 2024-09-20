public class DoubleDimensionArray {
    private int[][] array;
    private int rows;
    private int cols;
    public DoubleDimensionArray(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.array = new int[rows][cols];

    }

    //insert an element at a specific position
    public void insert(int row, int col, int value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            array[row][col] = value;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    //traverse the array
    public void traverse() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // search for an element
    public boolean search(int value) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    // delete an element at a specific index
    public void delete(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            array[row][col] = 0; 
        } else {
            System.out.println("Index out of bounds");
        }
    }
 }