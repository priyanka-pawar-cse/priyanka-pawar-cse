public class LinearSearch {
    public static void main(String[] args) {
        // Sample Array
        int[] numbers = {10, 25, 30, 45, 50};
        int target = 30; // शोधायचा नंबर
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("✅ Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Element not found in the array.");
        }
    }
}
