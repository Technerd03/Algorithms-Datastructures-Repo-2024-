import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MovieTheater {
    private final int rows;
    private final int cols;
    private final boolean[][] seatingChart;


    public MovieTheater(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.seatingChart = new boolean[rows][cols]; // false means available, true means reserved
    }


    public void displaySeatingChart() {
        System.out.println("Seating Chart:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(seatingChart[i][j] ? "[X]" : "[ ]");
            }
            System.out.println();
        }
    }


    public boolean reserveSeat(int row, int col) {
        if (isValidSeat(row, col) && !seatingChart[row][col]) {
            seatingChart[row][col] = true;
            return true;
        }
        return false; 
    }


    public boolean cancelSeat(int row, int col) {
        if (isValidSeat(row, col) && seatingChart[row][col]) {
            seatingChart[row][col] = false;
            return true;
        }
        return false; 
    }

    private boolean isValidSeat(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieTheater theater = new MovieTheater(5, 5); // 5x5 seating chart

        while (true) {
            System.out.println("\n1. Reserve Seat\n2. Cancel Seat\n3. View Seating Chart\n4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter row (0-4): ");
                    int reserveRow = scanner.nextInt();
                    System.out.print("Enter column (0-4): ");
                    int reserveCol = scanner.nextInt();
                    if (theater.reserveSeat(reserveRow, reserveCol)) {
                        System.out.println("Seat reserved successfully.");
                    } else {
                        System.out.println("Failed to reserve seat. It may be already reserved or invalid.");
                    }
                    break;

                case 2:
                    System.out.print("Enter row (0-4): ");
                    int cancelRow = scanner.nextInt();
                    System.out.print("Enter column (0-4): ");
                    int cancelCol = scanner.nextInt();
                    if (theater.cancelSeat(cancelRow, cancelCol)) {
                        System.out.println("Seat reservation canceled successfully.");
                    } else {
                        System.out.println("Failed to cancel seat reservation. It may not be reserved or invalid.");
                    }
                    break;

                case 3:
                    theater.displaySeatingChart();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
