public class SubArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 3;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i + 1; j < arr.length; j++) {
                int end = j;
                for (int x = start; x < end; x++) {
                    System.out.print(arr[x] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
