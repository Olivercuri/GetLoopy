public class Task6 {
    public static void main(String[] args) {

        // Task 6: Decreasing star triangle
        for (int row = 5; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
