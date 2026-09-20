public class InvertedRightAngleTriangle {
    public static void main(String[] args) {
        int n = 5; // You can change this value to create a triangle with a different size

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
